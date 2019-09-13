
/**
 * Write a description of class Exercise6 here.
 *
 * @author (jani iresha)
 * @version (09/1/2019)
 */
import java.util.Scanner;
public class Exercise7
{
    public static boolean isGreaterThan(int num1){
    if(num1>0){
        return true;
    }else{
        return false;
    }
}
 public static void main(String[]args){
     Scanner reader = new Scanner(System.in);
     System.out.println("Enter num 1");
    int num1 = reader.nextInt();
    boolean result = isGreaterThan(3);
    System.out.println(result);
    
        
    
   
    
    
    
    




   }


}
