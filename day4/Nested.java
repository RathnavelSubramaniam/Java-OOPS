package day4;

class OuterClass {
    int x;

    class InnerClass {
        int y;

        void printX() {
            System.out.println(x);
        }
    }

    InnerClass innerObject = new InnerClass();
}

public class Nested {
    public static void main(String[] args) {
        OuterClass outerObject = new OuterClass();
        outerObject.innerObject.printX();
        // System.out.println(outerObject.y); // error
    }
}
