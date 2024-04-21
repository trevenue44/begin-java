public class StringMethods1 {
    public static void main(String[] args) {
        String name = "Paul Treve";
        String name2 = "Paul Treve";
        String name3 = "Kwame Smeagol";

        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) + " ");
        }

        System.out.println();

        if (name.equals(name2)) {
            System.out.println("Names are equal.");
        }
        else {
            System.out.println("Names are not equal");
        }

        if (name.compareTo(name3) > 0) {
            System.out.println("name > name3");
        }
        else {
            System.out.println("name <= name3");
        }
    }
}
