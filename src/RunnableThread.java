public class RunnableThread implements Runnable {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        RunnableThread obj = new RunnableThread();
        Thread t = new Thread(obj);
        t.start();
    }
}