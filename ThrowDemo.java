class ThrowDemo
{
    static void demoproc(){
        try{
            throw new NullPointerException("demo");
            
        }catch(NullPointerException e){
        System.out.println("caught inside the demproc");
        throw e;
        }
     }
    public static void main(String ar[])
    {
        try{
            demoproc();
         
        }catch(NullPointerException e){
            System.out.println("recaught :"+e);
			throw e;
             
        }
     
    }
}
