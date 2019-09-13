import java.util.Scanner;
 public class odd{

           public static void oddOrEven(int number){
        
               //find out if number is odd or even
     
              if(number % 2 == 0){
             System.out.println("Your number is odd");
               }else{
                System.out.println("Your number is even");
                }
  
        }


    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Input a number");
        
       int number = reader.nextInt();
        //OddOrEven method
           oddOrEven(number);
 

       }

     }
    
  

        



