import java.io.CharArrayReader;
import java.util.*;

public class NhanVienB4{
	protected String ID ; // ma nhan vien
	protected String fullName; // ten nhan vien 
	protected double coefficientsSalary; // he so luong
	
	public NhanVienB4(){
		ID = "NV001";
		fullName = "Luong Minh Quang";
		this.coefficientsSalary = 2.34;
	}
	
	
	public NhanVienB4(String ID , String fullName,double coefficientsSalary ){
		this.ID = ID;
		this.fullName = fullName;
		this.coefficientsSalary = coefficientsSalary ;
	}

	public String checkID(){
		if(ID.charAt(0) == 'N' && ID.charAt(1) == 'V'){
			return ID;
		}
		else{
			return "NV001";
		}
	}
	
	public double thunhap(){
		double salary ; 
		return salary = 1150 * 2.34;
	}
}