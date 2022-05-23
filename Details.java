import java.util.*;

class Details {
    private String name = "";
    private short age = 0;
    private Long adhar = 0L;
    private String pasword = "";
    private byte wait_time = 0;
    private LinkedList<Controls> crr = new LinkedList<>();

    public void setName(String name) {
        this.name = name;

    }

    public void setPassword(String password) {
        this.pasword = password;

    }

    public void setAge(short age) {
        this.age = age;

    }

    public void setAdhar(Long adhar) {
        this.adhar = adhar;

    }

    public void setWait_time(byte wait_time) {
        this.wait_time = wait_time;

    }

    public String getName() {
        return this.name;
    }

    public String getpassword() {
        return this.pasword;
    }

    public short getAge() {
        return this.age;
    }

    public Long getAdhar() {
        return this.adhar;
    }

    public LinkedList<Controls> getList() {
        return this.crr;
    }

    public void add(Controls c) {
        this.crr.add(c);
    }

    public byte getWaittime() {
        return wait_time;
    }

}

class driver extends Details {
    private int auto_num = 0;
    private Long license = 0L;
    private char place = 'A';
    private int totalcost = 0;

    public void setAuto(int auto_num) {
        this.auto_num = auto_num;

    }

    public void setLicense(Long license) {
        this.license = license;

    }

    public void settoatalcost(int totalcost) {
        this.totalcost += totalcost;

    }

    public void setPlace(char place) {
        this.place = place;
    }

    public int getauto_num() {
        return this.auto_num;
    }

    public long get_license() {
        return this.license;
    }

    public char getplace() {
        return this.place;
    }

    public int get_totalcost() {
        return this.totalcost;
    }

}