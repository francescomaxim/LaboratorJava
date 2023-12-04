import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int nr;

        System.out.println("Cate numere intregi vrei sa citesti?");
        nr = in.nextInt();

        while(nr != 0){

            int x = in.nextInt();
            System.out.println(x);
            nr--;

        }

        System.out.println("Cate numere reale vrei sa citesti?");
        nr = in.nextInt();

        while(nr != 0){

            double y = in.nextDouble();
            System.out.println(y);
            nr--;

        }

    }

}