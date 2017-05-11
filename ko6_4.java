class koA{
	public int x=10,y=20;
	public void display(){
		int z;
		z=x+y;
		System.out.println("add="+z);
	}
}
class koB extends koA{
	public void display(){
		int z;
		z=x*y;
		System.out.println("product="+z);
	}
}
public class ko6_4 extends koB{
	public static void main(String args[]){
		koA num1=new koA();
		koB num2=new koB();
		ko6_4 num3=new ko6_4();
		num1.display();
		num2.display();
		num3.display();
	}
}
