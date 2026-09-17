public class Overriding {
    int x = 10;

    public static void main(String[] args) {
        Shape obj = new Circle(20.0);
        obj.area();
        Shape obj2 = new Rectangle(10, 20);
        obj2.area();
        Shape[] obj3 = { new Circle(20.0), new Rectangle(10, 20) };
        for (Shape i : obj3)
            i.area();
    }
}

abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    private double r;

    Circle(double r) {
        this.r = r;
    }

    void area() {
        System.out.println("Area of Circle is" + (22 / 7.0 * r * r));
    }
}

class Rectangle extends Shape {
    private int l, b;

    Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    void area() {
        System.out.println("Area of Rectangle is " + (l * b));
    }
}