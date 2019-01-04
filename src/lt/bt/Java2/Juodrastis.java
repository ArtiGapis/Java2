package lt.bt.Java2;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Juodrastis {
    public static void main(String[] args) {
        List<Integer> people = new ArrayList<>();
        people.add(10);
        people.add(29);
        people.add(38);
        people.add(47);
        people.add(56);
        people.add(65);
        people.add(74);
        people.add(83);
        people.add(92);
        people.add(01);
        System.out.println(people);




        int m = people.stream().mapToInt(i -> i).sum();
        System.out.println(m);


//        System.out.println("Surinkite vardus į sąrašą");
//        List<String> list = people
//                .stream()
//                .sorted((o1, o2)->o1.getItem().getValue().
//                        compareTo(o2.getItem().getValue())).
//                        collect(Collectors.toList());
//        System.out.println(list);
//
//        System.out.println("\n Surinkite vardus į „TreeSet“");
//        Set<String> set = people
//                .stream()
//                .map(Person::getName)
//                .collect(Collectors.toCollection(TreeSet::new));
//
//        System.out.println("Konvertuokite elementus į eilutes ir susieti jas, atskirtas kableliais");
//        String joined = things
//                .stream()
//                .map(Object::toString)
//                .collect(Collectors.joining(", "));
//
//        // Apskaičiuokite darbuotojo atlyginimų sumą
//        int total = employees
//                .stream()
//                .collect(Collectors.summingInt(Employee::getSalary)));
//
//        // Grupės darbuotojai pagal skyrius
//        Map<Department, List<Employee>> byDept = employees
//                .stream()
//                .collect(Collectors.groupingBy(Employee::getDepartment));
//
//        // Apskaičiuokite atlyginimus pagal padalinius
//        Map<Department, Integer> totalByDept = employees.stream()
//                .collect(Collectors.groupingBy(Employee::getDepartment,
//                        Collectors.summingInt(Employee::getSalary)));
//
//        // Padalinkite studentus į praeities ir nesėkmės
//        Map<Boolean, List<Student>> passingFailing = students
//                .stream()
//                .collect(Collectors.partitioningBy(s -> s.getGrade() >= PASS_THRESHOLD));
    }
}