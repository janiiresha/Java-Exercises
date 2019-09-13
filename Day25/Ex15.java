/**
 * Write a description of class LoopEx2 here.
 *
 * @author (your name)
 * @version (23/01/2019)
 */
public class Ex15
{
    public static void main(String[]args){
    for(int num = 0;num<=20;num++){
        
        if(num%2==1){
        continue;
    }
    System.out.println(num);
        }
    
    System.out.println("This is the even numbers!");
}
}