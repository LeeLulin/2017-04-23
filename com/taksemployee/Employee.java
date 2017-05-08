package com.taksemployee;
import java.io.*;
public class Employee {
	String number;
	String name;
	double basicSalary;
	double unfixedSalary;
	double realSalary;
		public void inputEmployee() throws IOException {		
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
		    System.out.print("请输入员工号："); 
		    number = br.readLine();
		    System.out.print("请输入姓名：");
		    name = br.readLine();
		    System.out.print("请输入基本工资：");
		    basicSalary = Double.parseDouble(br.readLine());
		    System.out.print("请输入岗位津贴：");
		    unfixedSalary =Double.parseDouble(br.readLine());	
		    }	
		    public void calcRealSalary(){
				realSalary=basicSalary+unfixedSalary;}	
		    public void showRealSalary(){
				System.out.println("实际收入: "+realSalary);	}	
		    public void showEmployeeInfo(){
				System.out.println("员工号:"+number+" 姓名："+name);}	
	}
