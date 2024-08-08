import java.util.ArrayList;
import java.util.List;

/**
 * Time
 */
public class Time {
    private String nome;
    private String estado;
    private List<Jogador> jogadores;

    public Time(String nome, String estado) {
        this.nome = nome;
        this.estado = estado;
        this.jogadores = new ArrayList<Jogador>();
    }

    // getters
    public List<Jogador> listar() {
        return jogadores;
    }

    public Jogador getArtilheiro() {
        if (jogadores.isEmpty()) {
            return null;
        }
        Jogador artilheiro = jogadores.get(0);
        for (Jogador jogador : jogadores) {
            if (jogador.getGols() > artilheiro.getGols()) {
                artilheiro = jogador;
            }
        }
        return artilheiro;
    }

    // setters
    public void inserirJogador(Jogador jogador) {
        jogadores.add(jogador);
    }

    @Override
    public String toString() {
        return "Time{" +
                "nome = '" + nome + '\'' +
                ", estado = " + estado +
                ", jogadores = " + jogadores +
                '}';
    }
}