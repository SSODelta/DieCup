// import class for generation of random numbers
import java.util.Random;

/**
 * This class models a Die (terning)
 * 
 * @author Nikolaj
 * @version 2017-01-05
 */
public class Die {
    private Random random;   //used for generation of random numbers
    private int eyes;        //number of eyes shown

    public Die() {
        random = new Random();
    }

    public void roll() {
        eyes = random.nextInt(6) + 1;
    }

    public int getEyes() {
        return eyes;
    }
}
