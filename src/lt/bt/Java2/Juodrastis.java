package lt.bt.Java2;


public class Juodrastis {

    public static void main(String[] args) {
        Color color = Color.RED;
        System.out.println(color.ordinal());
        try {
            color = Color.valueOf("WHITE");
            System.out.println(color.name());
        }catch (IllegalArgumentException e){
            System.out.println("nera tokio " + e.getMessage());
        }


    }


    public enum Color{
        BLACK, RED;
    }


}