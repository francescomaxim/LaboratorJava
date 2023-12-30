public class Main {
    public static void main(String[] args) {
        FacebookAccount x = new FacebookAccount("maxim","francesco",21,"Piatra Neamt");
        FacebookAccount y = new FacebookAccount("tilneac","valentin",20,"Bontida");
        FacebookAccount z = new FacebookAccount("vraja","vasile",20,"Sighet");
        x.addPrieten(y);
        x.addPrieten(z);
        x.afisarePrieteni();
        x.removePrieten(y);
        System.out.println("\n");
        x.afisarePrieteni();
        x.removePrieten(y);
    }
}