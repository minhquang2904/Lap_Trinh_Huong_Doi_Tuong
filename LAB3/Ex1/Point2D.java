import java.util.*;

public class Point2D 
{
	private double x;
	private double y;
	private String color;
	
	public double getX() 
	{
		return this.x;
	}
	
	public void setX(double x) 
	{
		this.x=x;
	}
	
	public double getY() 
	{
		return this.y;
	}
	
	public void setY(double y) 
	{
		this.y=y;
	}
	
	public String getColor() 
	{
		return this.color;
	}
	
	public void setColor(String color) 
	{
		this.color=color;
	}
	
	public Point2D() 
	{
		this.x=0.0;
		this.y=0.0;
		this.color="";
	}
	
	public Point2D(double x,double y) 
	{
		this.x=x;
		this.y=y;
	}
	
	public Point2D(double x,double y,String color) 
	{
		this.x=x;
		this.y=y;
		this.color=color;
	}
	
	public void Input() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter x");
		x=sc.nextDouble();
		System.out.println("enter y");
		y=sc.nextDouble();
		String temp=sc.nextLine();
		System.out.println("enter the color");
		color=sc.nextLine();
	}
	
	public void Output() 
	{
		System.out.println("x is"+this.x);
		System.out.println("y is"+this.y);
		System.out.println("color is "+this.color);
	}
	
	public double [] Move(double x,double y)
	{
		this.x=x;
		this.y=y;
		double []arr= {this.x,this.y};
		return arr;
	}
	
	public void Range(double x,double y) 
	{
		double range=Math.sqrt(((this.x)*(this.x)-x*x)+((this.y)*(this.y)-y*y));
		System.out.println("range is"+range);
	}
	
	public boolean Check() 
	{
		if(this.x==0.0 || this.y==0.0) 
		{
			return true;
		}else 
			return false;
	}

}
