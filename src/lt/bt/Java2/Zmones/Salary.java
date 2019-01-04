package lt.bt.Java2.Zmones;

import java.util.Objects;

public class Salary {

    private Employee name;
    private double salary;

    public Salary(Employee name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;//palygina rodykles, jeigu rodykles rodo i ta pacia atminties vieta, vadinasi objektai lygus
        if (o == null || getClass() != o.getClass()) return false;//jei objektas o lygus null("tuscias") arba lyginamu objektu klases nelygios(skirtingu klasiu) grazinama false;
        Salary sal = (Salary) o;//skliausteliuose po lygybes uzrasu(Trikampis) mes kompiliatoriui pasakome, kad mes zinome, jog lyginami objektai tos pacios klases

        return Objects.equals(sal.name,name);
    }

    @Override

    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Salary{ Name " + name +
                ", salary=" + salary +
                '}';
    }
}