package basicApi.javaLang;

public class StringValueOfExample {
    public static void main(String[] args) {
        String str1 = String.valueOf(10.111);
        String str2 = String.valueOf(true);
        String str3 = String.valueOf('c');
        //이런식으로 double, boolean, char 등을 문자열로 변환하려면 valueof를 사용한다.
    }
}
