import java.util.Scanner;
 public class largerThan{

           public static void largerThan(int number,int number1 ){
        
               
     
              if(number < number1){
             System.out.println("larger number" + number);
               }else{
                System.out.println("larger number" + number1);
                }
  
        }


    public static void main(String[]args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Input a number");
        
       int number = reader.nextInt();
       System.out.println("Input a number");
       int number1 = reader.nextInt();
       
       
       largerThan(number,number1);
        
         
 

       }

     }
    



