class Circl{
	double calculate(double r){
		return Math.PI*r*r;
	}
	double calculate(double r,double h){
		return Math.PI*r*r*h;
	}
}
public class CircleTest {
	public static void main(String arge[]){
		Circl a=new Circl();
		double b1=a.calculate(5);
		System.out.println("圆的面积="+b1);
		double b2=a.calculate(5,5);
		System.out.println("圆柱的体积="+b2);
	}

}
