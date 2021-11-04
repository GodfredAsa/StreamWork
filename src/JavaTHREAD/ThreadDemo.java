package JavaTHREAD;

import jdk.swing.interop.SwingInterOpUtils;

public class ThreadDemo extends Thread {
    int count = 0;
    public void run() {

        System.out.println("count Thread started ");
        while (!Thread.interrupted()) {
            try {

                count++;
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);

                System.out.println(count);
                Thread.currentThread().interrupt();

                System.out.println("count Thread Terminated");

            }
            System.out.println(count);
        }
    }

}
