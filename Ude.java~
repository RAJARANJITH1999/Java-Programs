class MyException extends RuntimeException
{
    String info;
    MyException()
    {
        info="default";
        
    }
    MyException(String infor)
    {
        info=infor;
        
    }
    public String toString()
    {
        return "MyException is generated with information";
    }
}
class Ude
{
    public static void main(String arg[])
    {
        try{
            throw new MyException("1st time");
        }catch(MyException me){
            System.out.println(me);
        }
    }
}
