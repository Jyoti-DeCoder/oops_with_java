package Main;

public interface Inheritance {
    int a = 10;

    void display();

}

class A implements Inheritance {
    int b = 20, a = 20;

    public void display() {
        System.out.println("value of a and b: " + a + " " + b);
    }
}

class B extends A {
    int b = 20, a = 30;

    public void display() {
        System.out.println("value of a and b: " + a + " " + b);
    }

}

class Main {
    public static void main(String[] args) {
        Inheritance[] obj = { new A(), new B() };
        for (Inheritance i : obj)
            i.display();

    }
}
