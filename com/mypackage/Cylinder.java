package com.mypackage;
import java.io.*;
public class Cylinder {
	double radius;
	Cylinder(){
		radius=0;
	}
	Cylinder(double r){
		radius=r;
	}
	double banjing(){
		return radius;
	}
	double round(){
		return Math.PI*radius*2;
	}
	double area(){
		return Math.PI*radius*radius;
	}
	void display(){
		System.out.println("圆半径="+banjing());
		System.out.println("圆周长="+round());
		System.out.println("圆面积="+area());
	}
}
