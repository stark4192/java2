import java.util.*;

class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter id for Worker:- ");
        int worker_id = sc.nextInt();
        System.out.print("Enter id for Manager:- ");
        int manager_id = sc.nextInt();
        System.out.print("Enter id for Other:- ");
        int other_id = sc.nextInt();
        Worker w1 = new Worker(worker_id);
        Manager m1 = new Manager(manager_id);
        Other o1 = new Other(other_id);
        w1.money();
        System.out.println();
        m1.money();
        System.out.println();
        o1.money();
        System.out.println();
    }
}

class employee {
    Scanner sc = new Scanner(System.in);
    int empid;
    int price_per_day;
    int day;

    employee(int id) {
        empid = id;
        System.out.print("empid - " + empid);
    }
}

class Worker extends employee {
    Worker(int id) {
        super(id);
        price_per_day = 300;
    }

    void money() {
        System.out.print("Enter no of days Worker works:- ");
        day = sc.nextInt();
        int mon = day * price_per_day;
        System.out.print("The ammout will be getting is $" + mon);
    }
}

class Other extends employee {
    Other(int id) {
        super(id);
        price_per_day = 200;
    }

    void money() {
        System.out.print("Enter no of days other works:- ");
        day = sc.nextInt();
        int mon = day * price_per_day;
        System.out.print("The ammout will be getting is $" + mon);
    }
}

class Manager extends employee {
    Manager(int id) {
        super(id);
        price_per_day = 400;
    }

    void money() {
        System.out.print("Enter no of half days manager works:- ");
        day = sc.nextInt();
        int mon = (day * 200);
        System.out.print("The ammout will be getting is $" + mon);
    }
}
