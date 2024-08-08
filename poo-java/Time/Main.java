
/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
  
      Time time1 = new Time("Flamengo", "Rio de Janeiro");
      Time time2 = new Time("Vasco", "Rio de Janeiro");
  
      System.out.println(time1);
      Jogador j1 = new Jogador("Vlademir", "10", 21);
      Jogador j2 = new Jogador("Roger", "7", 34);
      Jogador j3 = new Jogador("Henrique", "2", 3);
      Jogador j4 = new Jogador("Felipe", "1", 1);
  
      time1.inserirJogador(j1);
      time1.inserirJogador(j2);
      time2.inserirJogador(j3);
      time2.inserirJogador(j4);
  
      System.out.println(time1.getArtilheiro());
      System.out.println(time1.listar());

    }
  }