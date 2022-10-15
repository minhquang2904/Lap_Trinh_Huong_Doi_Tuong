

public class TestPoint2D 
{

	public static void main(String[] args) 
	{
		Point2D A = new Point2D(2,4,"red");
		System.out.println("x ="+A.getX());
		System.out.println("y ="+A.getY());
		System.out.println("color: "+A.getColor());
		A.Output();
		A.Input();
		A.Output();
		

	}

}
