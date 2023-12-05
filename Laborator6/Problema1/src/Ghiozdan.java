import java.util.ArrayList;
import java.util.List;

public class Ghiozdan {
    private List<Rechizita> rechizite = new ArrayList<>();

    public void addCaiet(Caiet caiet) {
        rechizite.add(caiet);
    }

    public void addManual(Manual manual) {
        rechizite.add(manual);
    }

    public void listItems() {
        for (Rechizita i : rechizite) {
            System.out.println(i.getNume());
        }
    }

    public void listManual(){
        for(Rechizita i : rechizite){
            if(i instanceof Manual){
                System.out.println(i.getNume());
            }
        }
    }

    public void listCaiet(){
        for(Rechizita i : rechizite){
            if(i instanceof Caiet){
                System.out.println(i.getNume());
            }
        }
    }

    public int getNrRechizite(){
        return rechizite.size();
    }

    public int getNrManuale(){
        int k = 0;
        for(Rechizita i : rechizite){
            if(i instanceof Manual){
                k++;
            }
        }
        return k;
    }

    public int getNrCaiete(){
        int k = 0;
        for(Rechizita i : rechizite){
            if(i instanceof Caiet){
                k++;
            }
        }
        return k;
    }

}