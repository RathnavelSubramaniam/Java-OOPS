package day2;
// custom data type
class Box {
    // define the member instances
    double width;
    double height;
    double depth;

    // return-type methodName (datatype argument1, ...)
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

class BoxDemo {
    public static void main(String[] args) {
        // the following objects are not instantiated
        Box box1 = new Box();
        Box box2 = new Box();

        // set the dimensions of the box1
        box1.setDimensions(23.43, 12.36, 10.67);
        box2.setDimensions(3.43, 2.36, 0.67);

        // box1.width *= 2; // box1.width = box1.width * 2

        double volume1 = box1.calculateVolume();
        double volume2 = box2.calculateVolume();

        System.out.println("Volume of the box1 is " + volume1);
        System.out.println("Volume of the box2 is " + volume2);
    }
}

/*
 * box1.width
 * box1.height
 * box1.depth
 * 
 * 
 * box2.width
 * box2.height
 * box2.depth
 */