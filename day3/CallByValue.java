package day3;

class Test {
    void changeValues(int i, int j) {
        i = i * 2;
        j = j * 3;
    }
}

public class CallByValue {
    public static void main(String[] args) {
        Test testObject = new Test();

        int i = 5, j = 6;

        System.out.println("Before changeValues function call, i = " + i + " j = " + j);

        testObject.changeValues(i, j);

        System.out.println("After changeValues function call, i = " + i + " j = " + j);
    }
}
