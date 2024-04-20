import java.util.ArrayList;

public class InsertFirstElement {
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

        
        colorsList.add(0, "Purple");

        /
        System.out.println("\nArrayList after inserting at the first position:");
        for (String color : colorsList) {
            System.out.println(color);
        }
    }
}