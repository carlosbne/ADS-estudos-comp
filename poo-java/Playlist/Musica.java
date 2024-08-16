import java.util.Date;

class Musica{
  private String titulo;
  private String artista;
  private String album;
  private Timespan duracao;
  private Date data;

  public Musica(String titulo, String artista, String album, int duracao, Date data){
    this.titulo = titulo;
    this.artista = artista;
    this.album = album;
    this.duracao = duracao;
    this.data = data;
  }

  public String getTitulo(){
    return this.titulo;
  }

  public String getArtista(){
    return this.artista;
  }

  public String getAlbum(){
    return this.album;
  }

  public int getDuracao(){
    return this.duracao;
  }

  public Date getData(){
    return this.data;
  }

  public void setTitulo(String titulo){
    this.titulo = titulo;
  }

  public void setArtista(String artista){
    this.artista = artista;
  }

  public void setAlbum(String album){
    this.album = album;
  }

  @Override
  public String toString(){
    return "Titulo: " + this.titulo + ", Artista: " + this.artista + ", Album: " + this.album + ", Duracao: " + this.duracao + ", Data: " + this.data;
  }
}