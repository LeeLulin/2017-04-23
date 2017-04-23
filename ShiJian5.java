import java.io.*;
public class ShiJian5 {
	public static void main(String args[])throws IOException{
		System.out.print("请输入用户的身份证号码：");
		BufferedReader a= new BufferedReader(new InputStreamReader(System.in));
		StringBuffer b=new StringBuffer(a.readLine());
		String year=b.substring(6,10);
		String month=b.substring(10,12);
		String day=b.substring(12,14);
		System.out.println("该用户的生日是："+year+"年"+month+"月"+day+"日");
	}

}