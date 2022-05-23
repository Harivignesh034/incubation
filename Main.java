import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static HashMap<String, Details> map1 = new HashMap<String, Details>();
    static HashMap<String, driver> map2 = new HashMap<String, driver>();
    static LinkedList<driver> drr = new LinkedList<>();
    static int cost = 100;

    static String booking(char pick) {
        int max_distance = Integer.MAX_VALUE;
        for (driver i : drr) {
            int distance = Math.abs(i.getplace() - pick);
            if (distance < max_distance) {
                max_distance = distance;

            }
        }
        int max_cost = Integer.MAX_VALUE;
        String name = "";
        for (driver i : drr) {
            int distance = Math.abs(i.getplace() - pick);
            if (distance == max_distance) {
                if (max_cost > i.get_totalcost()) {
                    max_cost = i.get_totalcost();
                    i.setWait_time((byte) max_distance);

                    name = i.getName();
                }

            }
        }
        return name;
    }

    static void driver_controls(driver d) {
        boolean loop = true;
        while (loop) {
            System.out.println("1. print totalcost | 2. print details 3. exit");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("totalcost : " + d.get_totalcost());
                    break;
                case 2:
                    for (Controls i : d.getList()) {
                        System.out
                                .println("name : " + i.obj.getName() + "\npick place :" + i.pick + "\ndrop : " + i.drop
                                        + "\ncost : " + i.cost);
                    }
                    break;
                case 3:
                    loop = false;
            }
        }
    }

    static void calc(char a, char b, Details d) {
        int s = Math.abs(a - b);
        byte travel_time = (byte) s;
        int cost = (s * 15) * 10;
        String driver_name = booking(a);
        if (map2.containsKey(driver_name)) {

            driver d1 = (driver) map2.get(driver_name);
            d1.setPlace(b);
            System.out.println(
                    "driver name : " + d1.getName() + "\nauto num :" + d1.getauto_num() + "\n place" + d1.getplace());
            d1.settoatalcost(cost);

            Controls c = new Controls(a, b, cost, (byte) 2, (byte) travel_time, d);

            d.add(c);
            d1.add(c);

        } else {
            System.out.println("no auto booked");
        }

    }

    static void controls(Details d) {
        boolean loop = true;
        while (loop) {
            System.out.println("1. booking | 2. print tax place | 3. print booking details | 4. exit");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("pick point");
                    System.out.println("A | B | C | D | E | F");
                    char pick = sc.next().charAt(0);
                    System.out.println("drop point");
                    System.out.println("A | B | C | D | E | F");
                    char drop = sc.next().charAt(0);
                    calc(pick, drop, d);

                    break;
                case 2:
                    for (driver i : drr) {
                        System.out.println("name : " + i.getName() + "\n place :" + i.getplace());
                    }

                    break;
                case 3:
                    for (Controls i : d.getList()) {
                        System.out
                                .println("name : " + i.obj.getName() + "\npick place :" + i.pick + "\ndrop : " + i.drop
                                        + "\ncost : " + i.cost);
                    }
                    break;
                case 4:
                    loop = false;
                    break;

            }
        }
    }

    static void sign() {
        System.out.println("your name");
        String name = sc.next();
        System.out.println("create password");
        String password = sc.next();
        System.out.println("your age");
        short age = sc.nextShort();
        System.out.println("your adhar num");
        Long adhar = sc.nextLong();
        Details d = new driver();
        d.setName(name);
        d.setPassword(password);
        d.setAge(age);
        d.setAdhar(adhar);
        map1.put(name, d);
        controls(d);
        System.out.println(map1);

    }

    static void sign(int d) {
        System.out.println("your name");
        String name = sc.next();
        System.out.println("create password");
        String password = sc.next();
        System.out.println("your age");
        short age = sc.nextShort();
        System.out.println("your adhar num");
        Long adhar = sc.nextLong();
        System.out.println("your auto num");
        int auto_num = sc.nextShort();
        System.out.println("your license");
        long license = sc.nextLong();
        driver d1 = new driver();
        d1.setName(name);
        d1.setAge(age);
        d1.setPassword(password);
        d1.setAdhar(adhar);
        d1.setAuto(auto_num);
        d1.setLicense(license);
        map2.put(d1.getName(), d1);
        drr.add(d1);
        driver_controls(d1);
    }

    static void login() {
        System.out.println("enter you usernamer");
        String username = sc.next();
        System.out.println("enter your password");
        String password = sc.next();
        System.out.println(map1);
        if (map1.containsKey(username)) {
            if (map1.get(username).getpassword().equals(password)) {
                controls(map1.get(username));
                System.out.println("successs");

            } else {
                System.out.println("wrong password");
            }
        } else {
            System.out.println("no user exits");
        }

    }

    static void login(int a) {
        System.out.println("enter you usernamer");
        String username = sc.next();
        System.out.println("enter your password");
        String password = sc.next();
        System.out.println(map2);
        if (map2.containsKey(username)) {
            if (map2.get(username).getpassword().equals(password)) {

                System.out.println("successs");
                driver_controls((driver) map2.get(username));

            } else {
                System.out.println("wrong password");
            }
        } else {
            System.out.println("no user exits");
        }

    }

    public static void main(String[] args) {

        System.out.println("welcome kiki auto travels");
        boolean loop = true;
        while (loop) {
            System.out.println("1. customer | 2. driver");
            int n = sc.nextInt();
            if (n == 1) {
                System.out.println("1. sign | 2. login");
                int m = sc.nextInt();
                if (m == 1) {
                    sign();
                } else {
                    login();
                }

            } else {

                System.out.println("1. sign | 2. login");
                int m = sc.nextInt();
                if (m == 1) {
                    sign(1);
                } else {
                    login(1);
                }

            }

        }
    }
}