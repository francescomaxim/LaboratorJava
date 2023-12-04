public class Complex {
    private int parteReala;
    private int parteImaginara;

    public Complex(int parteReala, int parteImaginara) {
        this.parteReala = parteReala;
        this.parteImaginara = parteImaginara;
    }

    public void adunare(Complex a) {
        parteReala += a.parteReala;
        parteImaginara += a.parteImaginara;
    }

    public void scadere(Complex a) {
        parteReala -= a.parteReala;
        parteImaginara -= a.parteImaginara;
    }

    public void inmultire(Complex a) {
        parteReala = (parteReala * a.parteReala) - (parteImaginara * a.parteImaginara);
        parteImaginara = (parteReala * a.parteImaginara) + (parteImaginara * a.parteReala);
    }

    public String toString() {
        if (parteReala == 0) {
            if (parteImaginara == 0) {
                return "0";
            } else {
                return parteImaginara + "i";
            }
        } else {
            if (parteImaginara == 0) {
                return parteReala + "";
            } else {
                if (parteImaginara > 0) {
                    return parteReala + "+" + parteImaginara + "i";
                } else {
                    return parteReala + "" + parteImaginara + "i";
                }
            }
        }
    }

}
