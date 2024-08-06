#include <stdio.h>
#include <stdlib.h>

struct ListaCircular {
  int numero;
  struct ListaCircular *proximo;
};

struct ListaCircular *inicio = NULL;

// Função para inserir numero
int insereListaInicio(numero) {
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
    printf("Erro de alocação memoria!\n");
  }
}