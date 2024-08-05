#include <stdio.h>
#include <stdlib.h>

struct ListaNumero{
    int numero;
    struct ListaNumero *proximo;
};

int main(){
    struct ListaNumero *inicio = 0;
    inicio = (struct ListaNumero*) malloc(sizeof(struct ListaNumero));
    inicio->numero = 5;
    inicio->proximo = 0;
    inicio->proximo = (struct ListaNumero*) malloc(sizeof(struct ListaNumero));
    inicio->proximo->numero = 8;
    inicio->proximo->proximo = 0;

    printf("Valor em inicio    : %d\n", inicio->numero);
    printf("Inicio aponta para : %p\n", inicio->proximo);
    printf("Valor em segundo : %d\n", inicio->proximo->numero);
     printf("segundo aponta para : %p\n", inicio->proximo->proximo);

    return 0;
}