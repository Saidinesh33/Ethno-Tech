import java.util.*;
class Temperature {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        int min=arr[0];
        int max=arr[0];
        int sum=0;
        int hot=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
            if(arr[i]>max)
            {
                max=arr[i];
            }
            sum+=arr[i];
            if(arr[i]>=35)
            {
                hot++;
            }
        }
        int avg=sum/n;
        System.out.println("min:"+min);
        System.out.println("max:"+max);
        System.out.println("avg:"+avg);
        System.out.println("hot:"+hot+"days");
    }
}