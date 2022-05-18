------------------------------------------------18/5/2022---------------------------------------------------------

  
 
import java.util.*;

class students {
    private String name;
    private short rollnum;
    private byte age;
    private float weight;
    private float height;

    public void SetName(String name) {
        this.name = name;

    }

    public void SetRollNum(short rollnum) {
        this.rollnum = rollnum;

    }

    public void SetAge(byte age) {
        this.age = age;
    }

    public void SetWeight(float weight) {
        this.weight = weight;
    }

    public void SetHeight(float height) {
        this.height = height;
    }

    public String GetName() {
        return this.name;
    }

    public short GetRollNum() {
        return this.rollnum;
    }

    public byte GetAge() {
        return this.age;
    }

    public float GetWeight() {
        return this.weight;
    }

    public float GetHeight() {
        return this.height;
    }

}

class staff {
    private final String password = "1234";
    private String name;

    public void SetName(String name) {
        this.name = name;
    }

    public boolean check(String password) {
        if (this.password.equals(password)) {
            return true;
        }
        return false;
    }
}

public class controlstatement {
    static Scanner sc = new Scanner(System.in);
    static LinkedList<students> stud = new LinkedList<>();

    static void attendance(int n) {
        int i = 0;
        do {
            i++;
            if (i == n) {
                System.out.println("absent : " + n);
                continue;
            }
            System.out.println("present no :" + i);

        } while (i != 10);
    }

    public static void controls(staff s) {
        System.out.println("1. students details | 2.attendance");
        int n = sc.nextInt();
        if (n == 1) {
            for (students i : stud) {
                System.out.println("name : " + i.GetName() + "\nrollnum : " + i.GetRollNum() + "\nage : " + i.GetAge()
                        + " \nheight : " + i.GetHeight() + "\n weight : " + i.GetWeight());
            }
        } else {
            System.out.println("absent student num");
            attendance(sc.nextInt());
        }

    }

    public static void main(String[] args) {

        boolean loop = true;
        while (loop) {
            System.out.println("1. students | 2. staff");
            byte n = sc.nextByte();
            switch (n) {
                case 1:
                    System.out.println("your name \nyour rollnum \nyour age \nyour weight \nyour height");
                    String name = sc.next();
                    short rollnum = sc.nextShort();
                    byte age = sc.nextByte();
                    float weight = sc.nextFloat();
                    float height = sc.nextFloat();
                    students s1 = new students();
                    s1.SetName(name);
                    s1.SetRollNum(rollnum);
                    s1.SetAge(age);
                    s1.SetWeight(weight);
                    s1.SetHeight(height);
                    stud.add(s1);
                    break;
                case 2:
                    System.out.println("your name \nyour password");
                    String name1 = sc.next();
                    String password = sc.next();
                    staff s2 = new staff();
                    s2.SetName(name1);
                    if (s2.check(password)) {
                        controls(s2);
                    } else {
                        System.out.println("wrong password");
                    }
                    break;

            }
        }

    }

}
