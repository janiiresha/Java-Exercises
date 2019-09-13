
/**
 * クラス Ex25 の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (21-6-2019)
 */
import java.util .Arrays;
public class Exercise25
{
    public static void main(String[]args){
        double[]tempForecast = {26.0,24.5,22.3};
        double[]tempForecastCopy = new double[3];
       
        
        
        for(int i=0;i<tempForecast.length;i++){
        
            tempForecastCopy[i] = tempForecast[i];
            
            System.out.print(Arrays.toString(tempForecast));
        
        }
    
    
    }



}