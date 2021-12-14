package lambda;

import java.util.function.IntSupplier;

public class SupplierExample {
    public static void main(String[] args) {
        IntSupplier intSupplier = () -> {
          int num = 10;
          return num;
        };

        int num = intSupplier.getAsInt();
        System.out.println(num);
    }
}
