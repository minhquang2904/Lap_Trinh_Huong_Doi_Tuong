import java.util.*;

public class TestPS{ // test person bai 5 
	public static void main(String [] args){
		Person ps = new Person("Luong Minh Quang","29-04-2001","nam");
		System.out.println("Full Name : "+ps.fullName);
		System.out.println("BirhtYear : "+ps.birthYear);
		System.out.println("Gioi tinh : "+ps.checkSex());
	}
}