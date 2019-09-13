
/**
 * Write a description of class Ex1 here.
 *
 * @author (Jani Iresha)
 * @version (09/01/2019)
 */
public class Exercise1
{
    public static void CountDown(int n){
        if(n == 0){
            System.out.println("Blast off!");
        }else{
            System.out.println(n);
            CountDown(n-1);
        }
       
    
    }
        public static void main(String[]args){
            CountDown(3);
  
       }


    }