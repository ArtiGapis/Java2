package lt.bt.Java2.TrikampiuPalyginimas;

import java.util.*;

public class MainTriangleTreeSet {
    public static void main(String[] args) {

        List<Triangle> triangle = new ArrayList<>();

        triangle.add(new Triangle(3, 4, 5));
        triangle.add(new Triangle(3, 3, 3));
        triangle.add(new Triangle(3, 5, 4));

        System.out.println("Viso skirtingu trikampiu " + triangle.size());
        System.out.println("Trikampiai: " + triangle);

        Collections.sort(triangle);
        System.out.println("Trikampiai sulygiuoti pagal nutylejima: " + triangle);

        Comparator<Triangle> comparator = (o1, o2) -> {
            int cmp = Double.compare(o1.a, o2.a);
            if (cmp != 0) return -cmp;

            cmp = Double.compare(o1.b, o2.b);
            if (cmp != 0) return -cmp;

            return -Double.compare(o1.c, o2.c);
        };

        triangle.sort(comparator);
        System.out.println("Trikampiai sulygiuoti kitaip: " + triangle);
        Triangle.I a1 = Math::random;
        System.out.println(a1.value());

        Triangle x = triangle.get(0);
        Triangle.I a2 = x::getA;
        System.out.println(a2.value());

    }

}


class Triangle implements Comparable<Triangle> {

    double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
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

    private List<Double> sortTriangle () {
        List<Double> triangleList = Arrays.asList(a, b, c);
        triangleList.sort(Comparator.naturalOrder());
        return triangleList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;

        List<Double> t1 = this.sortTriangle();
        List<Double> t2 = triangle.sortTriangle();

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

    @Override
    public int compareTo(Triangle o) {

//        int cmp = Double.compare(this.a, o.a);
//        if (cmp != 0) return -cmp;
//
//        cmp = Double.compare(this.b, o.b);
//        if (cmp != 0) return -cmp;
//
//        return -Double.compare(this.c, o.c);

        return Double.compare(a+b+c, o.a+o.b+o.c);
    }

    interface I {
        double value();
    }
}

