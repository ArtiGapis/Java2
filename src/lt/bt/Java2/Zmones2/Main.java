package lt.bt.Java2.Zmones2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
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

        List<Employee2> list = new ArrayList<>();
        list.add(new Employee2("Kazys", 1400.0));
        list.add(new Employee2("Jonas", 800.0));
        list.add(new Employee2("Ona", 900.0));
        list.add(new Employee2("Petras", 1200.0));
        list.add(new Employee2("Ada", 1500.0));
        list.add(new Employee2("Ona", 950.0));
        list.add(new Employee2("Ada", 1400.0));
        list.add(new Employee2("Kazys", 1350.0));
        list.add(new Employee2("Ona", 800.0));


        System.out.println("---list---");
        System.out.println(list);


        Map<String, Double> sumGroup = list.stream()
                .collect(Collectors.groupingBy(Employee2::getName,
                        Collectors.summingDouble(Employee2::getSalary)));
        System.out.println("\n ---sugrupuota ir sudeta---");
        System.out.println(sumGroup);

        System.out.println("\n---Didejimo tvarka---");
        sumGroup.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue))
                .forEach(e -> System.out.println(e.getKey() +" "+ e.getValue()));

    }
}

