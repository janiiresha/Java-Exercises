
/**
 * クラス Exercise30 の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (28/6\2019)
 */


public class Exercise30{
public static void main(String[]args){
    int[]searchPass= {1,2,3,4,5};
        int number = 5;
        search(searchPass,number);
        
        
    }
    
    public static int search(int[]searchPass,int numbers){
        for(int i=0;i<searchPass.length;i++){
            if(searchPass[i]==numbers){
            
           
            return 1;
        }       
    }
    return -1;

}
}