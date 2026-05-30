import java.util.*;
class RotateArr {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        int k=s.nextInt();
        int temp[] = new int[n];

        for(int i = 0; i < n; i++) {
            temp[(i + k) % n] = arr[i];
        }

        for(int i = 0; i < n; i++) {
            System.out.print(temp[i] + " ");
        }

    }

}