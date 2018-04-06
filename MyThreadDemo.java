class MyThread extends Thread
{
    public void run()
    {

        for(int i=0;i<3;i++)
        {
            System.out.println("child"+i);

        }

    }
    MyThread()
    {
        super("child");
        start();
    }
}

class MyThreadDemo
{
    public static void main(String args[])
    {
        MyThread mt=new MyThread();
        boolean stopFlag=true;

        for(int i=0;i<3;i++)
        {
            System.out.println("main"+i);

        }

        while(stopFlag)
        {
            if(mt.isAlive())
            {
                System.out.println("child Alive");
                stopFlag=true;
            }
            else
            {
                System.out.println("child Dead");
                stopFlag=false;
            }
        }
    }
}
