import java.util.*;
class arrsum
{
        public static void main(String args[])
        {
            Scanner obj=new Scanner(System.in);
            int i,n,sum=0;
            System.out.println("Enter the no of elements:");
            n=obj.nextInt();
            int a[]=new int[n];
            System.out.println("Enter the elements:\n");
            for(i=0;i<n;i++)
            {
                a[i]=obj.nextInt();
            }
            for(i=0;i<n;i++)
            {
                sum=sum+a[i];
            }
            System.out.println("Sum of "+n+" elements in an array="+sum);
        }
}
