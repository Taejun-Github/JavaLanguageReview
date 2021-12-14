package stream;

import java.util.Arrays;
import java.util.List;

public class FilteringExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("1","2","3","4","5");

        names.stream().distinct().filter(n->{
            return n.startsWith("1");
        }).forEach((n)->{
            System.out.println(n);
        });

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,6,7,8,9);
        numbers.stream().distinct().filter(n->{
            return n > 3;
        }).forEach(n->{
            System.out.println(n);
        });


    }
}
