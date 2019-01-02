package lt.bt.Java2;

import java.util.LinkedList;
import java.util.Queue;

public class Calc {
    final double result;

    private Queue<Calc> saved = new LinkedList<>();

    public double getResult() {
        return result;
    }



    public Calc() {
        this.result = 0;
    }

    public Calc(double result) {
        this.result = result;
    }

    Calc setValue(double value) {
        //result = value;
        //return this;
        Calc calc = new Calc(value);
        saved.add(calc);
        return calc;
    }

    Calc add(double value) {
        //result += value;
        //return this;
        Calc calc = new Calc(result + value);
        saved.add(calc);
        calc.saved = this.saved;
        return calc;
    }

    Calc back() {
        Calc calc = saved.poll();
        if (calc == null) {
            calc = new Calc();
        }
        return calc;
    }

    @Override
    public String toString() {
        return "CalculatorDemo{" +
                "result=" + result +
                '}';
    }
}




class Main {
    public static void main(String[] args) {
        Calc calculator = new Calc();

        double a = calculator.setValue(100)
                .add(25)
                .add(40)
                .back()
                .add(50)
                .getResult();

        System.out.println("100.0 + 25.0 + 40.0 (xxx) + 50.0 = " + a);
    }
}
