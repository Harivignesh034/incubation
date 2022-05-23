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

---------------------------------------------20/5/2022---------------------------------------------
  
  -----------------------------ArrayQueue--------------------------------------------------------
  
  
  
import java.util.*;

public class Arrayqueue {
    static int max = 10;
    static int top = 0;
    static int bottom = 0;
    int arr[] = new int[max + 1];

    Arrayqueue() {
        top = -1;
    }

    void push(int data) {

        if (top > (int) max / (100 / 50)) {
            max = max * 2;
            int brr[] = new int[max];

            brr = Arrays.copyOf(arr, top + 1);
            System.out.println(Arrays.toString(arr));
            arr = Arrays.copyOf(brr, max);
            System.out.println(Arrays.toString(arr));
        } else {
            arr[++top] = data;
        }

    }

    int pop1() {
        int a = 0;
        if (top < 0) {
            System.out.println("underflow");

        } else {

            a = arr[bottom];
            arr[bottom] = 0;
            bottom++;
        }
        return a;
    }

    int peek() {
        return arr[bottom];
    }

    void display() {
        for (int i = bottom; i < max; i++) {
            if (arr[i] != 0)
                System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Arrayqueue s = new Arrayqueue();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.push(70);
        s.push(80);
        s.push(90);
        s.push(60);
        s.push(70);
        s.push(80);
        s.push(90);

        System.out.println("pop" + s.pop1());
        System.out.println("peek" + s.peek());
        s.display();
    }
}
--------------------------------------ArrayStack----------------------------------------
  import java.util.*;

public class ArrayStack {
    static int max = 10;
    static int top = 0;
    int arr[] = new int[max + 1];

    ArrayStack() {
        top = -1;
    }

    void push(int data) {

        if (top > (int) max / (100 / 50)) {
            max = max * 2;
            int brr[] = new int[max];
            brr = Arrays.copyOf(arr, top + 1);
            System.out.println(Arrays.toString(arr));
            arr = Arrays.copyOf(brr, max);
            System.out.println(Arrays.toString(arr));
        } else {
            arr[++top] = data;
        }

    }

    int pop() {
        int a = 0;
        if (top < 0) {
            System.out.println("underflow");

        } else {

            a = arr[top--];
            arr[top + 1] = 0;
        }
        return a;
    }

    void display() {
        for (int i = top; i > -1; i--) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        ArrayStack s = new ArrayStack();
        ArrayStack s1[] = new ArrayStack[10];
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.push(70);
        s.push(80);
        s.push(90);
        s.push(60);
        s.push(70);
        s.push(80);
        s.push(90);

        s.pop();
        s.display();
    }
}
---------------------------------------------LinkedList---------------------------------------------------
  public class LinkedList1 {
    node head = null;
    node tail = null;

    class node {
        int data;
        node next;
        node prev;

        node(int data) {
            this.data = data;
            next = null;
            prev = null;
        }

    }

    void add(int data) {
        node n = new node(data);
        if (head == null) {
            head = n;
            tail = n;
            head.prev = null;
            head.next = null;

        } else {
            tail.next = n;
            n.prev = tail;
            tail = tail.next;

        }
    }

    int pop() {
        node cur = head;
        head = head.next;
        return cur.data;
    }

    int peek() {
        return head.data;
    }

    int stack_peek() {
        return tail.data;
    }

    int stack_pop() {
        node cur = tail;
        tail.prev.next = null;
        return cur.data;
    }

    void remove(int data) {
        node cur = head;
        // node prev1 = head;
        if (head.data == data) {
            head = head.next;
            head.prev = null;

        } else {

            while (cur != null) {

                if (cur.data == data) {

                    cur.prev.next = cur.next;

                }

                cur = cur.next;
            }
        }

    }

    void display() {
        node cur = head;
        while (cur != null) {
            System.out.println(cur.data);
            cur = cur.next;
        }
    }

    void rev_display() {
        node cur = tail;
        while (cur != null) {
            System.out.println(cur.data);
            cur = cur.prev;
        }
    }

    public static void main(String[] args) {

        LinkedList1 l1 = new LinkedList1();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        l1.add(60);
        l1.add(70);
        // l1.display();
        // System.out.println(l1.pop());
        // l1.display();
        // l1.remove(10);
        l1.display();

        l1.remove(30);
        l1.display();

    }

}
-------------------------------------HashMap------------------------------------------------
  
public class hashmap<K, V> {
    int n = 90;

    private class Entry<K, V> {
        private K key;
        private V value;
        private Entry<K, V> next;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return this.key;
        }

        public V getValue() {

            return this.value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        @Override
        public String toString() {
            Entry<K, V> temp = this;
            StringBuilder sb = new StringBuilder();
            while (temp != null) {
                sb.append(temp.key + " -> " + temp.value + ",");
                temp = temp.next;
            }
            return sb.toString();
        }

    }

    private final int SIZE = 5;

    private Entry<K, V> table[];

    public hashmap() {
        table = new Entry[SIZE];
    }

    public void put(K key, V value) {
        int hash = key.hashCode() % SIZE;
        Entry<K, V> e = table[hash];

        if (e == null) {
            table[hash] = new Entry(key, value);
        } else {
            while (e.next != null) {
                if (e.getKey() == key) {
                    e.setValue(value);
                    return;
                }
                e = e.next;
            }

            if (e.getKey() == key) {
                e.setValue(value);
                return;
            }

            e.next = new Entry<K, V>(key, value);
        }
    }

    public V get(K key) {
        int hash = key.hashCode() % SIZE;
        Entry<K, V> e = table[hash];

        if (e == null) {
            return null;
        }

        while (e != null) {
            if (e.getKey() == key) {
                return e.getValue();
            }
            e = e.next;
        }

        return null;
    }

    public Entry<K, V> remove(K key) {
        int hash = key.hashCode() % SIZE;
        Entry<K, V> e = table[hash];

        if (e == null) {
            return null;
        }

        if (e.getKey() == key) {
            table[hash] = e.next;
            e.next = null;
            return e;
        }

        Entry<K, V> prev = e;
        e = e.next;

        while (e != null) {
            if (e.getKey() == key) {
                prev.next = e.next;
                e.next = null;
                return e;
            }
            prev = e;
            e = e.next;
        }

        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < SIZE; i++) {
            if (table[i] != null) {
                sb.append(i + " " + table[i] + "\n");
            } else {
                sb.append(i + " " + "null" + "\n");
            }
        }

        return sb.toString();
    }

}

class Driver {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        hashmap<String, String> myHashMap = new hashmap<String, String>();
        myHashMap.put("A", "B");
        myHashMap.put("E", "F");
        myHashMap.put("H", "P");
        myHashMap.put("P", "2");
        myHashMap.put("1", "G");
        myHashMap.put("2", "6");
        myHashMap.put("3", "2");
        myHashMap.put("4", "4");
        myHashMap.put("1", "H");

        // System.out.println(myHashMap);
        // System.out.println(myHashMap.get("A"));
        // System.out.println(myHashMap.remove("A"));
        myHashMap.remove("2");
        System.out.println(myHashMap);
    }

}
  
