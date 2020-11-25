package Thread;

public class SharedBoard {
    private int sum = 0;
    int n = 0;

    synchronized public void add() {
        n = sum;
        n += 10;
        sum = n;
        System.out.println(Thread.currentThread().getName() + sum);
    }
}
