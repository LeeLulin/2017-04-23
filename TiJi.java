import java.io.*;
class JiSuan {
	double a;
	double b;
	double c;
	double s,s1,s2,s3;
	double min;
	public void ChangFang() throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("请输入第一个整数：");
		a=Double.parseDouble(br.readLine());
		System.out.print("请输入第二个整数：");
		b=Double.parseDouble(br.readLine());
		System.out.print("请输入第三个整数：");
		c=Double.parseDouble(br.readLine());
		s=a*b*c;
		System.out.println("长方体的体积是："+s);
	}
	public void YuanZhu(){
		s1=Math.PI*a*a*a;
		s2=Math.PI*b*b*b;
		s3=Math.PI*c*c*c;
		if(s1>s2){
			min=s2;
		}
		else{
			min=s1;
		}
		if(min>s3){
			min=s3;
		}
		System.out.println("圆柱体的体积分别是：");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println("其中最小的是："+min);
	}
}
public class TiJi{
	public static void main(String args[]) throws IOException{
		JiSuan s=new JiSuan();
		s.ChangFang();
		s.YuanZhu();
}
	
}