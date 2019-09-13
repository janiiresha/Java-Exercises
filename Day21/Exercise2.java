
/**
 * Write a description of class Ex1 here.
 *
 * @author (Jani Iresha)
 * @version (12/12/2018)
 */
public class Exercise2
{
    public static void CountUp(int n){
        if(n == 4){
            System.out.println("Go!");
        }else{
            System.out.println(n);
            CountUp(n+1);
        }
       
    
    }
        public static void main(String[]args){
            CountUp(1);
  
       }


    }
