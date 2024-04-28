public class Threads extends Thread {
    private String name;
    private int delay;

    public Threads(String name, int delay) {
        this.name = name;
        this.delay = delay;
    }

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
        Thread t1 = new Threads("Thread1", 1000);
        Thread t2 = new Threads("Thread2", 2000);

        t1.start();
        t2.start();
    }
}
