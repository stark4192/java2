import java.util.Scanner;

interface employee {
    void earnings();

    void bonus();

    void deductions();
}

abstract class Manager implements employee {
    int basic;

    public void earnings() {
        int result;
        result = basic + (80 * basic / 100) + (15 * basic / 100);
        System.out.println("earning = " + result);
    }

    public void deductions() {
        int result = 12 * basic / 100;
        System.out.println("deduction = " + result);
    }
}

class substaff extends Manager implements employee {
    public void bonus() {
        int result = 50 * basic / 100;
        earnings();
        deductions();
        System.out.println("bonus = " + result);
    }
}



public class q3lab10{
    public static void main(String[] args) {
        substaff oSubstaff = new substaff();
        System.out.println("ENTER THE BASIC SALARY OF THE EMPLOYEE ");
        Scanner sc2 = new Scanner(System.in);
        oSubstaff.basic = sc2.nextInt();
        oSubstaff.bonus();
}
}