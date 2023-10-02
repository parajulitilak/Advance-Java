/*
 * 12. Write a program to create two threads. The first thread should print numbers from 1 to
 * 10 at intervals of 0.5 second and the second thread should print numbers from 11 to 20
 * at the interval of 1 second
*/
package Unit1ProgrammingwithJava;

public class TwoThreadExample {
    public static void main(String[] args) {
        // Create and start the first thread
        Thread thread1 = new Thread(new NumberPrinter(1, 10, 500));
        thread1.setName("Thread 1");
        thread1.start();

        // Create and start the second thread
        Thread thread2 = new Thread(new NumberPrinter(11, 20, 1000));
        thread2.setName("Thread 2");
        thread2.start();
    }

    static class NumberPrinter implements Runnable {
        private final int start;
        private final int end;
        private final long intervalMillis;

        public NumberPrinter(int start, int end, long intervalMillis) {
            this.start = start;
            this.end = end;
            this.intervalMillis = intervalMillis;
        }

        @Override
        public void run() {
            for (int i = start; i <= end; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
                try {
                    Thread.sleep(intervalMillis);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
