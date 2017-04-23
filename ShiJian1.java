import java.io.*;
public class ShiJian1 {
    public static void main(String args[])throws IOException{
    	System.out.println("请输入五个字符：");
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		char[] a=str.toCharArray();
		int i;
		for(i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]);
		}
		
	}

}
