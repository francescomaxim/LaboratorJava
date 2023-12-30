public class Main {
    public static void main(String[] args) {
        String obiect = null;

        try {
            // Încercați să apelați o metodă folosind referința la obiect
            // Aceasta va genera o NullPointerException deoarece obiectul este null
            int n = obiect.length();
            System.out.println(n);
        } catch (NullPointerException e) {
            // Interceptați și tratați excepția de tip NullPointerException
            System.out.println("NullPointerException a fost prinsă. Obiectul este null.");
        }
    }
}