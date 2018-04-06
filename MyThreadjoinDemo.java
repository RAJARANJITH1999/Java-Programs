import java.io.*;
class MyThread implements Runnable
{
    String name;
    Thread thrd;
    public void run()
    {

        for(int i=0;i<10;i++)
        {
            System.out.println("child"+i);

        }

    }
    public MyThread(String name)
    {
        this.name=name;
        thrd=new Thread(this,name );
        thrd.start();
    }
}
class MyThreadjoinDemo
{
    public static void main(String args[])
    {
        MyThread obj=new MyThread("Sample");
        
        for(int i=0;i<10;i++)
        {
            System.out.println("main"+i);
        }
        
        try
        {
            obj.thrd.join();
        }catch(InterruptedException ie)
          {
            System.out.println("join Interrupted");
          }
    }
}
