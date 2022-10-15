import java.util.*;

public class Person{
	protected String fullName; // ho ten
	protected String birthYear ;  // ngay sinh 
	protected String sex ; // gioi tinh
	
	public Person(){
		sex = "";
	}
	
	public Person(String fullName , String birthYear , String sex){
		this.fullName = fullName;
		this.birthYear = birthYear;
		this.sex = sex;
	}
	
	public String checkSex(){ // gioi tinh 
		if(this.sex == "nam"){
			return "Nam";
		}
		else if(this.sex == "nu" ){
			return "Nu";
		}
		else{
			return "Nam";
		}
	}
}