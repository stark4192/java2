import java.util.Scanner;

class LargestNumberExample1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int max = a;
        if (b > max)
            max = b;
        if (c > max)
            max = c;
        System.out.println("Largest no. = " + max);

    }
}