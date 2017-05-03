class Mian{
	double area(double r){  //根据半径求圆的面积
		return Math.PI*r*r;
	}
	double area(double l,double w){   //根据长、宽求矩形的面积
		return l*w;
	}
	double area(double d1,double d2,double h){ //根据上下底和高求梯形的面积
		return (d1+d2)*h/2;
	}
}	
public class MianJiTest{
	public static void main(String args[]){  //根据参数个数的不同调用不同的成员方法
		Mian a=new Mian();
		double s1=a.area(3.0);  
		System.out.println("1个参数：圆面积为="+s1);
		double s2=a.area(3.0,4.0);
		System.out.println("2个参数：矩形的面积="+s2);
		double s3=a.area(3.0,4.0,5.0);
		System.out.println("3个参数：梯形的面积="+s3);		
	}
}
