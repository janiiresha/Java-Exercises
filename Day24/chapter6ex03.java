/**
 * Write a description of class SingleDigit here.
 *
 * @author (Jani Iresha)
 * @version (16/1/2019)
 */
import java.util.Scanner;
public class chapter6ex03{
 
    public static boolean isTriangle(int a, int b, int c){
    
       if( (a > (b+c))||( b>(a+c))||(c > (a+b))){
          return false;
 
     
        }else{
            return true;}
        }
        public static void main (String[]args){
            Scanner reader = new Scanner(System.in);
        System.out.println("Type a value a");
        int a = reader.nextInt();
    
        System.out.println("Type a value b");
        int b = reader.nextInt();
        System.out.println("Type a value c");
        int c = reader.nextInt();
       boolean result =isTriangle(a,b,c);
       System.out.println(result);
    }
    
}
        