import java.util.*;
class SumOfEvenBetweenRange
{
    public static void main()
    {
        int i,n,m,s=0;
        Scanner ob=new Scanner(System.in);
        System.out.println("enter 2 nos");
        n=ob.nextInt();
        m=ob.nextInt();
        for(i=n;i<=m;i++)
        {
            if(i%2==0)
            {
                s=s+i;
            }
        }
        System.out.println(s);
    }
}
