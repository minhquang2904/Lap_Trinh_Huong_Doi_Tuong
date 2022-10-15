import java.util.*;

class CB extends NhanVienB4{
	protected String CV ; // chuc vu 
	protected int TNQL ; // tham nien quan ly 
	
	public CB(){
		super();
		ID = "NV009";
		fullName = "Dieu Hien";
		coefficientsSalary = 4.67 ;
		CV = "" ; 
		TNQL = 10 ;
	}
	
	public CB(String ID , String fullName , double coefficientsSalary, String CV , int TNQL ){
		super(ID,fullName,coefficientsSalary);
		this.CV = CV ; 
		this.TNQL = TNQL;
	}
	
	public String ChucVu(){
		if(this.CV == "giam doc" ){
			return "Giam Doc";
		}
		else if(this.CV == "truong phong"){
			return "Truong Phong";
		}
		else if(this.CV == "pho phong" ){
			return "Pho Phong";
		}
		else{
			return CV;
		}
	}
	
	public String HeSoLuong(){
		if(this.CV == "giam doc" ){
			return "4.67";
		}
		else if(this.CV == "truong phong" ){
			return "3.67" ; 
		}
		else if(this.CV == "pho phong" ){
			return "2.94";
		}
		else{
			return "2.34";
		}
	}
	
	public double getTongLuong(){
		double pc , tong = 0 ;
		if(this.CV == "giam doc" ){
			pc = 1500 * 7.0 ;
			tong = 1150 * 4.67 + pc;
			return tong;
		}
		else if(this.CV == "truong phong" ){
		    pc = 1500 * 6.0;
			tong = 1150 * 3.67 + pc;
			return tong;
		}
		else if(this.CV == "pho phong"){
			 pc = 1500 * 4.5;
			tong = 1150 * 2.94 + pc;
			return tong;
		}
		else{
			pc = 1500 * 1.0 ; 
			tong = 1150 * 2.34 + pc;
			return tong;
		}
	}
	
	class outPut{
		void xuat(){
			System.out.println("ID                  : "+checkID());
			System.out.println("Full Name           : "+fullName);
			System.out.println("Coefficients Salary : "+HeSoLuong());
			System.out.println("CV                  : "+ChucVu());
			System.out.println("TNQL                : "+TNQL);
			System.out.println("Tong Luong          : "+getTongLuong());
		}
	}
}

public class CBLanhDao{
	public static void main(String[] args){
		CB cb1 = new CB("NV009","Luong Minh Quang",3.3,"giam doc",6);
		CB.outPut cb2 = cb1.new outPut();
		cb2.xuat();
	}
}
