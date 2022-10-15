public class TestNuocGiaiKhat{
    public static void main(String[] args){
        NuocGiaiKhat ngk1 = new NuocGiaiKhat("HH005","String","lon",15.0,23.5);
        NuocGiaiKhat.outPut ngk2 = ngk1.new outPut();
        ngk2.xuat();
    }
}
