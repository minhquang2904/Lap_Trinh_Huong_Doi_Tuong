import java.util.*;

public class CanBo extends NhanVienB1{
	protected String position ; // chuc vu nhan vien
	protected  double allowanceCoefficient ; // he so phu cap mac dinh 5.0
	protected String department ; // phong ban 
	
	public CanBo(){
		super();
		position = "Truong phong";
		department = "";
		allowanceCoefficient = 5.0 ; 
	}
	
	public CanBo(String ID , String fullName , double coefficientsSalary , String position , double allowanceCoefficient){ // khoi tao 5 tham so 
		super(ID,fullName,coefficientsSalary);
		this.position = position ; 
		this.allowanceCoefficient = allowanceCoefficient;
		this.yearJoined = 2020 ; 
		this.numDayOff = 1 ;
	}
	
	public CanBo(String ID , String fullName , int yearJoined , double coefficientsSalary , double numDayOff ,String position , double allowanceCoefficient ,String department){ // khoi tao day du 
		super(ID,fullName,yearJoined,coefficientsSalary,numDayOff);
		this.ID = ID ; 
		this.fullName = fullName ; 
		this.yearJoined = yearJoined ; 
		this.coefficientsSalary = coefficientsSalary ;
		this.numDayOff = numDayOff;
		this.position = position ; 
		this.allowanceCoefficient = allowanceCoefficient;
		this.department = department;
	}
	
	public String considerEmulationCB(){ // xet thi dua cua can bo
		return "A";
	}
	
	public double getLeadershipAllowance(){ // phu cap lanh dao
		double leadershipallowance ;
		return leadershipallowance = 5.0 * 1150;
	}
	
	public double getSalaryCB(){ // tong luong lanh dao
		double salaryCB  ;
		salaryCB = 1150 * 5.0 * this.coefficientsSalary * 1.0 + getLeadershipAllowance();
		return salaryCB;
	} 
}