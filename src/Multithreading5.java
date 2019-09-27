public class Multithreading5 extends Thread {
    public void run()
    {
        int i;
        for(i=0; i<10; i++)
        {
            System.out.println("Ammulu Reddy");
        }
        try {
            Thread.sleep(1000);
        }catch (InterruptedException ex) {
            System.out.println(ex.getMessage());

        }

    }
public static void main(String args[])
{
    Multithreading5 m=new Multithreading5();
    m.setDaemon(true);
    m.start();
    System.out.println("Arun Reddy");
}
}

