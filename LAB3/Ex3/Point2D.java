public class Point2D
{
	protected double x = 1.0;
	protected double y = 1.0;
	public void setX(double x)
	{
		this.x = x;
	}
	public void setY(double y)
	{
		this.y = y;
	}
	public double getX()
	{
		return this.x;
	}
	public double getY()
	{
		return this.y;
	}
	public Point2D(){}
	public Point2D(double X, double Y)
	{
		this.x = X;
		this.y = Y;
	}
	@Override
	public String toString()
	{
		return this.x+","+this.y;
	}
}