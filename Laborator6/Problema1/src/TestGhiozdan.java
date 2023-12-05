public class TestGhiozdan {
    public static void main(String[] args){
        Caiet x = new Caiet("caiet de boss");
        Manual y = new Manual("manual de boss");
        Ghiozdan z = new Ghiozdan();
        z.addCaiet(x);
        z.addManual(y);
        z.listItems();
        z.listManual();
        System.out.println(z.getNrRechizite());
        System.out.println(z.getNrCaiete());
        System.out.println(z.getNrManuale());
    }
}
