import java.util.ArrayList;
import java.util.List;

public class FacebookAccount {
    private String nume;
    private String prenume;
    private int varsta;
    private String locatieCurenta;
    private List<FacebookAccount> prieteni = new ArrayList<>();
    public FacebookAccount(String nume,
                           String prenume,
                           int varsta,
                           String locatieCurenta){
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.locatieCurenta = locatieCurenta;
    }

    public String toString(){
        return nume + " " + prenume;
    }

    public void addPrieten(FacebookAccount newFriend){
        if(prieteni.contains(newFriend)){
            System.out.println("Este deja in lista");
        }else{
            prieteni.add(newFriend);
        }
    }

    public void removePrieten(FacebookAccount friend){
        if(prieteni.contains(friend)){
            prieteni.remove(friend);
        }else{
            System.out.println("nu exista");
        }
    }

    public void afisarePrieteni(){
        for(FacebookAccount i : prieteni){
            System.out.println("-" + i);
        }
    }

}
