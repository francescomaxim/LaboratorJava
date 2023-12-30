public class TestMatrice {
    public static void main(String[] args) {
        Complex x = new Complex(2, 2);
        Complex y = new Complex(3, 3);
        Fractie z = new Fractie(2, 2);
        Fractie w = new Fractie(3, 3);
        Numeric[][] q = {
                {x, y},
                {z, w}
        };
        Matrice qq = new Matrice(q);
        Matrice qqClone = new Matrice(q);

        qq = qq.adunare(qqClone);

        qq.afisareMatrice();
    }
}
