package day4;

class A {
    int i;
    int j;

    A(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public String toString() {
        return "value of i = " + i + "\n" + "value of j = " + j;
    }

    void change(A a1) {
        a1.i = 5;
        a1.j = 10;
    }
}

public class CallByReference {
    public static void main(String[] args) {
        A a1 = new A(2, 3);

        System.out.println(a1);

        a1.change(a1);

        System.out.println(a1);
    }
}
