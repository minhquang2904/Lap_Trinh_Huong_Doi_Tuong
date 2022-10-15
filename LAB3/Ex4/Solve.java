import java.util.*;
import java.io.*;

public class Solve
{
	private ArrayList<Teacher> ds = new ArrayList<Teacher>();
	
	public void display() 
	{
		for (int i=0;i<ds.size();i++)
		{
			System.out.println(ds.get(i));
		} 
	}
	
	public void ReadTeacher(String filename)
	{
		String data = null;
		int i =0;
		try 
		{
			File myObj = new File(filename);
			Scanner reader = new Scanner(myObj);
			while (reader.hasNextLine()) 
			{
				data = reader.nextLine();
				String[] gv = data.split(",");
				ds.add(new Teacher(gv[0],Integer.valueOf(gv[1])));
				i++;
			}
			System.out.println("Successfull Read!!");
			reader.close();
		} catch (FileNotFoundException e) 
		{
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
	
	public void SumGroups()
	{
		int sum =0;
		for(int i =0;i<ds.size();i++)
		{
			sum += ds.get(i).getgroups();
		}
		System.out.println("Sum Groups: "+sum);
	}
	
	public void sortByName()
	{
		Teacher a = new Teacher();
		for(int i =0;i<ds.size();i++)
		{
			for(int j =i+1;j<ds.size();j++)
			{
				if(ds.get(i).getName().charAt(0) > ds.get(j).getName().charAt(0))
					{
						a = ds.get(j);
						ds.set(j,ds.get(i));
						ds.set(i,a);
					}
			}
		}
	}
	
	public void sortByGroups()
	{
		Teacher a = new Teacher();
		for(int i =0;i<ds.size();i++)
		{
			for(int j =i+1;j<ds.size();j++)
			{
				if(ds.get(i).getgroups() < ds.get(j).getgroups())
					{
						a = ds.get(j);
						ds.set(j,ds.get(i));
						ds.set(i,a);
					}
			}
		}
	}
	
	public void Filt()
	{
		ArrayList<Teacher> dsFilt = new ArrayList<Teacher>();
		for(int i =0;i<ds.size();i++)
		{
			if(ds.get(i).getgroups()>1)
			{
				dsFilt.add(ds.get(i));
			}
		}
		for (int i=0;i<dsFilt.size();i++)
		{
			System.out.println(dsFilt.get(i));
		} 
	}
	
	public static void main(String[] args)
	{
		Solve a = new Solve();
		a.ReadTeacher("input.txt");
		a.SumGroups();
		System.out.println("Sort by name: ");
		a.sortByName();
		a.display();
		System.out.println("Sort by group: ");
		a.sortByGroups();
		a.display();
		System.out.println("Filted List: ");
		a.Filt();
	}
}




