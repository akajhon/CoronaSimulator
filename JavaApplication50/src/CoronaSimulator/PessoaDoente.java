package CoronaSimulator;

import java.util.Random;
/**
 * Classe para objetos do tipo PessoaDoente.
 * @author João Pedro Rosa Cezarino (22.120.021 - 5)
 * @version 1.0
 */

public class PessoaDoente extends Pessoa implements IMovable{
    public Virus covid;
    
    public PessoaDoente() {
    }

    public PessoaDoente(Virus Covid, int x, int y, int cor) {
        super(x, y, cor);
        this.covid = covid;
    }

    public Virus getCovid() {
        return covid;
    }

    public void setCovid(Virus covid) {
        this.covid = covid;
    }
    
    @Override
    public void mover() {
        Random random = new Random();
        int op = random.nextInt(3);
        int posY = getY() + 1;
        int posX = getX() + 1;
        
        switch (op) {
            case 0:
                setY(posY);
                break;
            case 1:
                setY(posY);
                break;
            case 2:
                setX(posX);
                break;
            case 3:
                setX(posX);
                break;
        }
    }
}
