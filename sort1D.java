import java.util.*;
public class sort1D
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int a[]=new int[10];
        for(int i=0;i<5;i++)
        {
            a[i]=in.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                int t=0;
                if(a[i]<a[j])
                {
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
        for(int i:a)
        System.out.println(i);
    }
}