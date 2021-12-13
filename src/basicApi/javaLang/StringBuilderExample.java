package basicApi.javaLang;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("java ");
        sb.append("programming study");
        System.out.println(sb.toString());
        //이것의 장점은? 그냥 +로 하면 그때마다 새로운 객체를 참조하고 기존 객체의 메모리를 비워줘야 하기 때문에 느리다.
        //문자열 변경 작업이 많을 때는 이렇게 하는 것이 좋다.

        String result = sb.toString();

        //StringBuffer도 똑같은 방법으로 사용한다. 다만 StringBuffer는 멀티 스레드 환경에서도 사용할 수 있다는 차이점이 있다.
    }
}
