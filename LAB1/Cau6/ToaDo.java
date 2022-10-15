import java.util.Scanner;
import java.lang.Math;
public class ToaDo
{
	int x;
	int y;
	float kq;
	public void nhapSo()
	{
		Scanner sc = new Scanner (System.in);
		System.out.print (" nhap toa do x: ");
		x = sc.nextInt();
		System.out.print (" nhap toa do y: ");
		y = sc.nextInt();
	}
	public void tinhKc()
	{
		kq = (float) Math.sqrt(x*x+y*y);
	}
	public void xuatKq()
	{
		System.out.print (" khoang cach tu toa do den diem cho truoc la: "+kq);
	}
}
		