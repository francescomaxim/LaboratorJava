public class Complex implements Numeric{
    private int parteReala;
    private int parteImaginara;

    public Complex(){

    }
    public Complex(int parteReala, int parteImaginara){
        this.parteReala = parteReala;
        this.parteImaginara = parteImaginara;
    }

    public Numeric adunare(Numeric x){
        if(x instanceof Complex){
            Complex buffer = (Complex) x;
            return new Complex(this.parteReala + buffer.parteReala, this.parteImaginara + buffer.parteImaginara);
        }
        return null;
    }

    public Numeric scadere(Numeric x){
        if(x instanceof Complex){
            Complex buffer = (Complex) x;
            return new Complex(this.parteReala - buffer.parteReala, this.parteImaginara - buffer.parteImaginara);
        }
        return null;
    }

    public Numeric inmultire(Numeric x){
        if(x instanceof Complex){
            Complex buffer = (Complex) x;
            Complex rezultat = new Complex();
            rezultat.parteReala = buffer.parteReala * parteReala - buffer.parteImaginara * parteImaginara;
            rezultat.parteImaginara = parteReala * buffer.parteImaginara + parteImaginara * buffer.parteReala;
            return  rezultat;
        }
        return null;
    }

    public String toString(){
        return parteReala + "+(" + parteImaginara + "i)";
    }


}
