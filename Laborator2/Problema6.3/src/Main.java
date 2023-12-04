
public class Main {
    public static void main(String[] args) {

        System.out.println("------Byte");
        System.out.println("Min Value:" + Byte.MIN_VALUE);
        System.out.println("Max Value:" + Byte.MAX_VALUE);

        System.out.println("------Short");
        System.out.println("Min Value:" + Short.MIN_VALUE);
        System.out.println("Max Value:" + Short.MAX_VALUE);

        System.out.println("------INT");
        System.out.println("Min Value:" + Integer.MIN_VALUE);
        System.out.println("Max Value:" + Integer.MAX_VALUE);

        System.out.println("------Long");
        System.out.println("Min Value:" + Long.MIN_VALUE);
        System.out.println("Max Value:" + Long.MAX_VALUE);

        System.out.println("------Float");
        System.out.println("Min Value:" + Float.MIN_VALUE);
        System.out.println("Max Value:" + Float.MAX_VALUE);

        System.out.println("------Double");
        System.out.println("Min Value:" + Double.MIN_VALUE);
        System.out.println("Max Value:" + Double.MAX_VALUE);

        int x = 2;
        System.out.println(x + Integer.MAX_VALUE); // un intreg adunat cu valoarea maxima
        System.out.println(Integer.MIN_VALUE - x); // scadere cu un intreg din valoarea minima
        System.out.println(Double.MAX_VALUE * 2); // inmultire
        // etc m-am plictisit

    }
}