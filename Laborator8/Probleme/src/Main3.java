public class Main3 {
    public static void main(String[] args) {
        try {
            // Aruncați un obiect de clasa Exception cu un argument String în constructor
            throw new Exception("Acesta este un mesaj de eroare.");
        } catch (Exception e) {
            // Interceptați și tratați excepția
            System.out.println("Excepție prinsă: " + e.getMessage());
        } finally {
            // Clauza finally se execută întotdeauna, indiferent de existența sau nu a excepției
            System.out.println("Blocul finally s-a executat.");
        }
    }
}
