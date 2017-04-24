class Circle{
	float radius;
	public Circle(float r1){
		radius=r1;
	}
	float area(float r){
		return (float) (Math.PI*r*r);
	}
	float round(float r2){
		return (float)(Math.PI*r2*2);
	}
}
public class MianJi {
	public static void main(String args[]){
		Circle s=new Circle(5);
		Circle l=new Circle(5);
		float s1,l1;
		s1=s.area(5);
		l1=l.round(5);
		System.out.println("面积="+s1+"  周长="+l1);
	}

}
