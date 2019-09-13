

public class Exercise29{
public static void main(String[]args){
    String[]studentList = {"Kalam","Josei","Jani","Ahamed"};
        String name = "Kalam";
        search(studentList,name);
    }
    
    public static String search(String[]studentList,String student){
        for(int i=0;i<studentList.length;i++){
            if(studentList[i]==student){
            
            System.out.print("Found the student:" + studentList[i]);
        
        }
        
        }
        return "Not Found";
    }
    }





    