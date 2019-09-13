import java.util.Scanner;
public class Exercise1{
    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);
        
        //ask for a float number in CM
        System.out.println("What is the number you want to convert it to Inches?");
        //Save user input in variable called NumberInCM
        double NumberInCM = reader.nextFloat();
        //create constant CM_IN_INCH
        final double CM_IN_INCH = 2.54;
        //print
        System.out.printf(NumberInCM  + " is %.2f " ,NumberInCM/CM_IN_INCH);
        
    
    
    
    }





}