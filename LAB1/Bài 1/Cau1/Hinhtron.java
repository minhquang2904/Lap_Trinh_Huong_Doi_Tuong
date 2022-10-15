import java.util.Scanner;
public class Hinhtron
{
	float R;
	final float pi = 3.14f;
	float cv;
	float dt;
   public void nhapBanKinh()
   {
      System.out.print ("vui long nhap ban kinh: ");
	  Scanner sc = new Scanner(System.in);
	  R = sc.nextFloat();
   }
   public void tinhCv()
   {
	  cv=2*R*pi;
   }
   public void tinhDt()
   {
	   dt=R*R*pi;
   }
   public void xuatCv()
   {
      System.out.println ("Chu vi Hinh tron la: "+cv);
   }
   public void xuatDt()
   {
	   System.out.println ("Dien tich Hinh tron la: "+dt);
   }
}


	 