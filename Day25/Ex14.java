/**
 * Write a description of class LoopEx2 here.
 *
 * @author (your name)
 * @version (23/01/2019)
 */
public class Ex14
{
    public static void main(String[]args){
    for(int num = 0;num<=20;num++){
        System.out.println(num);
        if(num==12){
        continue;
    }
    System.out.println("Next Number");
        }
    
    System.out.println("This is the end!");
}
}