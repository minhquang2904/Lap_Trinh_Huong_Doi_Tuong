import java.util.*;

public class TestNV{ // test nhan vien bai 1
	public static void main(String[] args){
		NhanVienB1 nv = new NhanVienB1("51900420","Luong Minh Quang",2012,1.3,1);
		System.out.println("ID                  : "+nv.ID);
		System.out.println("FULL NAME           : "+nv.fullName);
		System.out.println("Year Joined         : "+nv.yearJoined);
		System.out.println("SENIORITY SALARY    : "+nv.getSenioritySalary());
		System.out.println("COEFFICIENTS SALARY : "+nv.coefficientsSalary);
		System.out.println("Num Day Off         : "+nv.numDayOff);
		System.out.println("GRADED              : "+nv.considerEmulationNV());
		System.out.println("SALARY              : "+nv.getSalaryNV());
	}
}