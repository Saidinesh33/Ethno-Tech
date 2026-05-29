//current bill
import java.util.Scanner;
class ElectricityBill 
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int units = s.nextInt();
        System.out.println("Electricty bill " + eleBill(units));
    }
    static int eleBill(int units)
    {
        return ((units > 250) & true) ? units - 250 : 0;
    }
}