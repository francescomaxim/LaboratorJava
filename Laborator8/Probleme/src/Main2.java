public class Main2 {
    public static void main(String[] args) {
        try {
            // Declarați și inițializați un array
            int[] vector = {1, 2, 3};

            // Încercați să accesați un element din afara limitelor array-ului
            int element = vector[5];

            // Acest cod nu va fi atins în cazul în care o excepție este generată mai devreme
            System.out.println("Elementul din array: " + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Interceptați și tratați excepția de tip ArrayIndexOutOfBoundsException
            System.out.println("ArrayIndexOutOfBoundsException a fost prinsă. Acces la un index inexistent.");
        }
    }
}
