public class Sofer {

    private String numeSofer;
    private String prenumeSofer;
    private int varstaSofer;
    private int numarPermisSofer;

    //Autovehicul masinaPersonala;

   private Autovehicul masinaPersonala;
    public Sofer(){

    }

    public Sofer(String numeSofer,
                 String prenumeSofer,
                 int varstaSofer,
                 int numarPermisSofer,
                 Autovehicul masinaPersonala){
        this.numeSofer = numeSofer;
        this.prenumeSofer = prenumeSofer;
        this.varstaSofer = varstaSofer;
        this.numarPermisSofer = numarPermisSofer;
        this.masinaPersonala = masinaPersonala;
    }

    public String getNumeSofer(){
        return this.numeSofer;
    }

    public String getPrenumeSofer(){
        return this.prenumeSofer;
    }

    public int getVarstaSofer(){
        return this.varstaSofer;
    }

    public int getNumarPermisSofer(){
        return this.numarPermisSofer;
    }

    public void setVarstaSofer(int varsta){
        this.varstaSofer = varsta;
    }

    public void setMasinaPersonala(Autovehicul masinaPersonala){
        this.masinaPersonala = masinaPersonala;
    }

    public Autovehicul getMasinaPersonala(){
        return this.masinaPersonala;
    }

}
