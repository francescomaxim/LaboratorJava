import java.awt.*;

public class TestDrive {

    public void testDrive(){

    }
    public void testDrive(Autovehicul autovehiculTest) {

        //Autovehicul autovehiculTest = new Autovehicul("Mercedes", Color.darkGray, 0, 250, 0, 7);

        System.out.println("Viteza Actuala este:" + autovehiculTest.getVitezaCurenta() + " iar Treapta Actuala este:" + autovehiculTest.getTreaptaCurenta());
        autovehiculTest.accelerare(10);
        autovehiculTest.crestereTreapta(1);
        System.out.println("Se pune in prima treapta si se accelereaza cu 10km/h");
        System.out.println("Viteza Actuala este:" + autovehiculTest.getVitezaCurenta() + " iar Treapta Actuala este:" + autovehiculTest.getTreaptaCurenta());
        System.out.println("Se da a doua si se accelereaza 30km/h");
        autovehiculTest.accelerare(30);
        autovehiculTest.crestereTreapta(2);
        System.out.println("Viteza Actuala este:" + autovehiculTest.getVitezaCurenta() + " iar Treapta Actuala este:" + autovehiculTest.getTreaptaCurenta());

        System.out.println("Viteza maxima este:" + autovehiculTest.getVitezaMaxima());
        System.out.println("Treapta maxima este:" + autovehiculTest.getTreaptaMaxima());

        System.out.println("Se face soft la motor");

        autovehiculTest.setTreaptaMaxima(9);
        autovehiculTest.setVitezaMaxima(300);

        System.out.println("Viteza maxima este:" + autovehiculTest.getVitezaMaxima());
        System.out.println("Treapta maxima este:" + autovehiculTest.getTreaptaMaxima());

        System.out.println("Culoarea actuala este:" + autovehiculTest.getCuloare());

        System.out.println("Se vopseste masina intr-o culoare noua(albastru)");

        autovehiculTest.setCuloare(Color.BLUE);

        System.out.println("Culoarea actuala este:" + autovehiculTest.getCuloare());

    }

}
