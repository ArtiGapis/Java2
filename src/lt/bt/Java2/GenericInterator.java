package lt.bt.Java2;

import java.util.ArrayList;


//        Parašykite parametrizuotą (generic) klasę, kuri realizuoja E tipo objektų saugyklą.
//        Taip pat padarykite kad juos galima iteruoti dviem būdais - ta pačia tvarka kaip ir
//        įdėta ir atvirkštine tvarka
//        Sukurkite iteratorių, kuris iteruotų nuo pradžių bet tik tokius elementus kurie tenkina
//        filtracijos sąlygą pagal anoniminę klasę sukurtą pagal standartinį java8 Predicate
//        interfeisą

public class GenericInterator {
    public static void main(String[] args) {
        Dezute<String> tekstai = new Dezute<>();
        tekstai.add("A");
        tekstai.add("B");
        tekstai.add("C");
        tekstai.add("D");

        tekstai.remove();
        for (String x: tekstai){
            System.out.println(x);
        }
    }

    static class Dezute<T> extends ArrayList<T> {

        @Override
        public boolean add(T t) {
            add(0, t);
            return true;
        }

        public T remove(){
            if (this.size() == 0)return null;
            return this.remove(0);
        }
    }
}