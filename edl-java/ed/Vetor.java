package ed;

import java.util.Arrays;

public class Vetor {
    private Aluno[] alunos = new Aluno[10];
    private int totalDeAlunos = 0;

    

    private boolean posicaoValida(int posicao){
        return posicao >= 0 && posicao <=totalDeAlunos; 
    }

    private boolean posicaoOcupada(int posicao){
        return posicao >= 0 && posicao < totalDeAlunos;
    }

    public void adicionaQualquerPosicao(int posicao, Aluno aluno){

        if(!posicaoValida(posicao)){
            throw new IllegalArgumentException("Posição Invalida");
        }

        for(int i = totalDeAlunos - 1; i >= posicao; i--){
            alunos[i+1] = alunos[i];
        }

        alunos[posicao ] = aluno;
        totalDeAlunos++;
    }
   
    public void adiciona(Aluno aluno){
        // complexidade On, quanto maior mais devagar é 
        /* for(int i = 0; i < alunos.length; i++){
            if(alunos[i] == null){
                alunos[i] = aluno;
                break;
            }
        } */

        //complexidade O1, adiciona no tempo constante
        this.alunos[totalDeAlunos] = aluno;
        totalDeAlunos++; 
    }

    public Aluno pegaAluno(int posicao){
        if(!posicaoOcupada(posicao)){
            throw new IllegalArgumentException("Posição inválida");
        }
        return alunos[posicao];
    }

    public void remove(int posicao){

    }

    public boolean contem(Aluno aluno){

        //complexidade On, tempo varia dependendo da quantidade de elementos
        for(int i = 0; i < totalDeAlunos; i++){
            if(aluno.equals(alunos[i])){
                return true;
            }
        }
        return false;
    }

    public int tamanho(){
        return totalDeAlunos;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return Arrays.toString(alunos);
    }
}
