import java.util.Scanner;
class commondigits{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter 2 nos : ");
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int freq[] = new int[10];
        while (num1 > 0) {
            int rem = num1 % 10;
            freq[rem]++;
            num1 = num1 / 10;
        }
        while (num2 > 0) {
            int rem = num2 % 10;
            freq[rem]++;
            num2 = num2 / 10;
        }
        System.out.println("Common digits are: ");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 1)
                System.out.print(i + " ");
        }
    }
}