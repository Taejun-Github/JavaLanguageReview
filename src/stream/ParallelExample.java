package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("1", "2", "3", "4", "5");

        Stream<String> stream = list.stream();
        stream.forEach(ParallelExample::print);
        //메소드 참조이다. s->ParallelExample.print(s)와 같은 의미이다.

        int[] intArray = {1,2,3,4,5};
        Arrays.stream(intArray).forEach(ParallelExample::printInt);
        //배열로부터 스트림을 얻을 때는 이렇게 한다.

        IntStream.rangeClosed(1, 100).forEach(ParallelExample::printInt);
        //숫자 범위로부터 스트림을 얻을 때는 이렇게 한다.

    }
    public static void print(String str) {
        System.out.println(str);
    }

    public static void printInt(int a) {
        System.out.println(a);
    }
}
