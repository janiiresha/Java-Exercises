/**
 * Day : 21
 * Exercise : 4
 * Chapter : 5
 * Book: Think Java
 *
 * @author (Jani Iresha)
 * @version (12/12/2018)
 */



import java.util.Scanner;
public class Exe4{
    public static void checkFermet(int a,int b,int c,int n){
  
 
    
   if(((Math.pow(a,n))+(Math.pow(b,n)))==  ((Math.pow(c,n))) && ((n>2) )) {
      System.out.println("Holy smokes Fermat was wrong");
    }else{
        System.out.println("No,that doesn't work");
    }
}
    
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a value for a");
        int a = reader.nextInt();
        System.out.println("Type a value for b");
        int b = reader.nextInt();
        System.out.println("Type a value for c");
        int c = reader.nextInt();
        System.out.println("Type a value for n ");
        int n = reader.nextInt();
        
        checkFermet(a,b,c,n);
    }
        
    
  
} 
