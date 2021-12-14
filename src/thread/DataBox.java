package thread;

public class DataBox {
    private String data;

    public synchronized String getData() {
        if(this.data == null) {
            try {
                wait(); //데이터 필드가 비어있으면 소비자 스레드가 일시정지된다.
            } catch (Exception e) {

            }
        }

        String returnValue = data;
        System.out.println(returnValue);
        data = null;
        notify(); //data 필드를 null로 만들고 생산자 스레드를 실행 대기 상태로 만든다.
        return returnValue;
    }

    public synchronized void setData(String data) {
        if(this.data != null) {
            try{
                wait();
            } catch (Exception e) {

            }
        }
        this.data = data;
        System.out.println(data);
        notify();
    }
}
