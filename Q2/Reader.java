package Q2;

public class Reader {
    private int id;
    private String name;
    private String phoneNum;
    private String address;
    
    public Reader() {
    }

    public Reader(int id, String name, String phoneNum, String address) {
        this.id = id;
        this.name = name;
        this.phoneNum = phoneNum;
        this.address = address;
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

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Reader [id=" + id + ", name=" + name + ", phoneNum=" + phoneNum + ", address=" + address + "]";
    }

    
}
