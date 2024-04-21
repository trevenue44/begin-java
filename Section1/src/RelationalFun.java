public class RelationalFun {
    public static void main(String[] args) {
        boolean myBool = true;
        boolean yourBool = false;
        int myAge = 22;
        int yourAge = 20;
        int bobsAge = 20;

        String myName = "Paul";
        String yourName = "Paul";

        System.out.println("myBool is " + myBool);
        System.out.println("yourBool is " + yourBool);

        // relational operations
        boolean ageComparison = myAge > yourAge;

        System.out.println("myAge > yourAge: " + ageComparison);

        ageComparison = yourAge > myAge;
        System.out.println("yourAge > myAge: " + ageComparison);

        ageComparison = yourAge == bobsAge;
        System.out.println("yourAge == bobsAge?: " + ageComparison);

        boolean nameComparison = myName.equals(yourName);
        System.out.println("Do names match?: " + nameComparison);

    } // end main
}
