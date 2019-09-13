
/**
 * Write a description of class distance here.
 *
 * @author (Jani Iresha)
 * @version (16/01/2019)
 */


        
  
    
    
import java.util. Scanner;
public class Distance
{
    public static  double CalculateDistance(double point1x,double point1y,double point2x,double point2y){
        double a = point2x - point1x;
        double b = point2y - point1y;
        double a2 = Math.pow(a,2);
        double b2 =Math.pow(b,2);
        double c =Math.sqrt(a2+b2);
        
        return c;
    }
    
    
    
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Get a number for 1x");
        double point1x = reader.nextInt();
        System.out.println("Get a number for 1y");
        double point1y = reader.nextInt();
        System.out.println("Get a number for 2x");
        double point2x = reader.nextInt();
        System.out.println("Get a number for 2y");
        double point2y = reader.nextInt();
        
        double result = CalculateDistance(point1x,point2x,point1y,point2y);
        System.out.println(result);
        
        
        
    
    
    
    }
        
        
    
    
    
    
    
    
    
    













}




    