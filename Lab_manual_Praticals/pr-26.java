public class TwoThreads extends Thread {
    private String name;
    private int delay;

    public TwoThreads(String name, int delay) {
        this.name = name;
        this.delay = delay;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println(name);
            try {
                sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new TwoThreads("Thread1", 1000);
        Thread thread2 = new TwoThreads("Thread2", 2000);

        thread1.start();
        thread2.start();
    }
}
