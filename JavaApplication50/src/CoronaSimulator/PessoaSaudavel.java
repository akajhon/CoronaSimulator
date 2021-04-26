package CoronaSimulator;

import java.util.Random;
/**
 * Classe para objetos do tipo PessoaSaudavel.
 * @author João Pedro Rosa Cezarino (22.120.021 - 5)
 * @version 1.0
 */

public class PessoaSaudavel extends Pessoa implements IMovable {
    public boolean vacinada = false;
    public PessoaSaudavel() {
    }

    public PessoaSaudavel(boolean vacinada, int x, int y, int cor) {
        super(x, y, cor);
        this.vacinada = vacinada;
    }

    public boolean isVacinada() {
        return vacinada;
    }

    public void setVacinada(boolean vacinada) {
        this.vacinada = vacinada;
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
