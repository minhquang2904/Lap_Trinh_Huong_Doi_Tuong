import java.util.Scanner;
import java.lang.Math;
public class TamGiac
{
	int x1;
	int y1;
	int x2;
	int y2;
	int x3;
	int y3;
	float kcAB;
	float kcAC;
	float kcBC;
	float p;
	float cv;
	float dt;
	
	public void nhapSo()
	{
		Scanner sc = new Scanner (System.in);
		System.out.print (" nhap toa do x1 cua A: ");
		x1 = sc.nextInt();
		System.out.print (" nhap toa do y1 cua A: ");
		y1 = sc.nextInt();
		System.out.print (" nhap toa do x2 cua B: ");
		x2 = sc.nextInt();
		System.out.print (" nhap toa do y2 cua B: ");
		y2 = sc.nextInt();
		System.out.print (" nhap toa do x3 cua C: ");
		x3 = sc.nextInt();
		System.out.print (" nhap toa do y3 cua C: ");
		y3 = sc.nextInt();
	}
	public void tinhKc()
	{
		//kcAB
		kcAB = (float) Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		//kcAC
		kcAC = (float) Math.sqrt((x3-x1)*(x3-x1)+(y3-y1)*(y3-y1));
		//kcBC
		kcBC = (float) Math.sqrt((x3-x2)*(x3-x2)+(y3-y2)*(y3-y2));
	}
	public void cV()
	{
		cv= kcAB + kcAC + kcBC;
	}
	public void dT()
	{
		p= cv/2;
	    dt= (float)Math.sqrt(p*(p-kcAB)*(p-kcAC)*(p-kcBC));
	}
	public void xuatKq()
	{
		System.out.println (" chu vi tam giac la: "+cv);
		System.out.print (" dien tich tam giac la: "+dt);
}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		  
		
		