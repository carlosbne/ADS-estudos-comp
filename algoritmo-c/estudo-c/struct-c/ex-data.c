#include <stdio.h>

struct data{
    short dia, mes;
    int ano;
};

int main(){
    struct data hoje, amanha;
    scanf("%hd %hd %d", &hoje.dia, &hoje.mes, &hoje.ano);
    printf("Hoje é %hd/%hd/%d\n", hoje.dia, hoje.mes, hoje.ano);
    amanha.ano = hoje.ano;
    amanha.mes = hoje.mes;
    amanha.dia = hoje.dia+1;
    printf("Amanhã é %hd/%hd/%d\n", amanha.dia, amanha.mes, amanha.ano);


    return 0;
}