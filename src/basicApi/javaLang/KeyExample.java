package basicApi.javaLang;

import java.util.HashMap;

public class KeyExample {
    public static void main(String[] args) {
        HashMap<Key, String> hashMap = new HashMap<>();

        hashMap.put(new Key(1), "aa");

        String value = hashMap.get(new Key(1));
        System.out.println(value);

        //이 경우에 문자 aa를 제대로 읽어오지 못하고 null을 출력한다. 왜냐하면 hashCode값을 오버라이딩 하지 않아서 다른 hashCode를 가지기 때문이다.
        //비록 equals를 오버라이딩 했지만 hashCode를 오버라이딩 하지 않아서 서로 다른 객체로 인식하는 것이다.
    }
}
