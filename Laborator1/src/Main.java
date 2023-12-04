import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // System.out.println("hello, francy here <3");

        Random rand = new Random();

        int x = rand.nextInt();

        while(x < 0 || x > 10){

            x = rand.nextInt();

        }

        System.out.println(x);

    }
}