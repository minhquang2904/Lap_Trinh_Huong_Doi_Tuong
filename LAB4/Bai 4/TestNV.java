import java.util.*;

public class TestNV{
	public static void main(String [] args){
		NhanVienB4 nv = new NhanVienB4("NV004","Luong Minh Quang",2.34);
		System.out.println("ID                  : "+nv.checkID());
		System.out.println("Full Name           : "+nv.fullName);
		System.out.println("Coefficients Salary : "+nv.coefficientsSalary);
		System.out.println("Salary              : "+nv. thunhap());
	}
}