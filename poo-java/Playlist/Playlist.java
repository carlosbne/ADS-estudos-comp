import java.util.ArrayList;
import java.util.List;

public @interface Timespan;

public class Playlist {
  private String nome;
  private String descricao;
  private List<Musica> musicas;

  public Playlist(String nome, String descricao) {
    this.nome = nome;
    this.descricao = descricao;
    this.musicas = new ArrayList<Musica>();
  }

  public void inserir(Musica musica) {
    musicas.add(musica);
  }

  public void listar(Musica musica) {
    for (Musica m : musicas) {
      System.out.println(m + " ,");
    }
  }
  public Timespan tempoTotal(){
    Timespan tempoTotal = new Timespan();
    for (Musica m : musicas) {
      tempoTotal.add(m.getDuracao());
    }
    return tempoTotal;
  }

  @Override
  public String toString(){
    return "Nome: " + this.nome + ", Descricao: " + this.descricao + ", Musicas: " + this.musicas;
  }
}