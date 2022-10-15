import java.util.*;

public class Student extends Person{
	protected String ID ; // ma so sinh vien
	protected String trainingSystem ; // he dao tao 
	protected int totalCredits ; // tong so tin chi 
	
	public Student(){
		super();
		ID = "" ; 
		trainingSystem = "" ;
		totalCredits = 0 ; 
	}
	
	public Student(String fullName , String birthYear , String sex , String ID , String trainingSystem , int totalCredits){
		super(fullName,birthYear,sex);
		this.ID = ID ;
		this.trainingSystem = trainingSystem;
		this.totalCredits = totalCredits;
	}
	
	public String checkTrainingSystem(){ // xet he dao tao
		if(this.trainingSystem == "dai hoc"){
			return "Dai Hoc";
		}
		else if(this.trainingSystem == "cao dang"){
			return "Cao Dang";
		}
		else if(this.trainingSystem == "cao dang nghe" ){
			return "Cao Dang Nghe";
		}
		else{
			return "Dai Hoc";
		}
	}
	
	public String checkTotalCredits(){ // tong so tin chi
		if(this.trainingSystem == "dai hoc"){
			return "150"; 
		}
		else if(this.trainingSystem == "cao dang nghe"){
			return "130";
		}
		else if(this.trainingSystem == "cao dang"){
			return "100";
		}
		else{
			return "150";
		}
	}
	
	public int getTotalTuition(){ // tong hoc phi theo tin chi
		int  tuition ;
		if(this.trainingSystem == "dai hoc"){
			return tuition = 150 * 200000;
		}
		else if(this.trainingSystem == "cao dang nghe"){
			return tuition = 130 * 120000;
		}
		else if(this.trainingSystem ==  "cao dang"){
			return tuition = 100 * 150000;
		}
		else{
			return tuition = 150 * 200000;
		}
	}
}
