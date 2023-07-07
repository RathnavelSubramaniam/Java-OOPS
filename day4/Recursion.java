package day4;

public class Recursion {

    public static void recurse(int times) {
        // for (int i = 0; i < times; i++) {
        // System.out.println("Hello World!");
        // }
        if (times == 0)
            return;

        System.out.println("Hello World!");
        recurse(times - 1);
    }

    public static void main(String[] args) {
        recurse(5);
    }
}

/*
 * recurse()
 * - print('recursion method')
 * - recurse()
 * - print('recursion method')
 * - recurse()
 * - print('recursion method')
 * - recurse()
 * ....
 * . ....
 */