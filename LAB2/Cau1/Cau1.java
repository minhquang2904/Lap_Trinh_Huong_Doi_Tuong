public class Cau1
{
	public static void main (String[] args)
	{
		MangArr mang1 = new MangArr();
		System.out.println ("a)Nhap mang va xuat mang");
		mang1.nhapXuat();
		System.out.print ("--------------------------------------------------------------------\n");
		System.out.println ("b)cac gia tri ngau nhien <100");
		mang1.rado();
		System.out.print ("--------------------------------------------------------------------\n");
		System.out.println ("c)them phan tu cho mang tai vi tri pos");
		mang1.themArr();
		System.out.print ("--------------------------------------------------------------------\n");
		System.out.println ("d)xoa phan tu cho mang tai vi tri pos");
		mang1.xoa();
		System.out.print ("--------------------------------------------------------------------\n");
		System.out.println ("e)tim kiem phan tu");
		mang1.timkiem();
		System.out.print ("--------------------------------------------------------------------\n");
		System.out.println ("f)liet ke so am duong");
		mang1.amduong();
		System.out.print ("--------------------------------------------------------------------\n");
		System.out.println ("g)tim kiem so am dau tien");
		mang1.timsoam();
		System.out.print ("--------------------------------------------------------------------\n");
		System.out.println ("h)tim kiem nguyen to dau tien");
		mang1.timnt();
		System.out.print ("--------------------------------------------------------------------\n");
		System.out.println ("i)so lon nhat");
		mang1.soln();
		System.out.print ("--------------------------------------------------------------------\n");
		mang1.tongtbc();
	    
	}
}