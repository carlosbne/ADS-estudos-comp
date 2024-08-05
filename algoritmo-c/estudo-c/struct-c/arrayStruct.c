#include <stdio.h>

struct aluno{
    long long matricula;
    int notas[10];
    int pesos[10];
    int qtd_notas;
};

void ler_dados(int qtd, struct aluno *alunos){
    int i, j;
    for(i = 0; i < qtd; ++i){
        scanf("%lld", &alunos[i].matricula);
        scanf("%d", &alunos[i].qtd_notas);
        for(j = 0; j < alunos[i].qtd_notas; ++j){
            scanf("%d %d", &alunos[i].notas[j], &alunos[i].pesos[j]);}
    }
}

void mostra_dados(int qtd, struct aluno *alunos){
    int i, j;
    for(i = 0; i < qtd; ++i){
        printf("%lld ", alunos[i].matricula);
        printf("%d = { ", alunos[i].qtd_notas);
        for(j = 0; j < alunos[i].qtd_notas; ++j){
            printf("(%d %d) ", alunos[i].notas[j], alunos[i].pesos[j]);}
        printf("}\n");
    }
}

int media_aluno(struct aluno al){
    int i, soma_notas=0, soma_pesos=0;
    for(i=0; i<al.qtd_notas; ++i){
        soma_notas += al.notas[i]*al.pesos[i];
        soma_pesos += al.pesos[i];
    }
    return soma_notas/soma_pesos;
} 

int calcula_media_turma(int qtd, struct aluno alunos[]){
    int i, media_turma=0, soma_notas=0;
    for(i = 0; i<qtd; ++i){
         soma_notas+=media_aluno(alunos[i]);
    }
    media_turma = soma_notas/qtd;
    return media_turma;
}

int main(){
    int qtd_alunos;
    scanf("%d", &qtd_alunos);
    struct aluno alunos[qtd_alunos];
    ler_dados(qtd_alunos, alunos);
    mostra_dados(qtd_alunos, alunos);
    int media_turma = calcula_media_turma(qtd_alunos, alunos);
    printf("Média da turma: %d\n", media_turma);

    return 0;
}