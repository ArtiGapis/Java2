package lt.bt.Java2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericInterator {
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add("Algis");
        names.add("Petras");
        names.add("Juozas");
        names.add("Antanas");

        Iterator<String> it = names.iterator();
        System.out.println("it: " + names);

        while(it.hasNext()) {
            String obj = it.next();
            System.out.println(obj);
        }
    }
}