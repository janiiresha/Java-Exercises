import java.util.Scanner;
public class Mydeatils
{

    public static void main(String[]args){
        
        String name; 
        Scanner reader=new Scanner(System.in);
         System.out.println ("What is your name?");
        name = reader.nextLine();
       
        
        int age ;
        System.out.println("How old are you?");
        age=reader.nextInt();
        

        
        
        System.out.println("Your name is" + name + "You are" + age + "Years old");
        
    }
}
