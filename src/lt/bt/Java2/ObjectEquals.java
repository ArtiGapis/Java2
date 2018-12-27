package lt.bt.Java2;

import java.util.Objects;

public class ObjectEquals {
    public static void main(String[] args) {
        String a = null;
        String b = null;

        if (Objects.equals(a, b)) {
            System.out.println("lygus");
        } else System.out.println("nelygus");
    }
}