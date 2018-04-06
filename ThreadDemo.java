class ThreadOne extends Thread
{

    
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


class ThreadTwo extends Thread
{
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
class ThreadThree extends Thread
{
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


class ThreadDemo
{
    public static void main(String a[])
    {
        ThreadOne one=new ThreadOne();
        one.start();
        
        
        ThreadTwo two=new ThreadTwo();
        two.start();
        
        
        ThreadThree three=new ThreadThree();
        three.start();
    
    }
}
