import java.util.*;
import java.io.*;
public class dsThisinh
{
	private ArrayList <Thisinh> ds = new ArrayList<Thisinh>();
	
	public void Enter()
	{
		int n =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("So thi sinh: ");
		n = sc.nextInt();
		String s1 = null;
		String s2 = null;
		int s3 = 0;
		double s4 = 0;
		double s5 = 0;
		double s6 = 0;
		char t = 0;
		for(int i =0;i<n;i++)
		{
			System.out.println("Nhap thi sinh thu: "+(i+1));
			System.out.print("SBD: ");
			s1 = sc.next();
			System.out.println();
			System.out.print("Ten: ");
			s2 = sc.next();
			System.out.println();
			System.out.print("Nam sinh: ");
			s3 = sc.nextInt();
			System.out.println();
			System.out.print("Diem Toan: ");
			s4 = sc.nextDouble();
			System.out.println();
			System.out.print("Diem Van: ");
			s5 = sc.nextDouble();
			System.out.println();
			System.out.print("Diem Anh: ");
			s6 = sc.nextDouble();
			ds.add(new Thisinh(s1,s2,s3,s4,s5,s6));
			
		}
	}
	
	public void display()
	{
		for(Thisinh a: ds)
		{
			System.out.println(a);
		}
	}
	
	public void sortBySumScore()
	{
		Thisinh a = new Thisinh();
		for(int i =0;i<ds.size();i++)
		{
			for(int j =i+1;j<ds.size();j++)
			{
				if(ds.get(i).SumScore() < ds.get(j).SumScore())
					{
						a = ds.get(j);
						ds.set(j,ds.get(i));
						ds.set(i,a);
					}
			}
		}
		
		for (Thisinh q : ds)
		{
			System.out.println(q);
		}
	}
	
	public void sortByName()
	{
		Thisinh a = new Thisinh();
			for(int i =0;i<ds.size();i++)
			{
				for(int j =i+1;j<ds.size();j++)
				{
					if(ds.get(i).getName().charAt(0)>ds.get(j).getName().charAt(0))
					{
						a = ds.get(j);
						ds.set(j,ds.get(i));
						ds.set(i,a);
					}
					if(ds.get(i).getName().charAt(0)==ds.get(j).getName().charAt(0))
					{
						if(ds.get(i).getMath() < ds.get(j).getMath())
						{
							a = ds.get(j);
							ds.set(j,ds.get(i));
							ds.set(i,a);
						}
					}
				}
			}
			
		for (Thisinh q : ds)
		{
			System.out.println(q);
		}
	}
	
	public void PassedList()
	{
		ArrayList <Thisinh> passed = new ArrayList <Thisinh>();
		for(int i=0;i<ds.size();i++)
		{
			if(ds.get(i).Result().equals("Pass"))
			{
				passed.add(ds.get(i));
			}
		}
		
		for (Thisinh q : passed)
		{
			System.out.println(q);
		}
	}
	
	public void BirthList()
	{
		ArrayList <Thisinh> birthyear = new ArrayList <Thisinh>();
		for(int i=0;i<ds.size();i++)
		{
			if(ds.get(i).getBirth()>1995)
			{
				birthyear.add(ds.get(i));
			}
		}
		for (Thisinh q : birthyear)
		{
			System.out.println(q);
		}
	}
	
	public static void main(String[] args)
	{
		dsThisinh list = new dsThisinh();
		try
		{
			list.Enter();
		} catch( InputMismatchException e)
		{
			System.out.println("Wrong input!!");
		}
		
		list.display();
		System.out.println("*****************************");
		list.sortBySumScore();
		System.out.println("*****************************");
		list.sortByName();
		System.out.println("*****************************");
		list.PassedList();
		System.out.println("*****************************");
		list.BirthList();		
	}
}




