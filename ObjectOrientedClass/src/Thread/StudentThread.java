package Thread;

public class StudentThread extends Thread {
    private SharedBoard board;

    public StudentThread(String name, SharedBoard board) {
        super(name); //스레드 이름 지정
        this.board = board;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                board.add();
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}