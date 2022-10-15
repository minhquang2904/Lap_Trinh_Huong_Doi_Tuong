import java.util.*;
public class Teacher
{
	private String name;
	private int groups;
	
	public Teacher()
	{
		this.name = null;
		this.groups = 0;
	}
	
	public Teacher(String name,int groups)
	{
		this.name = name;
		this.groups = groups;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getgroups()
	{
		return this.groups;
	}
	
	@Override
	public String toString()
	{
		return this.name+" - "+this.groups;
	}
}