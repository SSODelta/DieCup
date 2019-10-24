
/**
 * This class models a DieCup (raflebæger)
 * 
 * @author Nikolaj
 * @version 2017-05-01
 **/
public class DieCup {
    private Die d1;   //first die
    private Die d2;   //second die
    private int maxEyes; 
    
    public DieCup() {
        d1 = new Die();
        d2 = new Die();
    }
    
    public void roll() {
        d1.roll();
        d2.roll();
        if (getEyes() >  maxEyes){
            maxEyes = getEyes();
        }
    }
    
    public int getEyes() {
        return d1.getEyes() + d2.getEyes();
    }
    
    public int getMaxEyes(){
        return maxEyes;
    }
    
    public void resetMaxEyes(){
        maxEyes = 0;
    }
}

