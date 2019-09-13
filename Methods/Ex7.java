import java.util.Scanner;
public class Ex7{
    public static void main(String[]args){
        
        Scanner reader = new Scanner(System.in);
        
        double radius ,area;
        
        System.out.println("Type a value");
        radius = reader.nextDouble();
        area = Math.PI*(Math.pow(2,radius));
        
        System.out.printf("area of the circle is %.1f",area);
        
        
    
    
    
    }



}