/**
 * クラス Exercise24 の注釈をここに書きます.
 * 
 * @author (jani iresha)
 * @version (10-6-2019)
 */
import java.util .Arrays;
public class Exercise24
{
    public static void main(String[]args){
        
        double[]grades={98.2,22.9,30.0};
        double[]scores=Arrays.copyOf(grades,4);
        for(int i=0;i<=2;i++){
            scores[i]=grades[i];
        
        }
        
        System.out.print(Arrays.toString(scores));
        
    
    
}
}