class message{
	String name;
	String job;
	String subject;
	String age;
	public message(String n1,String j1,String s1,String a1){
		name=n1;
		job=j1;
		subject=s1;
		age=a1;
	}
	String xingming(String n){
	    return n;	
	}
	String zhuanye(String j){
		return j;
	}
	String kecheng(String s){
		return s;
	}
	String nianling(String a){
		return a;
	}
}
public class Teacher {
	public static void main(String args[]){
		message name1=new message("李璐琳","Java","Java开发","1");
		String ming,zhuan,ke,nian;
		ming=name1.xingming("李璐琳");
		zhuan=name1.zhuanye("Java");
		ke=name1.kecheng("Java开发");
		nian=name1.nianling("1");
		System.out.println("姓名:"+ming);
		System.out.println("专业方向:"+zhuan);
		System.out.println("教授课程:"+ke);
		System.out.println("教龄:"+nian);
	}

}
