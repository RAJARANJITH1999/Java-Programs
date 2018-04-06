
class MultipleCatches
{
    public static void main(String args[])
    {
        try{
        
            int a=args.length;
            
            System.out.println("a="+a);
            
            int b=42/a;
            int c[]={1};
            c[42]=34;                                                                                                
            
        }
        catch(ArithmeticException e1){
            System.out.println("divide by 0:"+ e1);
        }
        catch(ArrayIndexOutOfBoundsException e2){
            System.out.println("array index out of bound:"+e2);
        }
        catch(Throwable e3){
            System.out.println("exception caught:"+e3);   
        }
    }
}
