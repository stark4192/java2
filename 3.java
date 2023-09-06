class marks {
    public static void main(String[] args) {
        int marks = 90;
        System.out.println("Marks obtained : " + marks);
        System.out.print("Grade obtained : ");
        if (marks >= 90)
            System.out.print('O');
        else if (marks >= 80 && marks < 90) {
            System.out.print('E');
        } else if (marks >= 70 && marks < 80) {
            System.out.print('A');
        } else if (marks >= 60 && marks < 70) {
            System.out.print('B');
        } else if (marks >= 50 && marks < 60) {
            System.out.print('C');
        } else if (marks >= 40 && marks < 50) {
            System.out.print('D');
        } else {
            System.out.print('F');
        }

    }
}