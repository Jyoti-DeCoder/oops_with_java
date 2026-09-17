public class Constructor {
    public static void main(String[] args) {
        Parent obj = new Child(10);
    }
}
class Parent {
    int x;

    Parent(int x) {
        System.out.println("Parent Constructor");
        System.out.println(x);
    }
}
class Child extends Parent {
    Child(int s) {
        super(s);
        System.out.println("Child Constructor");
        System.out.println(s);

    }
}
