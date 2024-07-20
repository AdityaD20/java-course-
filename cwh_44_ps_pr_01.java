
//question 1  practisseset 9

class Cylinder {
    private double height;
    private double radius;

    public void setRadius(double r) {
        this.radius = r;
    }
    public double getRadius() {
        return radius;
    }

    public void setHeight(double h) {
        this.height = h;
    }
    public double getHeight() {
        return height;
    }
}

public class cwh_44_ps_pr_01 {
    public static void main(String args[]) {
        Cylinder rad = new Cylinder();
        Cylinder hgt = new Cylinder();

        rad.setRadius(2.5);
        hgt.setHeight(5);

        System.out.println(rad.getRadius());
        System.out.println(hgt.getHeight());
    }
}


//question 2

class Cylinder {
    private double height;
    private double radius;

    public void setRadius(double r) {
        this.radius = r;
    }
    public double getRadius() {
        return radius;
    }

    public void setHeight(double h) {
        this.height = h;
    }
    public double getHeight() {
        return height;
    }

    public double surfaceArea() {
        return (2* Math.PI * radius * radius) + (2*Math.PI * radius * height);
    }
    public double volume(){
        return Math.PI * radius * radius * height;
    }
}

public class cwh_44_ps_pr_06 {
    public static void main(String args[]) {
        Cylinder mycylinder = new Cylinder();

        mycylinder.setRadius(2.5);
        mycylinder.setHeight(5);

        System.out.println(mycylinder.getRadius());
        System.out.println(mycylinder.getHeight());

        System.out.println(mycylinder.surfaceArea());
        System.out.println(mycylinder.volume());
    }
}


//question 3
class Cylinder {
    private double height;
    private double radius;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double surfaceArea() {
        return (2* Math.PI * radius * radius) + (2*Math.PI * radius * height);
    }
    public double volume(){
        return Math.PI * radius * radius * height;
    }
}

public class cwh_44_ps_pr_03 {
    public static void main(String args[]) {
        Cylinder mycylinder = new Cylinder(5, 9.8);
        System.out.println(mycylinder.surfaceArea());
        System.out.println(mycylinder.volume());
    }
}

// question 4

class Rectangle {
    private int length;
    private int breadth;

    public Rectangle() {
        length = 5;
        breadth = 5;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

public class cwh_44_ps_pr_04 {
    public static void main(String args[]) {
        Rectangle rect = new Rectangle(80, 40);
        System.out.println(rect.getLength());
        System.out.println(rect.getBreadth());
    }
}