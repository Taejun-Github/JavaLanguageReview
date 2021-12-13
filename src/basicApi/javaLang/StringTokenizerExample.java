package basicApi.javaLang;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        String text="이명박/박근혜/문재인";

        StringTokenizer st = new StringTokenizer(text, "/");
        int countTokens = st.countTokens(); //꺼내지 않고 남아있는 토큰의 수
        for(int i=0; i<countTokens; i++) {
            String token = st.nextToken();
            System.out.println(token);
        }

        //이렇게 두가지 방법으로 반복문을 사용할 수 있다.
        st = new StringTokenizer(text, "/");
        while(st.hasMoreTokens()) {
            String token = st.nextToken();
            System.out.println(token);
        }
    }
}
