package day4;

public class CommandLine {

    public static void sum(int a, int b, int... v) {
        System.out.println(a + b + v[0] + v[1] + v[2]);
    }

    public static void main(String[] args) {
        // System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
        // System.out.println(args.length);
        sum(1, 2, 3, 4, 5);
    }
}
