/**
 * Jogador
 */
public class Jogador {
    private String nome;
    private String camisa;
    private int gols;

    public Jogador(String nome, String camisa, int gols) {
        this.nome = nome;
        this.camisa = camisa;
        this.gols = gols;
    }
    // getters
    public int getGols() {
        return gols;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "nome = '" + nome + '\'' +
                ", camisa = " + camisa +
                ", gols = " + gols +
                '}';
    }
}