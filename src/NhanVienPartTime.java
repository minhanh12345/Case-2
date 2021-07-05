public class NhanVienPartTime extends NhanVien{
    private int timeWork;
    public NhanVienPartTime(){}

    public NhanVienPartTime(int id, String name, int age, String gender, String address, float luong, int timeWork,boolean status) {
        super(id, name, age, gender, address, luong,status);
        this.timeWork = timeWork;
    }

    public int getTimeWork() {
        return timeWork;
    }

    public void setTimeWork(int timeWork) {
        this.timeWork = timeWork;
    }

    @Override
    public float getDoanhThu() {
        return getLuong()*timeWork;
    }

    @Override
    public String toString() {
        return super.toString()+"NhanVienPartTime{" +
                "timeWork=" + timeWork +"Doanh thu "+getDoanhThu()+
                '}';
    }
}