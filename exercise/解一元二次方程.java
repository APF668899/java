import java.util.*;
public class hello{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);//输入
		double a,b,c,d,e,f,san,s;
        System.out.println("please enter:a,b,c");//输出
		a=in.nextInt();
		d=in.nextInt();
		b=in.nextInt();
		e=in.nextInt();
		c=in.nextInt();
		f=in.nextInt();
		a=a/d;
		b=b/e;
		c=c/f;
		san=b*b-4*a*c;
		s=Math.sqrt(san);
		if(san<0)
			Systemystem.out.printf("无解");
		if(san=0)
			System.out.printf("方程有两个相同的解:x1=x2=%d",-(b/2*a));
		if(san>0)
			System.out.printf("方程有两个不相同的解:x1=%d,x2=%d",(-b+s)/(2*a),(-b-s)/(2*a));
    }
}
