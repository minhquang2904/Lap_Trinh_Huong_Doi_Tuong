import java.util.ArrayList;
import java.util.*;
import java.io.*;

public class TestEmployee
{
	
	public static void main(String[] args) throws IOException
	{
		
		ArrayList<Employee> ds = new ArrayList<Employee>();
	
	
		try {
			 File file = new File("input.xml");
			 Scanner myReader = new Scanner(file);
			 while (myReader.hasNextLine()) {
				 String data = myReader.nextLine();
				 String[] value = data.split(",");
				 ds.add(new Employee(value[0],value[1],value[2],value[3],Double.parseDouble(value[4]),Integer.parseInt(value[5])));
			 }
			 myReader.close();
		} catch (FileNotFoundException e) 
		{
			 e.printStackTrace();
		}	
			
		
	
			
			System.out.println("");
			System.out.println("");
			System.out.println("All: ");
			for (int i = 0; i < ds.size(); i++) 
			{

					System.out.println(ds.get(i).toString());
			}
			System.out.println("");
			System.out.println("");
			System.out.println("Theo nhom thi dua: ");
			for (int i = 0; i < ds.size(); i++) 
			{
				if(ds.get(i).getHeSoThiDua() == 1)
					System.out.println(ds.get(i).toString());
			}
			
			for (int i = 0; i < ds.size(); i++) 
			{
				if(ds.get(i).getHeSoThiDua() == 0.8)
					System.out.println(ds.get(i).toString());
			}
			
			for (int i = 0; i < ds.size(); i++) 
			{
				if(ds.get(i).getHeSoThiDua() == 0.6)
					System.out.println(ds.get(i).toString());
			}
			System.out.println("");
			System.out.println("");
			System.out.println("Lanh Dao: ");
			
			for (int i = 0; i < ds.size(); i++) 
			{
				if(ds.get(i).getChucVu().equals("LanhDao"))
					System.out.println(ds.get(i).toString());
			}
			System.out.println("");
			System.out.println("");
			System.out.println("Loai < 10: ");
	
			for (int i = 0; i < ds.size(); i++) 
			{
				if(ds.get(i).getSoNgayLamViec() <10)
				{
					ds.remove(i);
					i--;
				}
			}
			
			for (int i = 0; i < ds.size(); i++) 
			{
				System.out.println(ds.get(i).toString());
			}
			System.out.println("");
			System.out.println("");
			System.out.println("Nhan Vien lam viec > 22: ");
			
			for (int i = 0; i < ds.size(); i++) 
			{
				if(ds.get(i).getChucVu().equals("NhanVien") && ds.get(i).getSoNgayLamViec() > 22)
					System.out.println(ds.get(i).toString());
			}
			
			System.out.println("");
			System.out.println("");
			System.out.println("Nhan Vien Tai Vu he so luong > 4.34: ");
			
			for (int i = 0; i < ds.size(); i++) 
			{
				if(ds.get(i).getPhongBan().equals("TaiVu") && ds.get(i).getHeSoLuong() > 4.34)
					System.out.println(ds.get(i).toString());
			}
			
			FileWriter fw = new FileWriter("output.xml"); 
        for (int  i = 0; i < ds.size(); i++) 
		{
                fw.write(ds.get(i).toString());
				fw.write("\r\n");
        }
     
        fw.close();
	}
	
}