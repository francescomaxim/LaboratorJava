class ExceptieFrancesco extends Exception{
    ExceptieFrancesco(){
        super("francesco boss");
    }
}

public class Main5{

    public static void verificareFrancesco(String mesaj) throws ExceptieFrancesco{
        if(mesaj.length() > 5){
            throw new ExceptieFrancesco();
        }else{
            System.out.println("francesco not boss");
        }
    }

    public static void main(String[] args){
        String s = "francesco";
        try{
            verificareFrancesco(s);
        }catch (ExceptieFrancesco e){
            System.out.println(e.getMessage());
        }
    }
}