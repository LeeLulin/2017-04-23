import com.taksemployee.*;
import java.io.*;
public class EmployeeTest{	  //测试类
	 public  static void main(String[] args) throws IOException {	 //程序入口方法
		Employee employee1=new Employee();	//创建类的对象
		employee1.inputEmployee();
		employee1.calcRealSalary();
		employee1.showEmployeeInfo();
		employee1.showRealSalary();
		}
	}