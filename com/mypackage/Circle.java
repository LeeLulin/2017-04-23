package com.mypackage;
import java.io.*;
public class Circle {
	double r;
	double s;
	double l;
	public void area() throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
		System.out.print("请输入半径：");
		r=Double.parseDouble(br.readLine());
		s=Math.PI*r*r;
		System.out.println("面积="+s);
	}
	public void round(){
		l=Math.PI*r*2;
		System.out.println("周长="+l);
	}

}