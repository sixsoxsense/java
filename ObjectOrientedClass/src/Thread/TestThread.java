package Thread;

public class TestThread {
    public static void main(String[] args) {
        TimerThread th = new TimerThread();
        TimerThread2 th2 = new TimerThread2();
        Thread tr = new Thread(new TimerRunnable());
        SharedBoard board = new SharedBoard();
        StudentThread st = new StudentThread("st :", board);
        StudentThread st1 = new StudentThread("st1 :", board);
        //th2.start();
        //tr.start();

        st.start();
        st1.start();
/**
 th.start();
 try {
 Thread.sleep(5000);
 } catch (InterruptedException e) {
 return;
 }
 th.interrupt();

 th.start();
 th.finish();**/
    }
}
