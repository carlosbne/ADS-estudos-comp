public class Esporte {
    private String nome;
    private String horarios;
    private double mensalidade;

    public Esporte(String nome, String horarios, double mensalidade) {
        this.nome = nome;
        this.horarios = horarios;
        this.mensalidade = mensalidade;
    }

    public double getMensalidade(){
        return mensalidade;
    }

    @Override
    public String toString() {
        return "Esporte{" +
                "nome = '" + nome + '\'' +
                ", horarios = " + horarios +
                ", mensalidade = " + mensalidade +
                '}';
    }
}
