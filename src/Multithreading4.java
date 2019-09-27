public class Multithreading4 extends Thread{
    public void run()
    {
        System.out.println("thread name:"+Thread.currentThread().getName());
        System.out.println("thread priority:"+Thread.currentThread().getPriority());
    }
    public static void main(String args[])
    {
        Multithreading4 m1=new Multithreading4();
        Multithreading4 m2=new Multithreading4();
        m1.setPriority(Thread.MIN_PRIORITY);
        m2.setPriority(Thread.MAX_PRIORITY);
        m1.start();
        m2.start();
    }
}
