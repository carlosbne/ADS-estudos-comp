#include <stdio.h>
#include <stdlib.h>

struct ListaCircular {
  int numero;
  struct ListaCircular *proximo;
};

struct ListaCircular *inicio = NULL;

// Função para inserir numero
int inserirListaInicio(numero) {
  struct ListaCircular *novo;
  novo = (struct ListaCircular *)malloc(sizeof(struct ListaCircular));
  if (novo) {
    novo->numero = numero;
    novo->proximo = inicio;

    if (inicio == NULL) {
      inicio = novo;
      novo->proximo = inicio;
    } else {
      struct ListaCircular *fim = inicio;
      while (fim->proximo != inicio) {
        fim = fim->proximo;
      }
      fim->proximo = novo;
      inicio = novo;
    }
  } else {
    printf("Erro ao tentar alocar memoria\n");
  }
}

// Função para listar numeros
void listarElementos() {
  struct ListaCircular *atual = inicio;
  if (atual == NULL) {
    printf("A lista está vazia.\n");
  } else {
    printf("Elemetos da lista: \n");
    do {
      printf("%d \n", atual->numero);
      atual = atual->proximo;
    } while (atual != inicio);
  }
}

int main() {
  int opcao, numero, resultado;
  do {
    printf("MENU:\n");
    printf("0 - SAIR\n");
    printf("1 - LISTAR ELEMENTOS DA LISTA\n");
    printf("2 - INSERIR NA LISTA CIRCULAR\n");
    printf("Escolha uma opcao: ");
    scanf("%d", &opcao);

    switch (opcao) {
    case 0:
      printf("Saindo...\n");
      break;
    case 1:
      listarElementos();
      break;
    case 2:
      printf("Digite o numero a ser inserido no inicio: ");
      scanf("%d", &numero);
      resultado = inserirListaInicio(numero);
      if (resultado == 1) {
        printf("Numero inserido na posição correta com sucesso.\n");
      } else {
        printf("Erro ao inserir numero na posição correta.\n");
      }
      break;
    default:
      printf("Opcao invalida.\n");
    }
  } while (opcao != 0);

  return 0;
}