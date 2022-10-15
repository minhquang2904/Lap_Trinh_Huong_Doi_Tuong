public class Cau2
{
	public static void main(String[] args)
	{
		int k;
		Nguyenduong nguyenduong= new Nguyenduong();
		nguyenduong.nhapSo();
		k=nguyenduong.checkSo();
		if (k==1)
		 System.out.print ("Day Khong Phai la so nguyen duong");
	    else nguyenduong.demSo();				
	}
}