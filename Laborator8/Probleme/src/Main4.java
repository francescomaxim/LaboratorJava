// Definirea clasei de excepție personalizată
class ExempluExcepetiePersonalizata extends Exception {
    // Referința la String pentru a stoca informații suplimentare
    private String mesajPersonalizat;

    // Constructor care primește un String și îl stochează
    public ExempluExcepetiePersonalizata(String mesaj) {
        this.mesajPersonalizat = mesaj;
    }

    // Metodă care afișează șirul stocat
    public void afiseazaMesaj() {
        System.out.println("Mesaj personalizat: " + mesajPersonalizat);
    }
}

public class Main4 {
    public static void main(String[] args) {
        try {
            // Aruncarea excepției personalizate
            throw new ExempluExcepetiePersonalizata("Aceasta este o excepție personalizată.");
        } catch (ExempluExcepetiePersonalizata e) {
            // Interceptarea și tratarea excepției personalizate
            System.out.println("Excepție personalizată prinsă.");
            e.afiseazaMesaj();
        }
    }
}

