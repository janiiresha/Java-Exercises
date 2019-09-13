import java.util.Scanner;
public class Exercise4{
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);
        double angle,sin,cos,tan;
        
        System.out.println("Type a　number to calculate");
        
        angle = reader.nextDouble();
        
        sin= Math.sin(angle);
        cos= Math.cos(angle);
        tan= Math.tan(angle);
        
        System.out.printf("squreroot of %f is sin %.2f cos %.2f tan %.2f",angle,sin,cos,tan);
        
        
    
    
    }
}