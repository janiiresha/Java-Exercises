import java.util.Scanner;

public class InchesToCentimeters{
    public static void main(String[]args){
        
        //declare the variables
        int inch;
        double cm;
        //create a scanner variable called in that takes input from System.in
        Scanner in = new Scanner(System.in);
        
        //promt the user for the inpur
        System.out.println("How many inches? ");
        //use scanner method which reads input from the keyboard and converts it to interger
        inch = in.nextInt();
        
        //multiply number of inches by 2.54
        cm = inch * 2.54;
        System.out.print(inch + " in = ");
        System.out.println(cm + " cm");
        
      
    
    
    
    }
    





}