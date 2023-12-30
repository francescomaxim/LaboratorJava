public class Fractie implements Numeric{
    private int numarator;
    private int numitor;
    public Fractie(){

    }
    public Fractie(int numarator, int numitor){
        this.numarator = numarator;
        this.numitor = numitor;
    }

    public Numeric adunare(Numeric x){
        if(x instanceof Fractie){
            Fractie buffer = (Fractie) x;
            Fractie rezultat = new Fractie();
            rezultat.numarator = numarator * buffer.numitor + numitor * buffer.numarator;
            rezultat.numitor = numarator * buffer.numarator;
            return rezultat;
        }
        return null;
    }

    public Numeric scadere(Numeric x){
        if(x instanceof Fractie){
            Fractie buffer = (Fractie) x;
            Fractie rezultat = new Fractie();
            rezultat.numarator = numarator * buffer.numitor - numitor * buffer.numarator;
            rezultat.numitor = numarator * buffer.numarator;
            return rezultat;
        }
        return null;
    }

    public Numeric inmultire(Numeric x){
        if(x instanceof Fractie){
            Fractie buffer = (Fractie) x;
            return new Fractie(numarator * buffer.numarator, numitor * buffer.numitor);
        }
        return null;
    }
    public String toString(){
        return numarator + "/" + numitor;
    }

}
