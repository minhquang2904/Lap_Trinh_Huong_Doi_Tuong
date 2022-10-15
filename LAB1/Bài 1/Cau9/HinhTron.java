import java.util.Scanner;
import java.lang.Math;
public class HinhTron
{
	final float pi = 3.14f;
	int x;
	int y;
	int x1;
	int y1;
	float R;
	float cv;
	float dt;
	public void nhapSo()
	{
		Scanner sc = new Scanner (System.in);
		System.out.print (" nhap toa do x cua tam I: ");
		x = sc.nextInt();
		System.out.print (" nhap toa do y cua tam I: ");
		y = sc.nextInt();
		System.out.print (" nhap toa do x1 cua A: ");
		x1 = sc.nextInt();
		System.out.print (" nhap toa do y1 cua A: ");
		y1 = sc.nextInt();
	}
	public void tinhR()
	{
		R= (float) Math.sqrt((x1-x)*(x1-x)+(y1-y)*(y1-y));
	}
	public void cV()
	{
		cv=2*R*pi;
	}
	public void dT()
    {
	   dt=R*R*pi;
    }
	public void xuatKq()
	{
		System.out.println (" chu vi hinh tron la: "+cv);
		System.out.print (" dien tich hinh tron la: "+dt);
	}
}
		