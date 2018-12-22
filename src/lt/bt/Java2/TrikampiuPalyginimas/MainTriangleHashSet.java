package lt.bt.Java2.TrikampiuPalyginimas;

import java.util.*;

public class MainTriangleHashSet {

    public static void main(String[] args) {

        Set<Trikampis> trikampiai = new HashSet<>();

        trikampiai.add(new Trikampis(3, 4, 5));
        trikampiai.add(new Trikampis(3, 3, 3));
        trikampiai.add(new Trikampis(3, 5, 4));

        System.out.println("Viso skirtingu trikampiu " + trikampiai.size());
        System.out.println("Trikampiai: "+trikampiai );
    }
}

class Trikampis {



    private double a, b, c;

    public Trikampis(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

//    public double trPl(){
//        double P = (a + b + c)/2;
//        double S = Math.sqrt(P * (P - a) * (P - b) * (P - c));
//        return S;
//    }

    private List<Double> sortTriangle(){
        List<Double> triangleList = Arrays.asList(a, b, c);
            triangleList.sort(Comparator.naturalOrder());
        return triangleList;
    }



    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trikampis trikampis = (Trikampis) o;
        List<Double> t1 = this.sortTriangle();
        List<Double> t2 = trikampis.sortTriangle();

        return Double.compare(t1.get(0), t2.get(0)) == 0 &&
                Double.compare(t1.get(1), t2.get(1)) == 0 &&
                Double.compare(t1.get(2), t2.get(2)) == 0;

    }

    @Override
    public int hashCode() {

        return Objects.hash(sortTriangle());


    }

    @Override
    public String toString() {
        return "Trikampis{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}