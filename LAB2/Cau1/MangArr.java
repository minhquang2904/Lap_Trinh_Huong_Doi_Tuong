import java.util.*;
import java.util.Arrays;
import java.util.Random;
import static java.lang.Math.sqrt;
public class MangArr 
 {
	int arr[] = new int[100];
	int size;
	public void nhapXuat()
	{
		Scanner sc = new Scanner (System.in);
		System.out.print ("vui long nhap so phan tu cho mang: ");
		size = sc.nextInt();
		for (int i=0;i<size;i++)
		{
			System.out.println ("nhap phan tu thu " +(i+1));
			arr[i] = sc.nextInt();
		}
		System.out.println ("Day la mang: ");
		for (int i=0;i<size;i++)
		{
		System.out.println ("A["+i+"]="+arr[i]);
		}
}
	public void rado()
	{
		Scanner sc = new Scanner (System.in);
		System.out.print ("vui long nhap so phan tu cho mang: ");
		size = sc.nextInt();
		Random rd = new Random();
		for (int i=0;i<size;i++)
		{
		int nb = rd.nextInt(100);
		arr[i] = nb;
		System.out.println ("A["+i+"]="+arr[i]);
		}
    }
	public void themArr()
	{
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
	    arr[4] = 5;
		arr[5] = 6;
		arr[6] = 7;
		for (int i=0;i<7;i++)
		{
			System.out.println ("A["+i+"]="+arr[i]);
		}
		System.out.println ("vui long nhap vi tri can them: ");
		Scanner sc = new Scanner (System.in);
		int pos= sc.nextInt();
		System.out.println ("vui long nhap gia tri: ");
		int gt =sc.nextInt();
		int keepgt =0;
		
		for (int i=pos;i<8;i++)
		{
			int keepgtdau = arr[i];
			if(i==pos)
				arr[i]=gt;
			else arr[i]=keepgt;
			keepgt = keepgtdau;	
		}
		for (int i=0;i<8;i++)
		{
			System.out.println ("A["+i+"]="+arr[i]);
		}
	}
		public void xoa()
{
		arr[0] = 3;
		arr[1] = 15;
		arr[2] = 35;
		arr[3] = 50;
	    arr[4] = 127;
		arr[5] = 9;
		arr[6] = 6;
		arr[7] = 12;
		arr[8] = 10;
		for (int i=0;i<9;i++)
		{
			System.out.println ("A["+i+"]="+arr[i]);
		}
		System.out.println ("vui long nhap vi tri can xoa: ");
		Scanner sc = new Scanner (System.in);
		int pos= sc.nextInt();
		for (int i=pos;i<9;i++)
		{
			arr[i]=arr[i+1];
		}
			for (int i=0;i<8;i++)
		{
			System.out.println ("A["+i+"]="+arr[i]);
		}
		System.out.println ("xoa cac boi so cua 5");
		int i,j,k=0;
		for (i=0;i<9;i++)
		{
		 if ( arr[i]%5==0)
		{
             continue;
		}
			 {
			System.out.println ("A["+i+"]="+arr[i]);
		     }
	    }
}

		public void timkiem()
{
	int arr[] = {1, 2, 3, 7, 9, 5, 23, 8, 9, 10, 11, 12, 28 ,14, 15};
	   System.out.println("mang la:");
	   for (int i=0;i<arr.length;i++)
	   {
		   System.out.print(arr[i]+" ");
	   }
	   System.out.println ("vui long nhap so can tim: ");
	   Scanner sc = new Scanner (System.in);
		int key= sc.nextInt();
		int dem=0;
	   for (int i=0;i<arr.length;i++)
	   {
		   if (arr[i]==key)
		   {
			   dem=dem+1;
		   }
	   }
	   if (dem==0)
	   System.out.print("khong co so can tim trong mang");
       else System.out.print ("so can tim co trong mang");
}
	   public void amduong()
	   {
		   Scanner sc = new Scanner (System.in);
		System.out.print ("vui long nhap so phan tu cho mang: ");
		size = sc.nextInt();
		for (int i=0;i<size;i++)
		{
			System.out.println ("nhap phan tu thu " +(i+1));
			arr[i] = sc.nextInt();
		}
		System.out.println ("Day la mang: ");
		for (int i=0;i<size;i++)
		{
		System.out.print(" "+arr[i]+" ");
		}
		System.out.println(" ");
		System.out.println("danh sach so duong:");
		for (int i=0;i<size;i++)
		{
			if ( arr[i]<0)
				continue;
			System.out.print(" "+arr[i]+" ");
		}
		System.out.println(" ");
		System.out.println("danh sach so am:");
		for (int i=0;i<size;i++)
		{
			if ( arr[i]>=0)
				continue;
			System.out.print(" "+arr[i]+" ");
		}
	   }
		
		public void timsoam()
		{
		Scanner sc = new Scanner (System.in);
		System.out.print ("vui long nhap so phan tu cho mang: ");
		size = sc.nextInt();
		for (int i=0;i<size;i++)
		{
			System.out.println ("nhap phan tu thu " +(i+1));
			arr[i] = sc.nextInt();
		}
		System.out.println ("Day la mang: ");
		for (int i=0;i<size;i++)
		{
		System.out.print(" "+arr[i]+" ");
		}
		System.out.println(" ");
		for (int i=0;i<size;i++)
		{
			if (arr[i]<0)
				arr[i+1]=arr[i];
		}
		if (arr[size-1]<0)
		System.out.print("so am dau tien trong mang la: "+arr[size-1]+"\n");
	    else System.out.print ("khong tim duoc so am nao trong mang");
		}
		//cauh)
		public void timnt()
		{
			Scanner sc = new Scanner (System.in);
		System.out.print ("vui long nhap so phan tu cho mang: ");
		size = sc.nextInt();
		for (int i=0;i<size;i++)
		{
			System.out.println ("nhap phan tu thu " +(i+1));
			arr[i] = sc.nextInt();
		}
		int k=0;
		for (int i=0;i<size;i++)
		{
			if ( ktsont(arr[i]))
			{
				System.out.print ("so nguyen to dau tien la " +arr[i]);
				k++;
				break;
			}		
		}
		if (k==0)
				System.out.print("khong co so nguyen to nao trong mang");
		
		}
		//ham kiem tra so nguyen to
		public boolean ktsont(int n)
		{
			if (n<2)
			{  return false; }
           for (int i = 2; i <= sqrt(n); i++) 
	    {
            if (n % i == 0)  
			{  return false; }
		}
		return true;
		}
		// cauh)
		public void soln()
		{
		Scanner sc = new Scanner (System.in);
		System.out.print ("vui long nhap so phan tu cho mang: ");
		size = sc.nextInt();
		for (int i=0;i<size;i++)
		{
			System.out.println ("nhap phan tu thu " +(i+1));
			arr[i] = sc.nextInt();
		}
		int max=0;
			for (int i=0;i<size;i++)
		{
			if (arr[i]>=max && arr[i]>0)
			{
				max=arr[i];
			}
		}
		if (max>0)
			System.out.print ("so duong lon nhat trong mang la: "+max+"\n");
		
		int maxsoam = soamln (arr ,size);
		if(maxsoam<0)
		System.out.print ("so am lon nhat trong mang la: "+maxsoam);
		}
		// ham tim so am lon nhat
		public int soamln(int a[],int n)
		{
		  int i,max=0;
            for(i=0; i<n; i++) 
			{
              if(a[i]<0) 
			  {
                max = a[i];
                  break;
              }
			}
            for(i=0; i<n; i++) 
			{
                if(arr[i]<0 && a[i]>max)
                  max = a[i];
            }
			return max;
		}
		public void tongtbc()
			{
		Scanner sc = new Scanner (System.in);
		System.out.print ("vui long nhap so phan tu cho mang: ");
		size = sc.nextInt();
		for (int i=0;i<size;i++)
		{
			System.out.println ("nhap phan tu thu " +(i+1));
			arr[i] = sc.nextInt();
		}	
	    int tong=0,dem=0;
		for (int i=0;i<size;i++)
		{
			tong = arr[i]+tong;
			dem=dem+1;
		}
		System.out.print ("tong cac so trong mang la: "+tong+"\n");
		float tbc= (float)tong/dem;
		System.out.print ("tbc cac so trong mang la: "+tbc+"\n");
		tong=0;
		dem=0;
		for (int i=0;i<size;i++)
		{
			if (arr[i]>0)
			tong = arr[i]+tong;
			dem=dem+1;
		}
		if (tong>0)
		{System.out.print ("tong cac so duong trong mang la: "+tong+"\n");
		tbc= (float)tong/dem;
		System.out.print ("tbc cac so trong mang la: "+tbc+"\n");}
	     }
	
		
 }
			
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
				
		
		
		
		
         		
			





			
          
      
		  

	
		
		
		
		
			
	
		
		
		
		
		
		
		
		
		
		
		
		
           
			
		
		