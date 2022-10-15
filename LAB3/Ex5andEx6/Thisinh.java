public class Thisinh
{
	private String sbd;
	private String name;
	private int birth;
	private double Math;
	private double Literature;
	private double English;
	
	public Thisinh()
	{
		this.sbd = "";
		this.name = "";
		this.birth = 0;
		this.Math = 0;
		this.Literature = 0;
		this.English = 0;
	}
	
	public Thisinh(String sbd, String name,int birth,double Math,double Literature,double English)
	{
		this.sbd = sbd;
		this.name = name;
		this.birth = birth;
		this.Math = Math;
		this.Literature = Literature;
		this.English = English;
	}
	
	public Thisinh(Thisinh a)
	{
		this.sbd = a.sbd;
		this.name = a.name;
		this.birth = a.birth;
		this.Math = a.Math;
		this.Literature = a.Literature;
		this.English = a.English;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public double getMath()
	{
		return this.Math;
	}
	
	public int getBirth()
	{
		return this.birth;
	}
	
	public double SumScore()
	{
		return this.Math + this.Literature + (this.English*2);
	}
	
	public String Result()
	{
		String result = null;
		if(this.SumScore()>25)
		{
			result = "Pass";
		}
		else
			result = "Fall";
		return result;
	}
	
	public String toString()
	{
		return this.sbd+" - "+this.name+" - "+this.birth+" - "+this.Math+" - "+this.Literature+" - "+this.English+" - "+this.SumScore()+" - "+this.Result();
	}
	
}




