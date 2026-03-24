public class duasPilhasUmArray {
    
    public static void main(String[] args){
        /* Integer[] b = new Integer[1]; */
        PilhaArray pp = new PilhaArray( 5);
        System.out.println("inserindo");
        for(int f=0; f<15; f++){
            System.out.println(f);
            pp.pushPilhaVermelha(f);
        }
        System.out.println("retirando");
        for(int f=0; f<10; f++){
            System.out.print(f);
            System.out.println(" - " + pp.pop());
        }
        System.out.println("tamanho: " + pp.size());
        System.out.println("topo: " + pp.top());
    }
}