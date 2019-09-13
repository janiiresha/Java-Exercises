
/**
 * Write a description of class Ex7 here.
 *
 * @author (Jani Iresha)
 * @version (19/12/2018)
 */
import java.util.Random;

    

public class GuessStarter {

    public static void main(String[]args){
        // pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println(number);
    }
}
