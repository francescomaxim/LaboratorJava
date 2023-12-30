import java.util.ArrayList;
import java.util.List;

public class FacebookAccount {
    private String nume;
    private int varsta;
    private String locatieCurenta;
    private List<FacebookAccount> listaPrieteni;

    public FacebookAccount(String nume,
                           int varsta,
                           String locatieCurenta) {
        this.nume = nume;
        this.varsta = varsta;
        this.locatieCurenta = locatieCurenta;
        this.listaPrieteni = new ArrayList<>();
    }

    public void addPrieten(FacebookAccount prietenNou) {
        listaPrieteni.add(prietenNou);
    }

    public boolean findPrieten(FacebookAccount prieten) {
        for (FacebookAccount i : listaPrieteni) {
            if (i.equals(prieten)) {
                return true;
            }
        }
        return false;
    }

    public void deletePrieten(FacebookAccount prieten) {
        if (findPrieten(prieten)) {
            listaPrieteni.remove(prieten);
        } else {
            System.out.println("nu exista");
        }
    }

    public String toString() {
        return nume;
    }

    public void printPrieteni() {
        for (FacebookAccount i : listaPrieteni) {
            System.out.println(i.toString());
        }
    }
}
