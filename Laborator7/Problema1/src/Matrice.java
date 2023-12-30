public class Matrice{
    private Numeric[][] matrice;
    public Matrice(){

    }
    public Matrice(Numeric[][] matrice){
        this.matrice = matrice;
    }
    public Matrice adunare(Matrice x){
        Numeric[][] buffer = new Numeric[matrice.length][matrice[0].length];
        for(int i = 0; i < matrice.length; i++){
            for(int j = 0; j < matrice[0].length; j++){
                buffer[i][j] = matrice[i][j].adunare(x.matrice[i][j]);
            }
        }
        return new Matrice(buffer);
    }
    public void afisareMatrice(){
        for(int i = 0; i < matrice.length; i++){
            for(int j = 0; j < matrice[0].length; j++){
                System.out.print(matrice[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
