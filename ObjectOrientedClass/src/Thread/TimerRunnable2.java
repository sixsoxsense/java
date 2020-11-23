package Thread;

public class TimerRunnable2 implements Runnable{
    private char n = 'A';

    @Override
    public void run() {
        while (true) {
            if (n>'Z'){
                n='A';
            }
            System.out.println(n++);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
