package CoronaSimulator;
/**
 * Classe para objetos do tipo PessoaDoente.
 * @author João Pedro Rosa Cezarino (22.120.021 - 5)
 * @version 1.0
 */

public class Virus {
    private int contTime;

    public Virus() {
    }

    public Virus(int contTime) {
        this.contTime = contTime;
    }

    public int getContTime() {
        return contTime;
    }

    public void setContTime(int contTime) {
        this.contTime = contTime;
    }
   
}
