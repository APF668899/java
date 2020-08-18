import java.util.*;
public class hello
{
//输出棋盘
public static void chess(int i,int j,int n,int array[20][20],char char_1[20][20])
{
    //输出行列标号
        System.out.print("盘");
        for(j=0;j<n;j++,a++)
            System.out.print(char_1[0][j]+" ");
         System.out.println();  
        for(i=0;i<n;i++,b++)  
        {
            System.out.print(char_1[i][0]+" ");
            i++;
                for(j=0;j<n;j++)
                {
                     System.out.print(array[i][j]+" ");
                }
            i--;
            System.out.println();
        }
}

public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    char[][] char_1=new char[20][20];
    int[][] array=new int[20][20];
    int i,j,n;
    char a='A',b='a';
    n=16;
    //输入行列标号
    for(j=0;j<n;j++,a++)
        char_1[0][j]=a;
    for(i=0;i<n;i++,b++)
        char_1[i][0]=b;
    //令所有数据都为0
    for(i=1;i<n;i++)
    for(j=1;j<n;j++)
    {
        array[i][j]=0;
    }
    chess(i,j,n,array[][],char_1[20][20]);  
}
}