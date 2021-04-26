package CoronaSimulator;

/**
 * Classe para objetos do tipo Hospital.
 * @author João Pedro Rosa Cezarino (22.120.021 - 5)
 * @version 1.0
 */

public class Hospital {
    private int cor;

    public Hospital() {
    }

    public Hospital(int cor) {
        this.cor = cor;
    }

    public int getCor() {
        return cor;
    }

    public void setCor(int cor) {
        this.cor = cor;
    }
}
