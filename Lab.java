public class Lab extends Thread
{
	public void run()
	{
		if(Thread.currentThread().isDaemon())
			System.out.println("daemon thread executing");
		else
			System.out.println("normal thread excuting");
		
	}
	
	public static void main(String[] s)
	{
		Lab a=new Lab();
		Lab b=new Lab();
		a.setDaemon(true);
		a.start();
		b.start();
	}
}