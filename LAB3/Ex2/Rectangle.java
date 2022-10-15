import java.util.*;

public class Rectangle extends Point2D
{
	private Point2D point;
	private double width;
	private double length;
	public Rectangle() 
	{
		point.setX(0);
		point.setY(0);
		point.setColor("");
		this.length=0;
		this.width=0;
	}
	
	public Rectangle(double length,double width) 
	{
		this.length=length;
		this.width=width;
	}
	
	public Rectangle(Point2D point,double length,double width) 
	{
		this.point=point;
		this.length=length;
		this.width=width;
	}
	
	public void Input() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter point");
		point.Input();
		System.out.println("enter the length");
		this.length=sc.nextDouble();
		System.out.println("enter the width");
		this.width=sc.nextDouble();
		
	}
	
	public void Output() 
	{
		point.Output();
		System.out.println("length is "+this.length);
		System.out.println("width is "+this.width);
		
	}
	
	public void Draw() 
	{
        for (int i = 1; i <= width; i++) 
		{
            for (int j = 1; j <= length; j++) 
			{
                if ((j == 1) || (j == length) || (i == 1) || (i == width)) 
				{
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("\n");
        }
	}
	
	public void ChangeA(double A) 
	{
		this.length=this.length+A;
		this.width=this.width+A;
	}
	
	public double Perimeter() 
	{
		return 2*(length+width);
	}
	
	public double Area() 
	{
		return length*width;
	}
	
	public void Change(double length,double width) 
	{
		this.length=length;
		this.width=width;
	}
	
	public double DiagonalLine() 
	{
		return Math.sqrt(length*length+width*width);
	}

}
