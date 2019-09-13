import java.util.Scanner;
public class Exercise4{

    public static void main(String[]args){
        int number;
        Scanner reader = new Scanner(System.in);
        System.out.println("How old are you?");
        number = reader.nextInt();
        
        System.out.println("I am"  +  number);
    }
}