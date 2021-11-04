package JavaTHREAD;

import java.util.Scanner;

public class Main {

private static Scanner scanner  = new Scanner(System.in);
    public static void main(String[] args) {
        ThreadDemo t1 = new ThreadDemo();
        Counter counter  = new Counter();
        Thread t2 = new Thread(counter);
        t2.start();
        System.out.println("Enter a statement: ");
        String inputVal  = scanner.nextLine();
        t2.interrupt();
//
//        System.out.println(counter.getCount());

 
        try {
            System.out.println("Current Thread: " + Thread.currentThread().getName());
            t2.join();
        }

        catch(Exception ex) {
            System.out.println("Exception has been caught " + ex);
        }

        System.out.println("Current Thread: " + Thread.currentThread().getName());

    }
}
