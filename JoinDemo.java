class ThreadJoin implements Runnable
{
    String name;
    Thread thrd;
    
    ThreadJoin(String name)
    {
        this.name=name;
        thrd=new Thread(this,name);
        thrd.start();
        
    }
    public void run()
    {
        try{
                Thread.sleep(2000);
                 
        for(int i=1;i<=3;i++)
        {
            System.out.println("\t From childe thread"+name+":i="+i);
        }
        }catch(InterruptedException ie)
        {
            System.out.println("Terminated Thread:"+name);
        }
        System.out.println("Terminating Thread:"+name);
    }
}

class JoinDemo
{
    public static void main(String args[])
    {
        ThreadJoin a=new ThreadJoin("A");
        ThreadJoin b=new ThreadJoin("B");
        
        System.out.println("Thread status: Alive");
        
        System.out.println("Thread A:"+a.thrd.isAlive());
        System.out.println("Thread b:"+b.thrd.isAlive());
        
        try
        {
            System.out.println("Threads Joining..........");
            a.thrd.join();
            b.thrd.join();
         
        }catch(InterruptedException ie)
        {
            System.out.println("exception: Thread main interrupted. ");
            
        }
        System.out.println("Thread A:"+ a.thrd.isAlive());
        System.out.println("Thread B:"+ b.thrd.isAlive());   
         System.out.println("Terminating the main thread");
    }
}

