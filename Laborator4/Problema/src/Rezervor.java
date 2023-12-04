public class Rezervor {

    private int capacitateMaxima;
    private int nivelIncarcare;

    public Rezervor(){

    }

    public Rezervor(int capacitateMaxima,
                    int nivelIncarcare){
        this.capacitateMaxima = capacitateMaxima;
        this.nivelIncarcare = nivelIncarcare;
    }

    public int getCapacitateMaxima(){
        return this.capacitateMaxima;
    }

    public int getNivelIncarcare(){
        return this.nivelIncarcare;
    }

    public void setCapacitateMaxima(int capacitateMaxima){
        this.capacitateMaxima = capacitateMaxima;
    }

    public void setNivelIncarcare(int nivelIncarcare){
        this.nivelIncarcare = nivelIncarcare;
    }

    public void incarcareRezervor(int litri){
        this.nivelIncarcare += litri;
    }

}
