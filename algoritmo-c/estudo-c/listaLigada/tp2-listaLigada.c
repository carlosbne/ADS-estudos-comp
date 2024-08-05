#include <stdio.h>
#include <stdlib.h>

struct ListaNumero {
    int numero;
    struct ListaNumero *proximo;
};

struct ListaNumero *inicio;

//função para inserir o número no inicio
int inserirInicio(int numero) {
  struct ListaNumero *novo;
  int retorno = 1;
  novo = (struct ListaNumero *)malloc(sizeof(struct ListaNumero));
  novo->numero = numero;
  novo->proximo = inicio;
  inicio = novo;
  return retorno;
};

//função para inserir no Fim
int inserirFim(int numero) {
  struct ListaNumero *novo, *ultimo;
  int retorno = 1;
  novo = (struct ListaNumero *)malloc(sizeof(struct ListaNumero));
  if (novo == NULL) { /* Verifica se a memória foi alocada */
    retorno = -1;
  } else {
    novo->numero = numero;
    novo->proximo = NULL; /* O novo é o fim da lista */
    if (inicio == NULL) { /* Se a lista estiver vazia */
      inicio = novo;      /* o novo será o único elemento da lista */
    } else {              /* Se ja houver elementos na lista */
      /* Percorre a lista para encontrar o último elemento */
      ultimo = inicio;
      while (ultimo->proximo != NULL)
        ultimo = ultimo->proximo;
      ultimo->proximo = novo; /* Atualiza referência do último */
    }
  }
  return retorno;
}

//Função para remover do inicio
int removeInicio() {
  struct ListaNumero *velho;
  int retorno = 1;
  velho = inicio;
  if (velho == NULL) {
    retorno = -1;
  } else {
    inicio = inicio->proximo;
    free(velho);
  }
  return retorno;
}

//Função para remover do fim
int removeFim(){
    struct ListaNumero *atual, *anterior;
    int retorno = 1;
    if (inicio == NULL) {
    retorno = -1; //lista vazia
    }else if(inicio->proximo == NULL){ //há apenas um elemento
        free(inicio);
        inicio = NULL;
        return retorno;
    }

    while(atual->proximo->proximo != NULL){ //encontra o penultimo
        atual = atual->proximo;
    }

    free(atual->proximo);//remove o último
    atual->proximo = NULL;
    return retorno;
}

//Função para buscar um número
int buscaNumero(int numero) {
  struct ListaNumero *atual;
  int retorno = -1;
  atual = inicio;
  while (atual != NULL) {
    if (atual->numero == numero) {
      retorno = 1;
      break;
    }
    atual = atual->proximo;
  }
  return retorno;
}

// Função para listar os elementos da lista
void listarElementos() {
    struct ListaNumero *atual;
    atual = inicio;
    if (atual == NULL) {
        printf("A lista está vazia.\n");
    } else {
        printf("Elementos da lista:\n");
        while (atual != NULL) {
            printf("%d\n", atual->numero);
            atual = atual->proximo;
        }
    }
}


int main() {
    int opcao, numero, resultado;

    do {
        printf("MENU:\n");
        printf("0 - SAIR\n");
        printf("1 - LISTAR ELEMENTOS DA LISTA\n");
        printf("2 - INSERIR NO INÍCIO\n");
        printf("3 - INSERIR NO FIM\n");
        printf("4 - REMOVER DO INÍCIO\n");
        printf("5 - REMOVER DO FIM\n");
        printf("6 - BUSCAR ELEMENTO\n");
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
                resultado = inserirInicio(numero);
                if (resultado == 1) {
                    printf("Numero inserido no inicio com sucesso.\n");
                } else {
                    printf("Erro ao inserir numero no inicio.\n");
                }
                break;
            case 3:
                printf("Digite o numero a ser inserido no fim: ");
                scanf("%d", &numero);
                resultado = inserirFim(numero);
                if (resultado == 1) {
                    printf("Numero inserido no fim com sucesso.\n");
                } else {
                    printf("Erro ao inserir numero no fim.\n");
                }
                break;
            case 4:
                resultado = removeInicio();
                if (resultado == 1) {
                    printf("Numero removido do inicio com sucesso.\n");
                } else {
                    printf("Erro ao remover numero do inicio.\n");
                }
                break;
            case 5:
                resultado = removeFim();
                if (resultado == 1) {
                    printf("Numero removido do fim com sucesso.\n");
                } else {
                    printf("Erro ao remover numero do fim.\n");
                }
                break;
            case 6:
                printf("Digite o numero a ser buscado: ");
                scanf("%d", &numero);
                resultado = buscaNumero(numero);
                if (resultado == 1) {
                    printf("Numero encontrado na lista.\n");
                } else {
                    printf("Numero nao encontrado na lista.\n");
                }
                break;
            default:
                printf("Opcao invalida.\n");
        }
    } while (opcao != 0);

    return 0;
}