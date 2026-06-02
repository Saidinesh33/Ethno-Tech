import java.util.ArrayList;
import java.util.Scanner;
class StudentNames 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        for (int i=0;i<5;i++) 
        {
            names.add(sc.nextLine());
        }
        for (String name:names) {
            System.out.println(name);
        }
    }
}