import java.util.*;

public class TestST{
	public static void main(String [] args){
		Student sd = new Student("Luong Minh Quang","29-04-2001","nam","51900420","cao dang nghe",150);
		System.out.println("Full Name       : "+sd.fullName);
		System.out.println("ID              : "+sd.ID);
		System.out.println("BirhtYear       : "+sd.birthYear);
		System.out.println("Sex             : "+sd.checkSex());
		System.out.println("Training System : "+sd.checkTrainingSystem());
		System.out.println("Total Credits   : "+sd.checkTotalCredits());
		System.out.println("Total Tuition   : "+sd.getTotalTuition());
	}
}