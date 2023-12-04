public class Matrice {
    int n;
    Complex[][] matrice;

    public Matrice(int n) {
        this.n = n;
        Complex[][] matrice = new Complex[n][n];
        this.matrice = matrice;
    }

    public void initializareMatrice() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrice[i][j] = new Complex(0, 0);
            }
        }
    }

    public void printMatrice() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public void adunareMatrice(Complex[][] a) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrice[i][j].adunare(a[i][j]);
            }
        }
    }

    public void scadereMatrice(Complex[][] a) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrice[i][j].scadere(a[i][j]);
            }
        }
    }

    public void inmultireCuScalar(int k) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                Complex buf = new Complex(k, 0);
                matrice[i][j].inmultire(buf);
            }
        }
    }

}
