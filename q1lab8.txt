public class q1lab9 {

    public static void main(String[] args) {
        Manager m = new Manager(121, 23400, 4590);
        m.salary();
    }

}

class Employee {
    int empid;
    int basic;
    int DA;

    Employee(int empid, int basic, int DA) {
        this.empid = empid;
        this.basic = basic;
        this.DA = DA;
    }

    void salary() {
        int total = DA + basic;
        System.out.println(empid + " : " + total);
    }
}

class Manager extends Employee {
    int tallowance;

    Manager(int empid, int basic, int DA) {
        super(empid, basic, DA);
        System.out.println(basic);
        tallowance = basic/10;
        System.out.println(tallowance);
    }

    @Override
    void salary() {
        int total = basic + DA + tallowance;
        System.out.println(empid + " : " + total);
    }
}