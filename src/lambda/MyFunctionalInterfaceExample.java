package lambda;

public class MyFunctionalInterfaceExample {
    public static void main(String[] args) {
        MyFunctionalInterface fi;

        fi = (x)-> {
            System.out.println("a");
        };

        fi.method(2);

        fi = (x)->{
            System.out.println("b");
        };
        fi.method(3);

        fi = (x)-> {
            System.out.println("c");
        };
        fi.method(4);
    }
}
