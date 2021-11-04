package JavaTHREAD;

public class Counter implements Runnable {
   private int count = 0;
    @Override
    public void run() {

        while (!Thread.interrupted()) {
            try {

                count++;
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);

//                System.out.println(count);
                Thread.currentThread().interrupt();

                System.out.println("count Thread Terminated");

            }
//            System.out.println(count);
        }
    }

    public int getCount() {
        return count;
    }
}
