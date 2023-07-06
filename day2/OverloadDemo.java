package day2;
class Overload {
    void test() {
        System.out.println("test method called");
    }

    void test(int x) {
        System.out.println("test method with int " + x);
    }

    void test(double x) {
        System.out.println("test method with double " + x);
    }

    void test(double x, double y) {
        System.out.println("test method with two ints");
    }

}

public class OverloadDemo {
    public static void main(String[] args) {
        Overload testObject = new Overload();

        testObject.test(23, 34);
    }
}
