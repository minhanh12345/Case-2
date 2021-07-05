public class NhanVienFullTime extends NhanVien{

    public NhanVienFullTime(){}

    public NhanVienFullTime(int id, String name, int age, String gender, String address,float luong,boolean status) {
        super(id, name, age, gender, address,luong,status);
    }

    @Override
    public float getDoanhThu() {
        return this.getLuong()*10;
    }

    @Override
    public String toString() {
        return super.toString()+"NhanVienFullTime{}"+"Doanh thu "+getDoanhThu();
    }
}
