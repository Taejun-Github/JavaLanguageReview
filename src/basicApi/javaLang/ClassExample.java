package basicApi.javaLang;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassExample {
    public static void main(String[] args) {
        Student student = new Student(2);
        Class class1 = student.getClass();
        System.out.println(class1.getName());
        System.out.println(class1.getSimpleName());
        System.out.println(class1.getPackage().getName());

        //이렇게 객체를 생성한 다음에 클래스 객체를 얻을 수 있다.


        try {
            Class class2 = Class.forName("basicApi.javaLang.Student");
            System.out.println(class2.getName());
            System.out.println(class2.getSimpleName());
            System.out.println(class2.getPackage().getName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //그리고 이렇게 객체를 생성하지 않아도 클래스 객체를 얻을 수 있다.
        //다만 이 경우에는 예외처리를 반드시 해주어야 한다.


        Constructor[] constructors = class1.getDeclaredConstructors();
        Field[] fields = class1.getDeclaredFields();
        Annotation[] annotations = class1.getAnnotations();
        Method[] methods = class1.getDeclaredMethods();
        //이렇게 클래스 객체를 사용해서 동적으로 클래스에 대한 정보를 얻을 수 있다.


        try {
            Object obj1 = class1.newInstance();
            //이렇게 new 를 사용하지 않고 객체를 만들 수도 있으나 11버전에서는 deprecated 됨
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
