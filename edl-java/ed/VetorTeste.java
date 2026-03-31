package ed;

public class VetorTeste {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Joao");
        Aluno a2 = new Aluno("Jose");

        Vetor lista = new Vetor();
        
        System.out.println(lista.tamanho());
        lista.adiciona(a1);
        lista.adiciona(a2);

        System.out.println(lista);
        System.out.println(lista.tamanho());

        Aluno a3 = new Aluno("Danilo");
        System.out.println(lista.contem(a3));
        
        System.out.println(lista.pegaAluno( 1));

        lista.adicionaQualquerPosicao(1, a3);
        System.out.println(lista);

    }
}
