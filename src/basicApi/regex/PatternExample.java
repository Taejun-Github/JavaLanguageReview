package basicApi.regex;

import java.util.regex.Pattern;

public class PatternExample {
    public static void main(String[] args) {
        String regExp = "(02|010)-\\d{3,4}-\\d{4}";
        String data = "010-123-4556";
        boolean result = Pattern.matches(regExp ,data);

        if(result) {
            System.out.println("정규식과 일치");
        } else {
            System.out.println("정규식과 일치하지 않음");
        }

        regExp = "\\w+@\\w+(\\.\\w+)?";
        data = "angel@naver.com";
        result = Pattern.matches(regExp, data);

        if(result) {
            System.out.println("정규식과 일치");
        } else {
            System.out.println("정규식과 일치하지 않음");
        }

        //Pattern.matches(정규식, 문장) 이렇게 만든다.
    }
}
