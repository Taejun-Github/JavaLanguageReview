package lambda;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> consumer = t -> System.out.println(t + "8");
        consumer.accept("shangus");

        BiConsumer<String, String> biConsumer = (t, u)-> System.out.println(t + u + "a");
        biConsumer.accept("노무현", "김대중");

        DoubleConsumer doubleConsumer = t -> System.out.println(t + "b");
        doubleConsumer.accept(1.2);

    }
}
