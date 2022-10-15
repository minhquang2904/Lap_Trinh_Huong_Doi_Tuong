import java.util.Scanner;
public class UocSo
{
	int so;
	public void nhapSo()
	{
		Scanner sc = new Scanner (System.in);
		System.out.print (" vui long nhap so: ");
		so = sc.nextInt();
	}
	public void timUoc()
	{
		System.out.print (" uoc cua so "+so+" la: " );
		for (int i=1;i<=so;i++)
		{
			if (so%i==0)
				System.out.print (+i+" " );
		}
	}
}