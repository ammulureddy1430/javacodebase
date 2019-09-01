public class Multithreading extends Thread {
    public void run() {
        int i;
        for (i = 0; i < 10; i++)
            System.out.println("value" + i);
        System.out.println("value");
    }

    public static void main(String args[]) {
        Multithreading t1 = new Multithreading();
        t1.start();
    }
}
