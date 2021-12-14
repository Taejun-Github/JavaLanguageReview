package thread;

import java.awt.*;

public class BeepPrintExample2 {
    public static void main(String[] args) {
        Runnable beepTask = new BeepTask();
        Thread thread = new Thread(beepTask);
        thread.start();//이 순간부터 메인 스레드 이외에 새로운 스레드가 동시에 실행된다.

        Thread thread2 = new Thread(()-> {
           Toolkit toolkit = Toolkit.getDefaultToolkit();
           for(int i=0; i<5; i++) {
               toolkit.beep();
               try {
                   Thread.sleep(500);
               } catch(Exception e) {

               }
           }
        }); //이렇게 람다식으로 익명 객체를 매개값으로 설정할 수도 있다.

        for(int i=0; i<5; i++) {
            System.out.println("aa");
            try {
                Thread.sleep(500);
            } catch (Exception e) {

            }
        }
    }
}
