package Thread;

public class TestThread {
    public static void main(String[] args) {
        TimerThread th = new TimerThread();
        TimerThread2 th2 = new TimerThread2();
        Thread tr = new Thread(new TimerRunnable());

        //th2.start();
        //tr.start();

        th.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            return;
        }
        th.interrupt();
    }
}
