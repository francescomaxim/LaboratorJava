class Boss{
    private int x = 3;
    private int y = printInit("init1");
    Boss(){
        System.out.println(x);
    }
    private static int x1 = printInit("init2");
    static int printInit(String s){
        System.out.println(s);
        return 47;
    }
}

public class Main extends Boss{
    public static void main(String[] args){
        System.out.println("bosule ce ai facut");
        Boss boss = new Boss();
    }
}
