
/**
 * クラス Exercise25b の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
import java.util .Arrays;
public class Exercise25b
{
    public static void main(String[]args){
    
        double[]tempForecast = {26.0,24.5,22.3};
        double[]tempForecastCopy = Arrays.copyOf(tempForecast,2);
        
        System.out.print(Arrays.toString(tempForecastCopy));
    }
        
    
    
    }