
/**
 * Write a description of class Ex1 here.
 *
 * @author (Jani Iresha)
 * @version (19/12/2018)
 */
public class Exercise1
{
    //create a method bineryNumber
    public static void bineryNumber(int num){
        //Go as long as value is greater than 0
        
        if(num > 0){
            
            System.out.println(num % 2);
            int result =(num / 2);
           bineryNumber(result);
        
            
            
            
        }
       
    
    }
        public static void main(String[]args){
            bineryNumber(23);
           
        }
    }
  
        