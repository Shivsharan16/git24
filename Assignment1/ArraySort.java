import java.util.ArrayList;
import java.util.Collections;

public class ArraySort{
    public static void main(String[] args) {
      
        ArrayList<String> colorsList = new ArrayList<>();

      
        colorsList.add("Red");
        colorsList.add("Blue");
        colorsList.add("Green");
        colorsList.add("Orange");
        colorsList.add("Yellow");

      
        System.out.println("Original ArrayList:");
        for (String color : colorsList) {
            System.out.println(color);
        }

        
        Collections.sort(colorsList);

        
        System.out.println("\nArrayList after Sorting:");
        for (String color : colorsList) {
            System.out.println(color);
        }
    }
}