from pygments import highlight
from pygments.lexers import JavaLexer
from pygments.formatters import HtmlFormatter
from weasyprint import HTML
import sys

# Ler arquivo Java
with open(sys.argv[1], 'r', encoding='utf-8') as f:
    code = f.read()

# Gerar HTML com destaque de sintaxe
lexer = JavaLexer()
formatter = HtmlFormatter(style='friendly', linenos=True, full=True, title=sys.argv[1])
html = highlight(code, lexer, formatter)

# Salvar HTML e converter para PDF
with open('temp.html', 'w', encoding='utf-8') as f:
    f.write(html)

HTML('temp.html').write_pdf(sys.argv[2] if len(sys.argv) > 2 else 'output.pdf')
print(f"PDF gerado com sucesso!")
