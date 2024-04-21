public class LogicalFun {
    public static void main(String[] args) {
        boolean isRaining = true;
        boolean isWarm = true;

        boolean combined = isRaining && isWarm;

        System.out.println("Is it raining and warm?: " + combined);

        combined = isRaining || isWarm;

        System.out.println("Is it raining OR warn?: " + combined);

        combined = !isRaining;

        System.out.println("Is it NOT raining outside?: " + combined);
    } // end main
}
