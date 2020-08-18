import java.util.*;
public class hello{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int[] a=new int[10];
        int n=a.length;
        int j,i,t,sum=0;
        for(i=0;i<n;i++)
        {
            a[i]=in.nextInt();
            sum=sum+a[i];
        }
        for(i=0;i<n;i++)
        for(j=0;j<n;j++)
        if(a[i]<a[j])
        {
            t=a[i];
            a[i]=a[j];
            a[j]=t;
        }
        System.out.print("从大到小排列为:");
        for(i=0;i<n;i++)
            System.out.print(a[i]+" ");
        System.out.println("\naver:"+(sum/n));
        for(i=0;i<n;i++)
        if(a[i]>=aver)
        {
            System.out.print(a[i]+",");
        }
    }
}