import java.util.Scanner;
public class PI{
    public static void main(String[]args){
        
        Scanner reader = new Scanner(System.in);
        
        double radius,circumference;
        
        System.out.println("type a value");
        radius = reader.nextDouble();
        circumference = Math.PI*radius*2;
        
        System.out.printf("Circumference of the circle is %.1f",circumference);
    
    
    
    
    
    }



}