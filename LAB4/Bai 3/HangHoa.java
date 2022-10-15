import java.lang.invoke.ConstantCallSite;
import java.util.*;
import java.util.regex.Pattern;

public class HangHoa{
	protected String ID ; // ma hang 
	protected String tenHang ; 
    
    public HangHoa(){
        ID = ""; 
        tenHang = "";
    }

    public HangHoa(String ID , String tenHang){
        this.ID = ID ;
        this.tenHang = tenHang;
    }


    public String checkMa(){
        if(ID.length() == 5 ){
            if(ID.charAt(0) == 'H' && ID.charAt(1) == 'H' ){
                if(ID.charAt(2) == '0' || ID.charAt(2)== '1' || ID.charAt(2)== '2' || ID.charAt(2)== '3' ||ID.charAt(2)== '4' ||ID.charAt(2)== '5' ||ID.charAt(2)== '6' ||ID.charAt(2)== '7' ||ID.charAt(2)== '8' ||ID.charAt(2)== '9'){
                    if(ID.charAt(3) == '0' || ID.charAt(3)== '1' || ID.charAt(3)== '2' || ID.charAt(3)== '3' ||ID.charAt(3)== '4' ||ID.charAt(3)== '5' ||ID.charAt(3)== '6' ||ID.charAt(3)== '7' ||ID.charAt(3)== '8' ||ID.charAt(3)== '9'){
                        if(ID.charAt(4)== '0' || ID.charAt(4)== '1' || ID.charAt(4)== '2' || ID.charAt(4)== '3' ||ID.charAt(4)== '4' ||ID.charAt(4)== '5' ||ID.charAt(4)== '6' ||ID.charAt(4)== '7' ||ID.charAt(4)== '8' ||ID.charAt(4)== '9'){
                            return ID ; 
                        }
                        else{
                            return "HH001";
                        }
                    }
                    else{
                        return "HH001";
                    }
                }
                else{
                    return "HH001";
                }
            }
            else{
                return "HH001";
            }
        }
        else{
            String a = "Nhap sai dinh dang - ";
            String b = "Ma san pham chi duoc chua 5 ky tu - ";
            String c = "2 ki tu dau co dinh dang 'HH' -";
            String d = "3 ki tu cuoi co dinh dang la so bat ki tu 0 => 9. ";
            return (a + b + c + d).toUpperCase();
        }
    }

    public class outPut{
        void xuat(){
            System.out.println("Ma san pham   : "+checkMa());
            System.out.println("\nTen san  pham : "+tenHang);
        }
    }
}
