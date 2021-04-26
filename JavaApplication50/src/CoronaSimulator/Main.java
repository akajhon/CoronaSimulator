package CoronaSimulator;

/**
 * Main.
 * @author João Pedro Rosa Cezarino (22.120.021 - 5)
 * @version 1.0
 */
public class Main {
    
    public static void main(String[] args) {
        Mundo m = new Mundo();
        while(true){
            m.desenhaMundo();
            try{
                Thread.sleep(500);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    }
    

