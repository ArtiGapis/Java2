package lt.bt.Java2;

import java.util.LinkedList;
import java.util.List;

public class Dezutes {
    public static void main(String[] args) {
        Dezute<String> tekstai = new Dezute<>();
        tekstai.add("A");
        tekstai.add("B");
        tekstai.add("C");


        System.out.println("pradinis: " + tekstai.listas);

        tekstai.pull();

        System.out.println("su pull: " + tekstai.listas);
    }


    static class Dezute<T> {

        private List<T> listas = new LinkedList<>();

        public boolean add(T t) {
            listas.add(0, t);
            return true;
        }

        public T pull(){
            if (listas.size() == 0)return null;
            return listas.remove(0);
        }

        public  void add(int intex, T t){
            listas.add(intex, t);
        }
    }
}
