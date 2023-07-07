package day4;

class A {
    static int count;

    final int x = 5;

    static void printCount() {
        System.out.println("static method called");
        System.out.println(count);
    }

    // static block
    static {
        count = 0;
    }
}

public class StaticKeyword {
    public static void main(String[] args) {
        System.out.println(A.count);
        A.printCount();
    }
}
