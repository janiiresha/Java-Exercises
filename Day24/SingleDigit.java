
/**
 * Write a description of class SingleDigit here.
 *
 * @author (Jani Iresha)
 * @version (16/1/2019)
 */

import java.util. Scanner;
public class SingleDigit
{
    public static boolean isSingleDigit(int num){
        
        if(num < 10 && num > -10){
        return true;
    }else{
        return false;
    }}
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Get a number");
        int num = reader.nextInt();
    boolean result = isSingleDigit(num);
    System.out.println(result);
    
}
    
    
    
    
    
}
    
  