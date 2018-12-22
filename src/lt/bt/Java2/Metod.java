package lt.bt.Java2;

public class Metod {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.methodB());

        A b = new B();
        System.out.println("klase: " + b.getClass().getName());
        System.out.println(b.methodB());

        A c = new C();
        System.out.println(c.methodB());

    }


    static class A {

        String methodA() {
            return "A";
        }

        String methodB() {
            return methodA() + "1";
        }
    }

    static class B extends A {

        @Override
        String methodA() {
            return "B";
        }
    }

    static class C extends B {

        @Override
        String methodA() {
            return super.methodA() + "C";
        }
    }


}
