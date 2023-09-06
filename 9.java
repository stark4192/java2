import java.util.Scanner;

class volume {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        box obj = new box();
        System.out.print("Enter height : ");
        obj.height = s.nextInt();
        System.out.print("Enter breadth : ");
        obj.breadth = s.nextInt();
        System.out.print("Enter length : ");
        obj.length = s.nextInt();
        System.out.println("Volume of box : " + obj.volume());
    }

}

class box {
    int length;
    int breadth;
    int height;

    public int volume() {
        return length * breadth * height;
    }
}
