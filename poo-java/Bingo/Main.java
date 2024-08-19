public class Main {
    public static void main(String[] args) {
      
        Bingo bingo = new Bingo();
        bingo.iniciar(20);

        for (int i = 0; i < 10; i++) {
            System.out.print(bingo.proximo() + " ");  
        }
        System.out.println("Bingo!");

        for (int bola : bingo.sorteados()) { 
            System.out.print(bola + ", ");
        }
    }
  
  }