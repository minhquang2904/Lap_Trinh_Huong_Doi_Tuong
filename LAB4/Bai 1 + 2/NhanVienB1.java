import java.util.*;

public class NhanVienB1{
	protected String ID ; // ma so nhan vien 
	protected String fullName ; // ten 
	protected int yearJoined ; // nam vao lam viec
	protected double coefficientsSalary ; // he so luong 
	protected double numDayOff ; // so ngay nghi trong 1 thang
	
	public NhanVienB1(){
		ID = "" ; 
		fullName = "";
		yearJoined = 2020;
		coefficientsSalary = 1.0;
		numDayOff = 1.0 ;
	}
	
	public NhanVienB1(String ID , String fullName ,double coefficientsSalary){
		this.ID = ID ;
		this.fullName = fullName;
		this.yearJoined = 2020; 
		this.coefficientsSalary = coefficientsSalary;
		this.numDayOff = 0;
	}
	
	public NhanVienB1(String ID , String fullName , int yearJoined , double coefficientsSalary , double numDayOff){
		this.ID = ID ;
		this.fullName = fullName;
		this.yearJoined = yearJoined; 
		this.coefficientsSalary = coefficientsSalary;
		this.numDayOff = numDayOff;
	}
	
	public double getSenioritySalary(){ // phu cap tham nien
		double senioritysalary ; 
		int yearofservice  = 2020 - this.yearJoined;//so nam da lam viec 
		if(yearofservice >= 5 ){
			senioritysalary = yearofservice * 1150/100;
			return senioritysalary;
		}
		else{
			senioritysalary = 0 ;
			return senioritysalary ;
		}
	}
	
	public String considerEmulationNV(){ // xet thi dua cua nhan vien
		if(this.numDayOff <= 1 ){
			return "A";
		}
		else if(this.numDayOff > 1 &&this.numDayOff <= 3 ){
			return "B";
		}
		else{
			return "C";
		}
	}
	
	public double getSalaryNV(){ // tong luong nhan vien
		double salaryNV ; 
		if(this.numDayOff <= 1){
			salaryNV = 1150 * this.coefficientsSalary * 1.0 + getSenioritySalary();
			return salaryNV;
		}
		else if(this.numDayOff > 1 &&this.numDayOff <= 3){
			salaryNV = 1150 * this.coefficientsSalary * 0.75 + getSenioritySalary();
			return salaryNV;
		}
		else{
			salaryNV = 1150 * this.coefficientsSalary * 0.5 + getSenioritySalary();
			return salaryNV;
		}
	}
}