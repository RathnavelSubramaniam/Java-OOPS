package day3;

class Box {
    double width;
    double height;
    double depth;

    // default constructor
    Box() {
        this.width = 2.5;
        this.height = 2.5;
        this.depth = 2.5;
    }

    Box(Box box) {
        this.height = box.height;
        this.width = box.width;
        this.depth = box.depth;
    }

    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    Box(double width) {
        this.height = 2.5;
        this.depth = 2.5;
    }

    Box(double width, double height) {
        this.depth = 2.5;
    }

    double calculateVolume() {
        return this.width * this.height * this.depth;
    }

    // method to check whether two objects are equal or not
    boolean equalTo(Box box) {
        if (this.width == box.width && this.height == box.height && this.depth == box.depth) {
            return true;
        } else {
            return false;
        }
    }
}

public class Constructors {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(3.12, 1.45, 6.43);
        Box box3 = new Box();
        Box box4 = new Box(box2);
        // System.out.println("Volume of the box is " + box1.calculateVolume());
        // System.out.println("Volume of the box is " + box2.calculateVolume());

        if (box1.equalTo(box3)) {
            System.out.println("Objects are Equal");
        } else {
            System.out.println("Objects are not Equal");
        }
    }
}
