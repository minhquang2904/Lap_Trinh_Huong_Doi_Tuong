import java.util.Scanner;
import java.lang.Math;
public class Kc
{
	int x1;
	int y1;
	int x2;
	int y2;
	float kq;
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
	}
	public void tinhKc()
	{
		kq= (float) Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
	}
	public void xuatKq()
	{
		System.out.print (" khoang cach giua 2 diem la "+kq);
	}
}