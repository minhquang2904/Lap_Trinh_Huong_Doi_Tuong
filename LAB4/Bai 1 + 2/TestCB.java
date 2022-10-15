import java.util.*;

public class TestCB{ // test can bo bai 2 
	public static void main(String[] args){
		CanBo cb = new CanBo("51900420","Luong Minh Quang",2012,1.3,4,"Truong phong",5.0,"Can bo lanh dao");
		System.out.println("ID                   : "+cb.ID);
		System.out.println("FULL NAME            : "+cb.fullName);
		System.out.println("Year Joined          : "+cb.yearJoined);
		System.out.println("COEFFICIENTS SALARY  : "+cb.coefficientsSalary);
		System.out.println("AllowanceCoefficient : "+cb.allowanceCoefficient);
		System.out.println("Leadership Allowanc  : "+cb.getLeadershipAllowance());
		System.out.println("Num Day Off          : "+cb.numDayOff);
	    System.out.println("GRADED               : "+cb.considerEmulationCB());
		System.out.println("Position             : "+cb.position);
		System.out.println("Department           : "+cb.department);
		System.out.println("Salary               : "+cb.getSalaryCB());
	}
}