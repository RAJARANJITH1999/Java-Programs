class ThreadOne implements Runnable
{

    /*ThreadOne(String name)
    {
         ThreadOne one=new ThreadOne(this,name);
         one.start();
    }
    */
    public void run()
    {
        try
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println("GOOD MORNING");
                
                Thread.sleep(1000);
                
            }
        }catch(InterruptedException ie){
        
            System.out.println("Thread one teriminated"); 
       }
    }

}


class ThreadTwo implements Runnable
{

    /*ThreadTwo(String name)
    {
        ThreadTwo two=new ThreadTwo(this,name);
        two.start();
    
    }
    */
    public void run()
    {
        try
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println("HELLO");
                Thread.sleep(2000);
                
            }
        }catch(InterruptedException ie){
        
            System.out.println("Thread two teriminated"); 
       }
    }

}
class ThreadThree implements Runnable
{

   /* ThreadThree(String name)
    {
        ThreadThree three=new ThreadThree(this,name);
        three.start();
    
    }*/
    
    public void run()
    {
        try
        {
            for(int i=1;i<=5;i++)
            {
                System.out.println("WELCOME");
                
                Thread.sleep(3000);
                
            }
        }catch(InterruptedException ie){
        
            System.out.println("Thread three teriminated"); 
       }
    }

}


class RunnableDemo
{
    public static void main(String a[])
    {
    
       //RunnableDemo rd=new RunnableDemo();
       
       ThreadOne ob1=new ThreadOne();
       Thread t1=new Thread(ob1);
       
       ThreadTwo ob2=new ThreadTwo();
        Thread t2=new Thread(ob2);
       
       ThreadThree ob3=new ThreadThree();
        Thread t3=new Thread(ob3    );
       
       t1.start();
       t2.start();
       t3.start();
       
       
        
    }
}
