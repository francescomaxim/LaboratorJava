import java.util.Scanner;

public class Main {

    public static boolean eVocala(char a){

        if(a == 'a'){
            return true;
        }

        if(a == 'e'){
            return true;
        }

        if(a == 'i'){
            return true;
        }

        if(a == 'o'){
            return true;
        }

        return a == 'u';

    }
    public static void ConsoaneVocale(String myInput){

        int vocale = 0;
        int consoane = 0;

        for(int i = 0; i < myInput.length(); i++){

            if(eVocala(myInput.charAt(i))){
                vocale++;
            }else{
                consoane++;
            }

        }

        System.out.println("Sunt " + vocale + " Vocale si " + consoane + " Consoane");

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String myInput = in.nextLine().toLowerCase();

        ConsoaneVocale(myInput);

    }
}