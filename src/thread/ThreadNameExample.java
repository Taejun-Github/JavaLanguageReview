package thread;

public class ThreadNameExample {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        System.out.println(mainThread.getName());

        ThreadA threadA = new ThreadA();
        System.out.println(threadA.getName());
        threadA.run();

        ThreadB threadB = new ThreadB();
        System.out.println(threadB.getName());
        threadB.start();

        //메인 스레드는 main이라는 이름을 가지고 있고 직접 생성한 스레드는 자동적으로 Thread-n이라는 이름으로 생성된다.
        //다른 이름으로 설정하고 싶다면 Thread 클래스의 setName() 메소드로 변경하면 된다.
    }
}
