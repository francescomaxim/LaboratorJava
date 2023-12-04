public class Main {

    public static void main(String[] args) {

        int age = 20;
        int sex = 1;
        int height = 173;

        short cod = 0;
        cod = (short)((((age << 1) | sex) << 8) | height);

        height = cod & 0xFF;
        sex = (cod >>> 8) & 1;
        age = (cod >>> 9) & 0xFF;

        System.out.println(height);
        System.out.println(sex);
        System.out.println(age);

    }

}