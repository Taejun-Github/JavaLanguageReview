package basicApi.javaLang;

import java.util.Objects;

public class CompareExample {
    public static void main(String[] args) {
        Student s1 = new Student(1);
        Student s2 = new Student(2);
        Student s3 = new Student(3);

        int result = Objects.compare(s2, s1, new StudentComparator());
        //이런식으로 비교할 수 있다. Objects 클래스는 객체 비교, 해시코드 생성 등등의 연산을 수행하는 정적 메소드들로 구성된 Object의 유틸리티 클래스이다.

    }
}
