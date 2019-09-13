import java.util.Scanner;
public class Exercise7{
    public static void main(String[]args){
        //declare your variables
        int numberOfDaysLeft;
        boolean daysBeforeAssignment = false;
        Scanner reader = new Scanner(System.in);
        System.out.println("Type number of days");
        numberOfDaysLeft = reader.nextInt();
        if(numberOfDaysLeft != 1){
           daysBeforeAssignment = true;
        }if(daysBeforeAssignment){
            System.out.println("Go on vacation!");
            return;
        }
        
        System.out.println("Hurry Hurry Hurry Hurry! ");
            
   
    }
}