/**
 * Main class for DieCup.
 *
 * @author Nikolaj
 * @version 24-10-2019
 */
public class Main {

    public static void main(String[] args) {
        DieCup dc = new DieCup();

        int noOfRolls = 10;
        for(int i=0; i<noOfRolls; i++){
            dc.roll();
            System.out.println(i+" geteyes: "+dc.getEyes());
            System.out.println(i+" maxeyes: "+dc.getMaxEyes());
        }
    }
}
