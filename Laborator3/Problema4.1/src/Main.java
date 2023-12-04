import java.util.Scanner;

public class Main {

    public static boolean isPrime(int number){

        if(number <= 1){

            return false;

        }

        for(int i = 2; i * i <= number; i++){

            if(number % i == 0){

                return false;

            }

        }

        return true;

    }

    public static void Goldbanch(int n, int m){

        if(n < 2){
            n = 2;
        }
        if(n % 2 == 1){
            n++;
        }
        for(int i = n; i <= m; i += 2){

            for(int j = 2; j <= i; j++){

                if(isPrime(j) && isPrime(i - j)){

                    System.out.println(i + "=" + j + "+" + (i - j));
                    break;

                }

            }

        }

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        Goldbanch(n, m);


    }

}