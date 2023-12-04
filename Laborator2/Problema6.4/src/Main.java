// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int x = 12;

        try {
            System.out.println(x / 0);// ->exceptie
        }catch(Exception e)
        {
            System.out.println(e);
        }
        double a = -0.35;

        System.out.println(a / 0);// -> -inf

        a = 0.35;

        System.out.println(a / 0);// ->inf

        System.out.println(a / 0 + (-a) / 0);

        System.out.println( (a / 0) * (a / 0));

       //  boolean b = 12; ->exceptie

       // int intreg = 2.15; ->exceptie

    }
}