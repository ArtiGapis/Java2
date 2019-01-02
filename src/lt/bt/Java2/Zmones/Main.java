package lt.bt.Java2.Zmones;

import java.util.*;
import java.util.stream.Collectors;

//        Tarkime turime objektą Employee ir objektą Salary, kuriame yra Employee tipo
//        laukas ir Double tipo laukas reiškiantis išmokėtą atlyginimą.
//        Sukurkite sąrašą darbuotojų ir jų atlyginimų (gali būti keli to pačio darbuotojo įrašai)
//        ir aprašykite tokius veiksmus naudojant duomenų srautus/vamzdynus:

//        1. Išrinkite kiek ir kokiam darbuotojui yra išmokėta ir išveskite mažėjimo tvarka
//        pagal išmokėtą sumą: vardas - išmokėta suma

//        2. Suskaičiuokite kiek išmokėjimų (ne suma bet kiek kartų buvo išmokėta) yra
//        kiekvienam darbuotojui ir atspausdinkite: vardas - kiek kartų išmokėta

public class Main {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Kazys", 1400.0));
        list.add(new Employee("Jonas", 800.0));
        list.add(new Employee("Ona", 900.0));
        list.add(new Employee("Petras", 1200.0));
        list.add(new Employee("Ada", 1500.0));
        list.add(new Employee("Ona", 950.0));
        list.add(new Employee("Ada", 1400.0));
        list.add(new Employee("Kazys", 1350.0));
        list.add(new Employee("Ona", 800.0));

        System.out.println("---list---");
        System.out.println(list);

        Map<String, Double> sumGroup = list.stream()
                .collect(Collectors.groupingBy(Employee::getName,
                        Collectors.summingDouble(Employee::getSalary)));
        System.out.println("\n ---sugrupuota ir sudeta---");
        System.out.println(sumGroup);

        System.out.println("---key---");
        List<String> first = new ArrayList<String>(sumGroup.keySet());
        List<Double> second = new ArrayList<Double>(sumGroup.values());
        Naujas(sumGroup.keySet(), sumGroup.values());
        System.out.println(first);
        System.out.println(second);
        System.out.println();
    }


    private static void Naujas (Set<String> a, Collection<Double> b) {

    }
}