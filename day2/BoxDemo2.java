package day2;
class Box {
    double width;
    double height;
    double depth;

    // parametrized constructor
    Box(double depth, double height, double width) {
        this.depth = depth;
        this.height = height;
        this.width = width;
    }

    double calculateVolume() {
        double volume = this.depth * this.height * this.width;
        return volume;
    }

    void setDimensions(double depth, double height, double width) {
        this.depth = depth;
        this.height = height;
        this.width = width;
    }
}

class BoxDemo2 {
    public static void main(String[] args) {
        Box box1 = new Box(23.43, 12.36, 10.67);

        // System.out.println(box1);
        // System.out.println(box2);

        // box1.setDimensions(23.43, 12.36, 10.67);
        // box2.setDimensions(3.43, 2.36, 0.67);

        double volume1 = box1.calculateVolume();
        // double volume2 = box2.calculateVolume();

        System.out.println("Volume of the box1 is " + volume1);
        // System.out.println("Volume of the box2 is " + volume2);
    }
}