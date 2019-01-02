package lt.bt.Java2.Bandomasis;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8_SummingInt {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Kazys", 1400, "administration"),
                new Employee("Jonas", 800, "store"),
                new Employee("Ona", 900, "sales"),
                new Employee("Petras", 1200, "sales"),
                new Employee("Ada", 1500, "administration"),
                new Employee("Ona", 950, "sales"),
                new Employee("Ada", 1400, "administration"),
                new Employee("Kazys", 1350, "administration"),
                new Employee("Ona", 800, "sales"));


        Map<String, Integer> totalByDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getName,
                        Collectors.summingInt(Employee::getSalary)));
        System.out.println("Total Employees Dept : " + totalByDept);
    }
}
