package CoronaSimulator;
/**
 * Classe para objetos do tipo Pessoa.
 * @author João Pedro Rosa Cezarino (22.120.021 - 5)
 * @version 1.0
 */
public abstract class Pessoa {
    private int x, y, cor;

    public Pessoa() {
    }

    public Pessoa(int x, int y, int cor) {
        this.x = x;
        this.y = y;
        this.cor = cor;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        switch (x) {
            case 60:
                this.x = 0;
                break;
            case -1:
                this.x = 59;
                break;
            default:
                this.x = x;
                break;
        }
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        switch (y) {
            case 30:
                this.y = 0;
                break;
            case -1:
                this.y = 29;
                break;
            default:
                this.y = y;
                break;
        }
    }

    public int getCor() {
        return cor;
    }

    public void setCor(int cor) {
        this.cor = cor;
    }
}
