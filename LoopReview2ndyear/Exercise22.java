
/**
 * クラス Exercise22 の注釈をここに書きます.
 * 
 * @author (jani iresha)
 * @version (7-6-2019)
 */
public class Exercise22{
    public static void main(String[]args){
     int k=1;
         for (int i=1 ;i<7; i++)
    {
              for (int j=1;j <7 ; j++){
       if (i==j&& k<10) {
           System.out.print(k );
           k++;
        }
            
          else if (i + j==6 && k<10) {
           System.out.print(k );
           k++;
        }
        else{
             System.out.print(" ");
        }
         
  
      }
   System.out.println();
   }
  }
}