package day4;

class A {
    private int i;

    public void setI(int i) {
        this.i = i;
    }

    public void getI() {
        System.out.println(i);
    }
}

public class AccessSpecifiers {
    public static void main(String[] args) {
        A a1 = new A();

        a1.setI(5);
        a1.getI();
    }
}