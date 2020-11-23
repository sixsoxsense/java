package Thread;

public class TimerThread2 extends Thread {
    private char n = 'A';

    @Override
    public void run() {
        while (true) {
            if (n>'Z'){
                n='A';
            }
            System.out.println(n++);

            try {
                sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
