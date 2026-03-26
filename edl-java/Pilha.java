public interface Pilha{
    /* public int size();
    public boolean isEmpty();
    public Object top() throws PilhaVaziaExcecao; */
    public void pushPilhaVermelha(Object o);
    public void pushPilhaPreta(Object o);
    public void atualizarTamanhoArray();
    //public Object pop() throws PilhaVaziaExcecao;
}