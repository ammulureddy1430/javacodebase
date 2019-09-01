class Multithreading1 implements Runnable {
    @Override
    public void run() {
        int i;
        for(i=0;i<10;i++)
            try{
        System.out.println(Thread.currentThread()+"value"+i);
            } catch(Interruptedexception e)
                Thread.sleep(100);
    }
    public static void main(String args[])
    {
        Thread t=new Thread(new Multithreading1());
        t.start();
    }
}
