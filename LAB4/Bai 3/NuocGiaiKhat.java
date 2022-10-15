import java.util.*;

public class NuocGiaiKhat extends HangHoa{
    protected String DonViTinh ;
    protected double SoLuong ; 
    protected double DonGia ;

    public NuocGiaiKhat(){
        super(); 
        DonViTinh = "";
        SoLuong = 0.0 ; 
        DonGia = 0.0 ;
    }
    
    public NuocGiaiKhat(String ID ,String tenHang , String DonViTinh , double SoLuong , double  DonGia){
        super(ID,tenHang);
        this.DonViTinh = DonViTinh ; 
        this.SoLuong = SoLuong ; 
        this.DonGia = DonGia ;
    }

    public String checkDonViTinh(){
        if(DonViTinh.length() <= 5){
            if(DonViTinh.charAt(0) == 't' && DonViTinh.charAt(1) == 'h' && DonViTinh.charAt(2) == 'u' && DonViTinh.charAt(3) == 'n' && DonViTinh.charAt(4) == 'g'){
                return DonViTinh;
            }
            else if(DonViTinh.charAt(0) == 'k' && DonViTinh.charAt(1) == 'e' && DonViTinh.charAt(2) == 't'){
                return DonViTinh;
            }
            else if(DonViTinh.charAt(0) == 'c' && DonViTinh.charAt(1) == 'h' && DonViTinh.charAt(2) == 'a' && DonViTinh.charAt(3) == 'i'){
                return DonViTinh;
            }
            else if(DonViTinh.charAt(0) == 'l' && DonViTinh.charAt(1) == 'o' && DonViTinh.charAt(2) == 'n'){
                return DonViTinh;
            } 
            else{
                return "ket";
            }
        }
        else{
            String a =  "Sai dinh dang - ";
            String b =  "Chi nhap bang 5 hoac it hon 5 ki tu - ";
            String c =  "Gom co 'ket - thung - chai - lon'.";
            return (a + b + c).toUpperCase() ;     }
    }

    public double checkThanhTien(){
        double thanhtien ; 
        if(checkDonViTinh() == "ket" || checkDonViTinh() == "thung" ){
            thanhtien = this.SoLuong * this.DonGia;
            return thanhtien;
        }
        else if(checkDonViTinh() == "chai"){
            thanhtien = this.SoLuong *  (this.DonGia / 20);
            return thanhtien;
        }
        else{
            thanhtien = this.SoLuong * (this.DonGia / 24);
            return thanhtien ; 
        }
    }

    public double checkTongTien(){
        double tongtien ;
        if(checkDonViTinh() == "ket" || checkDonViTinh() == "thung" ){
            tongtien = checkThanhTien() * 5.0 ;// ti le chiet khau ;
            return tongtien;
        }
        else if(checkDonViTinh() == "chai"){
            tongtien = checkThanhTien() * 5.0; // ti le chiet khau ;
            return tongtien;
        }
        else{
            tongtien = checkThanhTien() * 5.0 ;// ti le chiet khau ;
            return tongtien ; 
        }
    }

    public class outPut{
        void xuat(){
            System.out.println("Ma san pham   : "+checkMa());
            System.out.println("Ten san  pham : "+tenHang);
            System.out.println("Don vi tinh   : "+checkDonViTinh());
            System.out.println("So luong      : "+SoLuong);
            System.out.println("Don Gia       : "+DonGia);
            System.out.println("Thanh tien    : "+checkThanhTien());
            System.out.println("Tong tien     : "+checkTongTien());

        }
    }
}


