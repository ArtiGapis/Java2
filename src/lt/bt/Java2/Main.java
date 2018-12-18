package lt.bt.Java2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	System.out.println("veikia");
        List<Integer> numberList = Arrays.asList(20, 30, 50, 12, 5, 1, 3, 2, 4);
        numberList.sort(Comparator.naturalOrder());
        System.out.println(numberList);
    }
}
