import java.util.Scanner;
public class Nguyenduong
{
	int nd;
	public void nhapSo()
	{
		System.out.print ("vui long nhap so nguyen duong: ");
		Scanner sc= new Scanner (System.in);
		nd= sc.nextInt();
	}
	public int checkSo()
	{  
	  
		if (nd<=0)
			 return 1;
		else return 2;
		
	}		
	
	public void demSo()
	{
       int dem=1;
       while (nd>=10)
	   {
          nd=nd/10;
		  dem=dem+1;
	   } 
	  System.out.print ("day la so co: "+dem+" chu so"); 
	}
}
	