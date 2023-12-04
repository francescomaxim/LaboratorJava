import java.awt.*;

public class Main {

    public static void main(String[] args) {


        Sofer sofer = new Sofer("Gigel","Boss",21,1011,null);

        System.out.println("Numele soferului este:" + sofer.getNumeSofer());
        System.out.println("Prenumele soferului este" + sofer.getPrenumeSofer());
        System.out.println("Varsta:" + sofer.getVarstaSofer());
        System.out.println("Numar permis" + sofer.getNumarPermisSofer());

        System.out.println("E ziua lui " + sofer.getNumeSofer());

        sofer.setVarstaSofer(22);

        System.out.println("Varsta acum este" + sofer.getVarstaSofer());

        System.out.println("Isi cumpara un Mercedes cu ocazia zilei lui");

        Autovehicul masinaDeSmekeri = new Autovehicul("Mercedes", Color.darkGray, 0, 250, 0, 7);

        sofer.setMasinaPersonala(masinaDeSmekeri);

        System.out.println("Gigel se duce la vericu la un test si sa i faca soft sa fie boss de boss");

        TestDrive test = new TestDrive();

        test.testDrive(sofer.getMasinaPersonala());

    }
}