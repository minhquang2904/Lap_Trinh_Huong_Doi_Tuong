import java.util.ArrayList;
import java.util.*;
import java.io.*;

public class Main
{
	public static Scanner sc = new Scanner(System.in);
	public static void input(int n,ArrayList<Point2D> array)
	{
		for(int i=0;i<n;i++)
		{
			System.out.print("Nhap x va y cho diem" +(i+1)+": ");
			Double x = sc.nextDouble();
			Double y = sc.nextDouble();
			array.add(new Point2D(x,y));
		}
	}
	
	public static void output(ArrayList<Point2D> array)
	{
		for(Point2D a:array)
		{
			System.out.println(a.toString());
		}
	}
	
	public static Double distance(Point2D a)
	{
		return Math.sqrt(a.getX() * a.getX() + a.getY() * a.getY());
	}
	
	public static void sortByDistance(ArrayList<Point2D> array)
	{
		for(int i=0;i<array.size();i++)
		{
			for(int j=i;j<array.size();j++)
			{
				if(distance(array.get(i)) < distance(array.get(j)))
				{
					Point2D temp = array.get(i);
					Point2D val = array.get(j);
					array.remove(i);
					array.add(i,val);
					array.remove(j);
					array.add(j,temp);
				}
				if(distance(array.get(i)) == distance(array.get(j)))
				{
					if(array.get(i).getX() < array.get(j).getX())
					{
						Point2D temp = array.get(i);
						Point2D val = array.get(j);
						array.remove(i);
						array.add(i,val);
						array.remove(j);
						array.add(j,temp);
					}
				}
			}
		}
	}
	
	public static void Circle1(ArrayList<Point2D> array)
	{
		System.out.println("Cac diem Nam trong duong tron tam O(0;0) r=1: ");
		for(Point2D a:array)
		{
			if(distance(a)<1.0)
			{
				System.out.println(a.toString());
			}
		}
	}
	
	public static void GocPhanTuThu1(ArrayList<Point2D> array)
	{
		for(Point2D a:array)
		{
			if(a.getX()>0 && a.getY()>0)
				System.out.println(a.toString());
		}
	}
	
	public static void Cau5(ArrayList<Point2D> array)
	{
		for(int i=0;i<array.size();i++)
		{
			if(array.get(i).getX()> 5 && array.get(i).getX() <8)
			{
				array.remove(i);
				i--;
			}
		}
	}
	
	public static int Cau6(ArrayList<Point2D> array)
	{
		int n = 0;
		for(Point2D a:array)
		{
			if(a.getX() > 0 )
			{
				n++;
			}
		}
		return n;
	}
	
	public static void main(String[] args) throws IOException
	{
		ArrayList<Point2D> array = new ArrayList<Point2D>();
		Scanner sc = new Scanner(System.in);
		try {
			File file = new File("input.xml");
			 Scanner myReader = new Scanner(file);
			 while (myReader.hasNextLine()) 
			 {
				String data = myReader.nextLine();
				String[] value = data.split(",");
				array.add(new Point2D(Double.parseDouble(value[0]),Double.parseDouble(value[1])));
			 }
			 myReader.close();
		} catch (FileNotFoundException e) 
			{
			 e.printStackTrace();
		}	
	}
}


































