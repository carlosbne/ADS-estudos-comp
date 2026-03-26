public class PilhasDuplas implements Pilha{
    private int capacidade;
    private Object[] array;
    private int temporariaVermelho; //temporaria topo da pilha vermelha
    private int temporariaPreto; //temporaria topo pilha preta

    //construtor
    public PilhasDuplas(int capacidade){
        this.capacidade = capacidade;
        array = new Object[capacidade];
        temporariaVermelho = -1; //pilha vermelha começa no inicio
        temporariaPreto = capacidade; //pilha preta começa no final
    }

    //metodos para verificar se as pilhas estão vazias
    public boolean vermelhaVazia(){
        return temporariaVermelho == -1;
    }
    public boolean pretaVazia(){
        return temporariaPreto == capacidade;
    }

    //metodos pra verificar se estão cheias
    private boolean estaCheio(){
        return temporariaVermelho +1 == temporariaPreto;
    }

    //metodo pra atualizar o tamanho do array 
    public void atualizarTamanhoArray(){
        int novaCapacidade = capacidade * 2;
        Object b[] = new Object[novaCapacidade];

        //copia pilha vermelha a partir do inicio
        for(int f = 0; f < temporariaVermelho; f++)
            b[f]=array[f];


        int qtdPretos = capacidade - temporariaPreto; //confere a quantidade de items pretos no array original
        int novoTP = novaCapacidade - qtdPretos; //define a nota variavel temporaria da pilha preta
        //copa a pilha preta alocando ao final do array
        for(int i = 0; i < qtdPretos; i++){
            b[novoTP + i] = array[temporariaPreto + i];
        }

        this.array = b;
        this.temporariaPreto = novoTP;
        this.capacidade = novaCapacidade;
    }


    public void pushPilhaVermelha(Object o){
        // confere se a pilha vermelha bate na preta
        if(temporariaVermelho + 1 == temporariaPreto || temporariaVermelho >= capacidade){
            //atualizar tamanho array
            atualizarTamanhoArray();
        }
        array[++temporariaVermelho] = o;
    }

    public void pushPilhaPreta(Object o){
        //confere se a pilha preta bate na vermelha
        if(temporariaPreto - 1 == temporariaVermelho){
           //atualiza tamanho array
           atualizarTamanhoArray();
        }
        array[--temporariaPreto] = o;
    }
    
    
    // verifica a quantidade de elementos na pilha
    private int getTotalElementos() {
        return (temporariaVermelho + 1) + (capacidade - temporariaPreto);
    }

    public void mostrar(){
        System.out.println("Capacidade: " + capacidade);
        System.out.println("Total elementos: " + getTotalElementos());
        System.out.println("Pilha Vermelha: " + toStringVermelha());
        System.out.println("Pilha Preta: " + toStringPreta());
        System.out.println("Array completo: " + java.util.Arrays.toString(array));
        System.out.println("---");
    }

    // Converte a pilha vermelha para string
    public String toStringVermelha() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i <= temporariaVermelho; i++) {
            if (i > 0) sb.append(", ");
            sb.append(array[i]);
        }
        sb.append("]");
        return sb.toString();
    }
    
    // Converte a pilha preta para string
    public String toStringPreta() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = capacidade - 1; i >= temporariaPreto; i--) {
            if (i < capacidade - 1) sb.append(", ");
            sb.append(array[i]);
        }
        sb.append("]");
        return sb.toString();
    }

/*     public boolean isEmpty(){
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
    }*/

} 