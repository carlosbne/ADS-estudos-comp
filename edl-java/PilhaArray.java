public class PilhaArray implements Pilha{
    private int capacidade;
    private Object[] a;
    private int tv;
    private int tp;
    public PilhaArray(int capacidade){
        this.capacidade = capacidade;
        a = new Object[capacidade];
        tv = -1;
        tp = capacidade;
    }

    public void pushPilhaVermelha(Object o){
        if(tv + 1 == tp){
            capacidade *= 2;
             
            Object b[] = new Object[capacidade];
            for(int f=0; f<a.length; f++)
                b[f]=a[f];
            a = b;
        }
        a[++tv] = o;
    }

    public void pushPilhaPreta(Object o){
        if(tp - 1 == tv){
            capacidade *= 2;
            
            Object b[] = new Object[capacidade];
            for(int f=b.length-1; f>tp; f--)
                b[f]=a[f];
            a = b;
        }
        a[--tp] = o;
    }

    
    public void mudarTamanho(){
        int novaCapacidade = capacidade * 2;
        Object b[] = new Object[novaCapacidade];

        //copia pilha vermelha a partir do inicio
        for(int f = 0; f < tv; f++)
            b[f]=a[f];


        int qtdPretos = capacidade - tp;
        int novotp = novaCapacidade - qtdPretos;

        //copa a pilha preta alocando ao final do array
        for(int i = 0; i < qtdPretos; i++){
            b[novotp + i] = a[tp + i];
        }
    }


    public boolean isEmpty(){
        return t == -1;
    }

    public int size(){
        return t + 1;
    }


    public Object pop()throws PilhaVaziaExcecao{
        if(isEmpty())
            throw new PilhaVaziaExcecao("A Pilha está vazia");
        Object r = a[t--];
        return r;
    }

    public Object top()throws PilhaVaziaExcecao{
        if(isEmpty())
            throw new PilhaVaziaExcecao("A Pilha está vazia");
        return a[t];
    }

}