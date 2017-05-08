class Mian{
	double area(double r){
		return Math.PI*r*r;
	}
	double area(double l,double w){
		return l*w;
	}
	double area(double d1,double d2,double h){
		return (d1+d2)*h/2;
	}
}	
public class MianJiTest{
	public static void main(String args[]){
		Mian a=new Mian();
		double s1=a.area(3.0);  
		System.out.println("1个参数：圆面积为="+s1);
		double s2=a.area(3.0,4.0);
		System.out.println("2个参数：矩形的面积="+s2);
		double s3=a.area(3.0,4.0,5.0);
		System.out.println("3个参数：梯形的面积="+s3);		
	}
}
