
/**
 * クラス Exercise7 の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付) */
public class Exercise7a{
    public static void main(String[]args){
        int n =5;
        for(int i =1; i<=n; i++){
            for(int j =1; j <=n; j++){
                if(i ==j|| i+j ==n+1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}  
