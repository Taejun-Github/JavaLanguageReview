package thread;

public class ThreadA extends Thread{
    public ThreadA() {
        setName("ThreadA");
    }

    public void run() {
        //실행할 스레드의 내용
        System.out.println(getName());
    }
}
