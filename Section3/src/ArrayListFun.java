import java.util.ArrayList;

public class ArrayListFun {
    public static void main(String[] args) {
        // array lists don't work with primitive types!
        // `ArrayList<int>` will not work!
        ArrayList<String> namesList = new ArrayList<>();

        namesList.add("John");
        namesList.add("Kyle");
        namesList.add("Mathew");
        namesList.add("Amanda");
        namesList.add("Wendy");

//        for (int i = 0; i < namesList.size(); i++) {
//            System.out.println(namesList.get(i));
//        }

        // enhanced for loop
        for (String name : namesList) {
            System.out.println(name);
        }
    } // end main
}
