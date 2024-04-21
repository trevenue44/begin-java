

public class StringBuilderFun {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Paul Treve");

        sb.append(" is awesome");
        System.out.println(sb);

        sb.insert(5, "Elorm ");
        System.out.println(sb);

        sb.replace(20, 27, "amazing");
        System.out.println(sb);

        sb.delete(5, 11);
        System.out.println(sb);

        sb.replace(0, 5, "Ing. ");
        System.out.println(sb);
    }
}
