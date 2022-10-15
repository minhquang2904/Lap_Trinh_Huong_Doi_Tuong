import java.util.*;
import java.util.Arrays;
import java.util.Random;
import static java.lang.Math.sqrt;
import java.util.ArrayList;
public class Arrlist
{
	ArrayList<Integer> arrl = new ArrayList<>(100);
	int size;
	public void caua()
	{
		int sum=0;
		Scanner sc = new Scanner (System.in);
		System.out.print ("vui long nhap so phan tu cho mang: ");
		size = sc.nextInt();
		for (int i=0;i<size;i++)
		{
		   System.out.println ("nhap phan tu thu " +(i+1));
		   int number = sc.nextInt();
		   arrl.add(number);
		}
	  System.out.println("cac phan tu trong mang la: ");
      System.out.println(arrl);
		for (int i=0;i<arrl.size();i++)
		{
			sum+=checkso(arrl.get(i));
		}
	
	System.out.print ("tong cac so chan la: "+sum);	
	arrl.clear();
	}			
	//ham tinh tong so chan
	public int checkso(int n)
	{
      int k=0;
	  int tam=n;
	 if( n>10)
	 {
		 while(n>0)
	{
		 k = k+(n%10);
		 n=n/10;
		 
	}
	if (k%2==0)
    {
        return tam;
	}
	 }
	 return 0;
	}
	
	public void caub()
	{
		Scanner sc = new Scanner (System.in);
		System.out.print ("vui long nhap so phan tu cho mang: ");
		size = sc.nextInt();
		for (int i=0;i<size;i++)
		{
		   System.out.println ("nhap phan tu thu " +(i+1));
		   int number = sc.nextInt();
		   arrl.add(number);
		}
	  System.out.println("cac phan tu trong mang la: ");
      System.out.println(arrl);
		for (int i=0; i<(size-1);i++)
		{
			if ((arrl.get(i)+arrl.get(i+1))%2==0)
			{
				arrl.add (i+1, arrl.get(i)+arrl.get(i+1));
			}	
		}
	    System.out.println ("mang la: ");
		System.out.println (arrl);
     arrl.clear();		
	}
	
	public void cauc()
	{
		Scanner sc = new Scanner (System.in);
		System.out.print ("vui long nhap so phan tu cho mang: ");
		size = sc.nextInt();
		for (int i=0;i<size;i++)
		{
		   System.out.println ("nhap phan tu thu " +(i+1));
		   int number = sc.nextInt();
		   arrl.add(number);
		}
	  System.out.println("cac phan tu trong mang la: ");
      System.out.println(arrl);
		int sochan=0;
		for (int i=0;i<size;i++)
		{
			if (arrl.get(i)%2==0)
				sochan=sochan+1;
		}
		System.out.println("tong cac so chan la: "+sochan);
	    System.out.println("tong cac so le la: "+(size-sochan));
		arrl.clear();
	}		
	public void caud()
	{
		Scanner sc = new Scanner (System.in);
		System.out.print ("vui long nhap so phan tu cho mang: ");
		size = sc.nextInt();
		for (int i=0;i<size;i++)
		{
		   System.out.println ("nhap phan tu thu " +(i+1));
		   int number = sc.nextInt();
		   arrl.add(number);
		}
	  System.out.println("cac phan tu trong mang la: ");
      System.out.println(arrl);
		int max=0;
		int min=arrl.get(0);
		for (int i=0;i<size;i++)
		{
			if (arrl.get(i)>max)
			max=arrl.get(i);
		}
		System.out.println (" so lon nhat la: "+max);
		for (int i=0;i<size;i++)
		{
			if (min>arrl.get(i))
			min=arrl.get(i);
		}
		System.out.println (" so nho nhat la: "+min);
		arrl.clear();
	}
	public void caue()
	{
		Scanner sc = new Scanner (System.in);
		System.out.print ("vui long nhap so phan tu cho mang: ");
		size = sc.nextInt();
		for (int i=0;i<size;i++)
		{
		   System.out.println ("nhap phan tu thu " +(i+1));
		   int number = sc.nextInt();
		   arrl.add(number);
		}
	  System.out.println("cac phan tu trong mang la: ");
      System.out.println(arrl);
		int tong=0;
		for (int i=0;i<size;i++)
		{
			tong=arrl.get(i)+tong;
		}
		float tbc= (float) tong/size;
		System.out.println ("tbc cac so la: "+tbc);
		arrl.clear();
	}
	public void cauf()
	{
		Scanner sc = new Scanner (System.in);
		System.out.print ("vui long nhap so phan tu cho mang: ");
		size = sc.nextInt();
		for (int i=0;i<size;i++)
		{
		   System.out.println ("nhap phan tu thu " +(i+1));
		   int number = sc.nextInt();
		   arrl.add(number);
		}
	  System.out.println("cac phan tu trong mang la: ");
      System.out.println(arrl);
		System.out.println ("vui long nhap so can tim: ");
		int n = sc.nextInt();
		boolean key = arrl.contains(n);
		if (key)
			System.out.println("so nay co trong mang");
        else
			System.out.println("so nay k co trong mang");
		arrl.clear();
	}
	public void caug()
	{
		Scanner sc = new Scanner (System.in);
		System.out.print ("vui long nhap so phan tu cho mang: ");
		size = sc.nextInt();
		for (int i=0;i<size;i++)
		{
		   System.out.println ("nhap phan tu thu " +(i+1));
		   int number = sc.nextInt();
		   arrl.add(number);
		}
	  System.out.println("cac phan tu trong mang la: ");
      System.out.println(arrl);
		System.out.println("so duong la: ");
		for( int soduong : arrl)
		{
			if( soduong>0)
				System.out.print(soduong+" ");
		}
		System.out.println();
		System.out.println("so am la: ");
		
		for( int soam : arrl)
		{
			if( soam<0)
				System.out.print(soam+" ");
		}
		arrl.clear();
	}
	public void cauh()
	{
		Scanner sc = new Scanner (System.in);
		System.out.print ("vui long nhap so phan tu cho mang: ");
		size = sc.nextInt();
		for (int i=0;i<size;i++)
		{
		   System.out.println ("nhap phan tu thu " +(i+1));
		   int number = sc.nextInt();
		   arrl.add(number);
		}
	  System.out.println("cac phan tu trong mang la: ");
      System.out.println(arrl);
		System.out.println("so am dau tien la: ");
		for( int soam : arrl)
		{
			if( soam<0)
			{
				System.out.print(soam+" ");
				break;
			}
		}
		arrl.clear();
	}
	public void caui()
	{
		Scanner sc = new Scanner (System.in);
		System.out.print ("vui long nhap so phan tu cho mang: ");
		size = sc.nextInt();
		for (int i=0;i<size;i++)
		{
		   System.out.println ("nhap phan tu thu " +(i+1));
		   int number = sc.nextInt();
		   arrl.add(number);
		}
	  System.out.println("cac phan tu trong mang la: ");
      System.out.println(arrl);
		System.out.println("so nguyen to dau tien la: ");
		for( int nt : arrl)
		{
			if(sont(nt))
			{
				System.out.print(nt+" ");
				break;
			}
		}
		arrl.clear();
	}
	
    //tim so nguyen to
	public boolean sont(int n)
	{
		if(n<2)
			return false;
		for (int i=2;i<sqrt(n);i++)
		{
			if(n%i==0)
				return false;
		}		
		return true;
	}
	public void cauj()
	{
		Scanner sc = new Scanner (System.in);
		System.out.print ("vui long nhap so phan tu cho mang: ");
		size = sc.nextInt();
		for (int i=0;i<size;i++)
		{
		   System.out.println ("nhap phan tu thu " +(i+1));
		   int number = sc.nextInt();
		   arrl.add(number);
		}
	  System.out.println("cac phan tu trong mang la: ");
      System.out.println(arrl);
		int tong=0;
		for( int so : arrl)
		{
			tong+= so;
		}
		System.out.println ("tong cac phan tu la: "+tong);
		float tbc=(float) tong/size;
		System.out.println ("tbc cac phan tu la: "+tbc);
		int dem=0;
		tong=0;
		tbc=0;
        for( int so : arrl)		
		{
			if(so>0)
			{
				tong+=so;
				dem++;
			}
		}
		System.out.println ("tong cac phan tu la: "+tong);
		tbc=(float) tong/dem;
		System.out.println ("tbc cac phan tu la: "+tbc);
        arrl.clear();		
	}
	}	
		 
	
	
	
	
	
	
	
	
	
	
	
	

		   