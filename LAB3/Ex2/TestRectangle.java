
public class TestRectangle 
{

	public static void main(String[] args) 
	{
		Point2D A=new Point2D(2,4,"red");
		Rectangle B=new Rectangle(A,3,4);
		B.Output();
		B.Input();
		B.Output();
		B.Draw();
		B.ChangeA(3);
		B.Perimeter();
		B.Area();
		B.Change(3, 5);
		B.DiagonalLine();

	}

}
