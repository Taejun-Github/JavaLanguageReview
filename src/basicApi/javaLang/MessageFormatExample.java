package basicApi.javaLang;

import java.text.MessageFormat;

public class MessageFormatExample {
    public static void main(String[] args) {
        String id = "java";
        String name ="노무현";
        String tel = "010-123-4343";

        String text = "ID: {0} Name: {1} Tel: {2}";
        String result1 = MessageFormat.format(text, id, name, tel);
        System.out.println(result1);

        String sql = "insert into member values( {0}, {1}, {2} )";
        Object[] arguments = {"'java'", "'노무현'", "'010-232-3242'"};
        String result2 = MessageFormat.format(sql, arguments);
        System.out.println(result2);
    }
}
