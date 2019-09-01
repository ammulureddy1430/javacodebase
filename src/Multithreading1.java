class Multithreading1 implements Runnable {
    @Override
    public void run() {
        System.out.println("multithread testing example");
    }
    public static void main(String args[])
    {
        Thread t=new Thread(new Multithreading1());
        t.start();
    }
}
