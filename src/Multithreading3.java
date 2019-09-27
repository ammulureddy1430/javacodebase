public class Multithreading3 extends Thread {
    
    public static void main(String args[])
    {
        Multithreading3 t1=new Multithreading3();
        Multithreading3 t2=new Multithreading3();
        System.out.println("thread1 name:"+t1.getName());
        System.out.println("thread2 name:"+t2.getName());
t1.setName("Ammulu Reddy");
System.out.println("after changing:"+t1.getName());
t2.setName("Arun Reddy");
System.out.println("after changing:"+t2.getName());
    }
}
