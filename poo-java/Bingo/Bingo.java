import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Bingo
 */
public class Bingo {
    private int numBolas;
    private List<Integer> bolas;
    Random rand = new Random();

    public Bingo() {
        this.bolas = new ArrayList<Integer>();
    }

    public void iniciar(int numBolas) {
        this.numBolas = numBolas;
        this.bolas.clear();
    }

    public int proximo() {
        if (bolas.size() == numBolas) {
            return -1;
        }
        int bolaSort = rand.nextInt(numBolas);
        bolas.add(bolaSort);
        return bolaSort;
    }

    public List<Integer> sorteados() {
        return this.bolas;
    }

}