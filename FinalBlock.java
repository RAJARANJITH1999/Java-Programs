import java.util.Scanner;
class A
{
    Scanner s=new Scanner(System.in);
    
     public int a;
     public int b;
     public int c;
     String ss;
    A()
    {
        System.out.println("enter the value of a");
        a=s.nextInt();
    
        System.out.println("enter the value of b");
        b=s.nextInt();
    }
    
    
    void check()throws InterruptedException{
        //try{
           c=a/b; 
		   throw new InterruptedException("jvm has rectified the error");
        //}catch(InterruptedException e){
            //System.out.println("divde by zero:"+e);
           // c=0;
        
        //}finally{
        //    System.out.println("Error has been successfully indentified and cleared");
        //    System.out.println("value of c = "+c);
        //}
    }       
}
class FinalBlock 
{
    public static void main(String arg[])
    {
		try{
			A aa= new A();
    aa.check();
		}catch(InterruptedException e)
		{
			System.out.println(e);
		}
    
    }
}
