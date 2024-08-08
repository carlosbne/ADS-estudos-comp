
import java.util.ArrayList;
import java.util.List;

public class Academia {
    private String nome;
    private String endereco;
    private List<Esporte> esportes;

    public Academia(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
        this.esportes = new ArrayList<Esporte>();
    }
    

    //getters
    public List<Esporte> listar() {
        return esportes;
    }
    
    public double mediaMensalidade(){
        if(esportes.isEmpty()){
            return 0.0;
        }
        int soma = 0;
        for(Esporte e : esportes){
            soma += e.getMensalidade();
        }
        return soma/esportes.size();
    }
    
    // setters
    public void inserirEsporte(Esporte esporte) {
        esportes.add(esporte);
    }



    @Override
        public String toString() {
            return "Academia{" +
                    "\n nome = '" + nome + '\'' +
                    "\n, endereço = " + endereco +
                    "\n, esportes disponíveis = " + esportes +
                    '}';
        }
    
}
