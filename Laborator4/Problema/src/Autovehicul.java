import java.awt.*;

public class Autovehicul {

    private String marca;
    private Color culoare;
    private int vitezaCurenta;
    private int vitezaMaxima;
    private int treaptaCurenta;
    private int treaptaMaxima;

    private Rezervor rezervorMasina;

    public Autovehicul(){

    }

    public Autovehicul(String marca,
                       Color culoare,
                       int vitezaCurenta,
                       int vitezaMaxima,
                       int treaptaCurenta,
                       int treaptaMaxima){
        this.marca = marca;
        this.culoare = culoare;
        this.vitezaCurenta = vitezaCurenta;
        this.vitezaMaxima = vitezaMaxima;
        this.treaptaCurenta = treaptaCurenta;
        this.treaptaMaxima = treaptaMaxima;
    }

    public void accelerare(int kmh){
        if((this.vitezaCurenta + kmh) <= vitezaMaxima) {
            this.vitezaCurenta += kmh;
        }else{
            System.out.println("Nu poti trece de " + vitezaMaxima + "km/h");
        }
    }

    public void deccelerare(int kmh){
        if((this.vitezaCurenta - kmh) >= 0) {
            this.vitezaCurenta -= kmh;
        }else{
            System.out.println("Viteza este 0 deja");
        }
    }

    public void crestereTreapta(int crestere){
        if((this.treaptaCurenta + crestere) <= treaptaMaxima) {
            this.treaptaCurenta += crestere;
        }else{
            System.out.println("Masina este in treapta maxima");
        }
    }

    public void scadereTreapta(int scadere){
        if((this.treaptaCurenta - scadere) >= 0) {
            this.treaptaCurenta -= scadere;
        }else{
            System.out.println("Esti pe liber");
        }
    }

    public void oprire(){
        this.vitezaCurenta = 0;
        this.treaptaCurenta = 0;
        System.out.println("Masina s-a oprit");
    }

    public int getVitezaCurenta(){
        return this.vitezaCurenta;
    }

    public int getTreaptaCurenta(){
        return this.treaptaCurenta;
    }

    public void setCuloare(Color culoare){
        this.culoare = culoare;
    }

    public void setVitezaMaxima(int vitezaMaxima){
        this.vitezaMaxima = vitezaMaxima;
    }

    public void setTreaptaMaxima(int treaptaMaxima){
        this.treaptaMaxima = treaptaMaxima;
    }

    public int getVitezaMaxima(){
        return this.vitezaMaxima;
    }

    public int getTreaptaMaxima(){
        return this.treaptaMaxima;
    }

    public Color getCuloare(){
        return this.culoare;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }


}
