
public class Main {
  public static void main(String[] args) {
  
    Academia aca1 = new Academia("Academia 1", "Rua 1");  
    Esporte esp1 = new Esporte("Futebol", "10:00 às 18:00", 50.0);
    Esporte esp2 = new Esporte("Natação", "9:00 às 17:00", 20.90);
    Esporte esp3 = new Esporte("Vôlei", "8:00 às 16:00", 30.50);
    Esporte esp4 = new Esporte("Karatê", "15:00 às 18:00", 50.0);

    aca1.inserirEsporte(esp1);
    aca1.inserirEsporte(esp2);
    aca1.inserirEsporte(esp4);

    System.out.println(aca1.listar());

    System.out.println("\n\n");
    System.out.println(aca1.mediaMensalidade());
    
  }  
}