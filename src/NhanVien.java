import java.io.Serializable;

public class NhanVien implements Serializable {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String address;
    private float luong;
    private float doanhThu;
    private boolean status;


    public float getDoanhThu() {
        return doanhThu;
    }


    public NhanVien(){}

    public NhanVien(int id, String name, int age, String gender, String address,float luong,boolean status) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.luong=luong;
        this.status=status;
    }
    public String getRealStatus(){
        String realStatus;
        if(status){realStatus="lam viec";}else realStatus="nghi viec";
        return realStatus;
    }
    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", luong=" + luong +
                ", doanhThu=" + doanhThu +
                ", status=" + getRealStatus() +
                '}';
    }
}
