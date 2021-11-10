public class Main {
    public static void main(String[] args) {

        Board board = new Board();
        MyThread thread1 = new MyThread("Thread1", board);
        MyThread thread2 = new MyThread("Thread2", board);

        thread1.start();
        thread2.start();
    }
}

