
/**
 * クラス Exercise28 の注釈をここに書きます.
 * 
 * @author (あなたの名前)
 * @version (バージョン番号もしくは日付)
 */
import java.util .Arrays;
public class Exercise28
{
    public static void main(String[]args){
        String[]studentList = {"Kalam","Josei","Jani","San",};
        for(int i=0;i<studentList.length;i++){
            if(studentList[i]=="San"){
                System.out.print("Found student"  +  studentList[i]);
            
            } else{
                System.out.print("San" + "Student doesn't exist");
            break;
            }
        
        }
    }

}