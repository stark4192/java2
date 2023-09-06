import java.util.Scanner;

class monsoon {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. 1 : ");
        int num1 = s.nextInt();
        System.out.print("Enter no. 2 : ");
        int num2 = s.nextInt();
        System.out.print("Enter no. 3 : ");
        int num3 = s.nextInt();
        float avg = (float) ((num1 + num2 + num3) / 3.0);
        System.out.print("Enter average of 3 nos. : " + avg);
    }

}
