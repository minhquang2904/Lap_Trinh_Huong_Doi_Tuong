import java.util.Scanner;
public class Hcn
{
	float cd;
	float cr;
	float cv;
	float dt;
	public void nhapSo()
	{ 
	    Scanner sc = new Scanner (System.in);
		System.out.print (" Vui long nhap chieu rong: ");
		cr = sc.nextFloat();
		System.out.print (" vui long nhap chieu dai: ");
		cd = sc.nextFloat();
	}
	public void cV ()
	{
		cv=(cd+cr)*2;
	}
	public void dT ()
	{
		dt=cd*cr;
	}
	public void xuatSo()
	{
		System.out.println (" Chu vi HCN la: "+cv);
		System.out.print (" Dien tich HCN la: "+dt);
	}
}
	