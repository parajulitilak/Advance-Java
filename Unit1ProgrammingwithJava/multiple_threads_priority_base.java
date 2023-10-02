/*
 * 13.Write a program to execute multiple threads in priority base. [2075]
 */

package Unit1ProgrammingwithJava;

public class multiple_threads_priority_base {
    public static void main(String[] args) {
        // Create three threads with different priorities
        Thread thread1 = new Thread(new MyRunnable(), "Thread 1");
        Thread thread2 = new Thread(new MyRunnable(), "Thread 2");
        Thread thread3 = new Thread(new MyRunnable(), "Thread 3");

        thread1.setPriority(Thread.MIN_PRIORITY); // Minimum priority (1)
        thread2.setPriority(Thread.NORM_PRIORITY); // Normal priority (5)
        thread3.setPriority(Thread.MAX_PRIORITY); // Maximum priority (10)

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();
    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " - Count: " + i);
                try {
                    Thread.sleep(100); // Sleep for a short time to simulate some work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
