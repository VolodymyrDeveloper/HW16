class MyThread extends Thread {
    private String name;
    private static int counter= 1;
    private Board board;

    public MyThread(String name, Board board) {
        this.name = name;
        this.board = board;
    }

    @Override
    public void run() {
        synchronized (this.board) {
            for (int i = 0; i < 10; i++) {
                this.board.notify();
                System.out.println(name + "-" + counter++);
                try {
                    if (i==9)
                        break;
                    this.board.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

