abstract class Bank
{
    public abstract void interestRate();
}

class SBI extends Bank
{
    @Override
    public void interestRate()
    {
        System.out.println("SBI Interest Rate: 6.5%");
    }
}

class HDFC extends Bank
{
    @Override
    public void interestRate()
    {
        System.out.println("HDFC Interest Rate: 7%");
    }
}

public class Main3
{
    public static void main(String args[])
    {
        Bank obj1=new SBI();
        obj1.interestRate();

        Bank obj2=new HDFC();
        obj2.interestRate();
    }
}