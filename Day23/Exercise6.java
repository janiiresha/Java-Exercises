
/**
 * Write a description of class Exercise6 here.
 *
 * @author (jani iresha)
 * @version (09/1/2019)
 */
import java.util.Scanner;
public class Exercise6
{
    public static boolean isLessThan(int num1, int num2){
    if(num1<num2){
        return true;
    }else{
        return false;
    }
}
 public static void main(String[]args){
     Scanner reader = new Scanner(System.in);
    
        System.out.println("Enter num 1");
    int num1 = reader.nextInt();
    System.out.println("Enter num 2");
    int num2 = reader.nextInt();
    boolean result = isLessThan(num1,num2);
    System.out.println(result);
    
    




   }


}

    