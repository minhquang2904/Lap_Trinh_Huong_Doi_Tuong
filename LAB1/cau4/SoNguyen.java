import java.util.Scanner;
public class SoNguyen
{
	int a,b,c;
	public void nhapSo()
	{
		Scanner sc = new Scanner (System.in);
		System.out.print (" nhap so a: ");
		a = sc.nextInt();
		System.out.print (" nhap so b: ");
		b = sc.nextInt();
		System.out.print (" nhap so c: ");
		c = sc.nextInt();
	}
	public int xetA()
	{
		  //xet a
		  if (a > b & a > c)
			  System.out.println ("so lon nhat la a: "+a);
		  else if (a > b & a < c)
			  return 0;
		  else if (a<b & a>c)
			  return 0;
		  else System.out.println ("so be nhat la a: "+a);
		  return 0;
	}
	public int xetB()
	{
		  if (b>a & b>c)
			  System.out.println ("so lon nhat la b: "+b);
		  else if (b>a & b<c)
			  return 0;
		  else if (b<a & b>c)
		      return 0;
		  else  System.out.println ("so be nhat la b: "+b);
		  return 0;
	}
	public int xetC()
	{
		   if (c>a & c>b)
			  System.out.println ("so lon nhat la c: "+c);
		  else if (c>a & a<b)
			  return 0;
		  else if (c<a & c>b)
		      return 0;
		  else System.out.println ("so be nhat la c: "+c);
		  return 0;
		   
	}
}
			 
			