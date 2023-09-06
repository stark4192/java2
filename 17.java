class lab8q2 {

    public static void main(String[] args) {
        threeD x = new threeD(2, 3, 10);
        System.out.println("The total cost of making 2D plastic " + "(length = " + x.length + " , breadth = "
                + x.breadth + ") : " + x.total2DCost(40));
        System.out.println("The total cost of making 3D plastic " + "(length = " + x.length + " , breadth = "
                + x.breadth + " , height = " + x.height + " ) : " + x.total3DCost(60));
    }

}

class twoD {
    float length;
    float breadth;

    float area2D;

    public twoD(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
        area2D = length * breadth;
    }

    public float total2DCost(float costPerSqFt) {
        return costPerSqFt * area2D;
    }
}

class threeD extends twoD {
    float height;
    float vol;

    public threeD(float length, float breadth, float height) {
        super(length, breadth);
        this.height = height;
        vol = area2D * height;
    }

    public float total3DCost(float costPerCubeFt) {
        return costPerCubeFt * vol;
    }
}
