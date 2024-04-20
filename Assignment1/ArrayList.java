import java.util.ArrayList; 
public class ArrayList{

    public static void main(String[] args) {
        ArrayList<String> colorsList=new ArrayList<>();

        colorsList.add("Red");
        colorsList.add("Blue");
        colorsList.add("Green");
        colorsList.add("Orange");
        colorsList.add("Yellow"); 

        for (String Color : colorsList) {
            System.out.println(Color);
            
        }
    }
}