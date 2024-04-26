public class EvenOddThreads {
    public static void main(String[] args) {
        Thread oddThread = new Thread(new OddPrinter());
        Thread evenThread = new Thread(new EvenPrinter());

        oddThread.start();
        evenThread.start();
    }
}

class EvenPrinter implements Runnable {
    public void run() {
        for (int i = 2; i <= 200; i += 2) {
            System.out.printf("%-5d  ", i);
            try {
                Thread.sleep(100); // Delay for better visualization
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class OddPrinter implements Runnable {
    public void run() {
        for (int i = 1; i <= 199; i += 2) {
            System.out.printf("%-5d %n", i);
            try {
                Thread.sleep(100); // Delay for better visualization
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
