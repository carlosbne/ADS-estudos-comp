public class duasPilhasUmArray {
    
    public static void main(String[] args){
        /* Integer[] b = new Integer[1]; */
        PilhasDuplas pp = new PilhasDuplas( 1);
        System.out.println("inserindo");

        pp.pushPilhaVermelha(62);
        pp.mostrar();
        pp.pushPilhaVermelha(61);
        pp.pushPilhaVermelha(63);
        pp.pushPilhaVermelha(60);
        pp.mostrar();

        pp.pushPilhaPreta(5);
        pp.mostrar();
        pp.pushPilhaPreta(4);
        pp.pushPilhaPreta(3);
        pp.mostrar();
        pp.pushPilhaPreta(2);
        pp.pushPilhaPreta(1);
        pp.mostrar();

       


        /* for(int f=0; f<15; f++){
            System.out.println(f);
            pp.pushPilhaVermelha(f);
        } */
      /*   System.out.println("retirando");
        for(int f=0; f<10; f++){
            System.out.print(f);
            System.out.println(" - " + pp.pop());
        }
        System.out.println("tamanho: " + pp.size());
        System.out.println("topo: " + pp.top());*/
    } 
}