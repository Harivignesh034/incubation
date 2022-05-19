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

-----------------------------------------------------------19/5/2022----------------------------------------------------------
  
  
  
class livingthings extends dogs {
    private String name = "";
    private byte age = 0;

    public void setName(String name) {
        this.name = name;
    }

    public void setage(byte age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public byte getage() {
        return this.age;
    }

    livingthings get() {
        return this;
    }

}

interface works {
    public void dance();

    public void play();
}

abstract class animal implements works {

    public void eat() {
        System.out.println("can eat");
    }

    abstract void speak();

}

class dogs extends animal {

    void speak() {
        System.out.println("can speak");
    }

    public void dance() {
        System.out.println("can dance");

    }

    public void play() {
        System.out.println("can play");
    }

    public int add(int n, int m) {
        return n + m;
    }

}

public class Oops1 {
    public static void main(String[] args) {

        livingthings l = new livingthings();
        l.setName("lab");
        l.setage((byte) 2);
        System.out.println(l.getName() + "   " + l.getage());
        works w = new dogs();
        w.dance();
        animal a = new dogs();
        a.eat();

    }

}
//oops


import java.util.*;

interface engine {
    void get();

    int discount(int n);
}

abstract class blueprint implements engine {
    abstract int discount(int n, int p);

}

class motors extends blueprint {

    String name = "audi";
    static int wheels = 4;
    static int max_speed = 150;
    static int price = 500000;

    static {
        wheels = 10;
        max_speed = 20;
    }

    void heat() {
        System.out.print(this.name);

    }

    public void set(String name, int wheels, int max_speed) {
        this.name = name;
        this.wheels = wheels;
        this.max_speed = max_speed;
    }

    static class inner {
        void get() {
            System.out.println("inner wheels " + wheels);
        }
    }

    public void get() {
        System.out.println("name :" + name + "\nwheels : " + wheels + "\nmax speed : " + max_speed);
    }

    {
        System.out.println("name :" + name + "\nwheels : " + wheels + "\nmax speed : " + max_speed);
    }

    public int discount(int n) {
        return price + (price / (100 / n));

    }

    public int discount(int n, int price) {
        return price + (price / (100 / n));

    }

    @Override
    public String toString() {
        return "10";
    }

}

public class car extends motors {
    public int discount(int n) {
        System.out.println("super");
        return super.discount(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        car c = new car();
        System.out.println(wheels);

        motors c1 = new car();
        c1.set("mahindra", 5, 120);
        motors.inner in = new motors.inner();
        in.get();
        System.out.println(c1);

        boolean loop = true;
        while (loop) {
            System.out.println("1. print car detials | 2. EMI detials ");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    c1.get();
                    break;
                case 2:
                    System.out.println("1. EMI in 12 months 10% interest  | 2. EMI in 24 months 15% interest");
                    int m = sc.nextInt();
                    if (m == 1) {
                        System.out.println("actual price  :" + c1.price);
                        System.out.println("actual price 10% : " + c1.discount(10));
                    } else {
                        System.out.println("actual price  :" + c1.price);
                        System.out.println("actual price 15% : " + c1.discount(15, 500000));
                    }
                    break;
                case 3:
                    loop = false;
                    break;
            }
        }

    }
}
//java8

class MySingleton {
    static MySingleton instance = null;
    public int x = 10;

    final int PIN=100;

    
    private MySingleton() {
    }

   
    static public MySingleton getInstance() {
        if (instance == null)
            instance = new MySingleton();

        return instance;
    }
}
  
