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

        List<Salary> list = new ArrayList<>();
        list.add(new Salary(new Employee("Kazys"), 1400.0));
        list.add(new Salary(new Employee("Jonas"), 800.0));
        list.add(new Salary(new Employee("Ona"), 900.0));
        list.add(new Salary(new Employee("Petras"), 1200.0));
        list.add(new Salary(new Employee("Ada"), 1500.0));
        list.add(new Salary(new Employee("Ona"), 950.0));
        list.add(new Salary(new Employee("Ada"), 1400.0));
        list.add(new Salary(new Employee("Kazys"), 1350.0));
        list.add(new Salary(new Employee("Ona"), 800.0));

//        ---sugrupuota ir sudeta---
        Map<Employee, Double> sumGroup = list.stream()
                .collect(Collectors.groupingBy(Salary::getName,
                        Collectors.summingDouble(Salary::getSalary)));

//        ---Didejimo tvarka---
        System.out.println("\n1. Išrinkite kiek ir kokiam darbuotojui yra išmokėta ir išveskite mažėjimo tvarka pagal išmokėtą sumą: vardas - išmokėta suma:\n");
        sumGroup.entrySet().stream().sorted(Comparator.comparing(Map.Entry<Employee,Double>::getValue).reversed ())
                .forEach(e -> System.out.println(e.getKey() +" - "+ e.getValue()));

        System.out.println("\n2. Suskaičiuokite kiek išmokėjimų (ne suma bet kiek kartų buvo išmokėta) yra kiekvienam darbuotojui ir atspausdinkite: vardas - kiek kartų išmokėta\n");

        Set<Salary> setList = new HashSet<>(list);
        for (Salary temp : setList) {
            System.out.println(temp.getName() + ": " + Collections.frequency(list, temp));
        }
    }
}