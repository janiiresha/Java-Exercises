
/**
 * Write a description of class Ex1 here.
 *
 * @author (Jani Iresha)
 * @version (12/12/2018)
 */
public class Exercise3
{
    
    public static void CountDown(int n){
        if(n == 0){
            System.out.println("Happy New Year!");
        }else{
            System.out.println(n);
            CountDown(n-1);
        }
       
    
    }
        public static void main(String[]args){
            CountDown(10);
  
       }


    }