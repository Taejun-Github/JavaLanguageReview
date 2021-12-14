package stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorVsStreamExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("노무현", "이명박", "박근혜");

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        list.stream().forEach((name)->{
            System.out.println(name);
        });
    }
}
