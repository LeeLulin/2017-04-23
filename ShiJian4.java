import java.io.*;
import java.util.*;
public class ShiJian4 {
	public static void main(String args[])throws IOException{
		String fruit[]=new String[5];
		BufferedReader a= new BufferedReader(new InputStreamReader(System.in));
		for(int i=0;i<fruit.length;i++){
			System.out.print("请输入第"+(i+1)+"种水果(英文）：");
			fruit[i]=a.readLine();
		}
		Arrays.sort(fruit);
		System.out.println("这些水果在字典中出现的顺序是：");
		for(int j=0;j<fruit.length;j++){
			System.out.println(fruit[j]);
		}
	}

}