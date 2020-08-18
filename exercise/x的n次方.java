import java.util.*;
public class hello
{
public static void pow(int x,int y)
{
    int[] =new int a[];
   static final  int sum=0,i=1;
    if(y==0)
        sum=1;
    if(y==1)
        sum=x;
    if(y==2&&y%2==0)
        sum=x*x;
    for(i=1;i<=a.length;i++)
        sum=sum*a[i];
    if(y/2!=1&&y%2==0)
    {
        a[i]=x;
        i++;
        pow(x*x,y/2);
    }   
}

public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int x,y;
    x=in.nextInt();
    y=in.nextInt();
    pow(x,y);
}
} 