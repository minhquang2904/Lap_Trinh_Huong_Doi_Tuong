public class Employee
{
	protected String MS;
	protected String name;
	protected String phongBan;
	protected String chucVu;
	protected double heSoLuong;
	protected int soNgayLamViec;
	public double luongCoBan = 1150;
	public String getMS() 
	{
		return MS;
	}
	
	public void setMS(String mS) 
	{
		MS = mS;
	}
	
	public double getLuongCoBan() 
	{
		return luongCoBan;
	}
	
	public void setLuongCoBan(double luongCoBan) 
	{
		this.luongCoBan = luongCoBan;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getPhongBan() 
	{
		return phongBan;
	}
	
	public void setPhongBan(String phongBan) 
	{
		this.phongBan = phongBan;
	}
	
	public String getChucVu() 
	{
		return chucVu;
	}
	
	public void setChucVu(String chucVu) 
	{
		if(!chucVu.equals("LanhDao"))
			this.chucVu = "NhanVien";
		else
			this.chucVu = "LanhDao";
	}
	
	public double getHeSoLuong() 
	{
		return heSoLuong;
	}
	
	public void setHeSoLuong(double heSoLuong) 
	{
		this.heSoLuong = heSoLuong;
	}
	
	public int getSoNgayLamViec() 
	{
		return soNgayLamViec;
	}
	
	public void setSoNgayLamViec(int soNgayLamViec) 
	{
		this.soNgayLamViec = soNgayLamViec;
	}
	public Employee(){}
	public Employee(String mS, String name, String phongBan, String chucVu, double heSoLuong, int soNgayLamViec) {
		MS = mS;
		this.name = name;
		this.phongBan = phongBan;
		this.heSoLuong = heSoLuong;
		this.soNgayLamViec = soNgayLamViec;
		setChucVu(chucVu);
	}
	public Double getLuong()
	{
		return this.heSoLuong*this.luongCoBan*this.getHeSoThiDua() + 1100 + this.getPhuCap();
	}
	public Double getHeSoThiDua()
	{
		if(this.chucVu.equals("LanhDao"))
			return 1.0;
		else
		{
			if(this.soNgayLamViec > 22)
				return 1.0;
			if(this.soNgayLamViec > 20 )
				return 0.8;
			else
				return 0.6;
		}
	}
	public Double getPhuCap()
	{
		if(this.chucVu.equals("LanhDao"))
			return 2000.0;
		else
			return 0.0;
	}
	
	@Override
	public String toString() {
		return MS + "," + name + "," + phongBan + "," + chucVu + ","+ heSoLuong + "," + soNgayLamViec;
	}
	
}