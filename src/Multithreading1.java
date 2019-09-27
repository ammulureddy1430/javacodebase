class Multithreading1 implements Runnable {
    @Override
    public void run() {
        int i;
        for (i = 1; i < 10; i++)
            try {


Thread.sleep(100);
            } catch (InterruptedException e)
            {
                System.out.println(e);
            }
        System.out.println( "value" + i);
    }

    public static void main(String args[])
    {
        Thread t=new Thread(new Multithreading1());
        t.start();
    }
}
