class pallindrome {

    public static void main(String[] args) {
        int num = 121;
        System.out.println("Number : " + num);
        int orig = num;
        int rev = 0;
        while (num > 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        if (rev == orig)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

    }

}
