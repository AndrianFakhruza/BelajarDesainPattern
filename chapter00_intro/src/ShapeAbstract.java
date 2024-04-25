abstract class ShapeAbstract {
    abstract void calculateArea();
    void draw() {
        System.out.println("Drawing a shape");
    }
}

// concrete class untuk persegi
class Rectangle extends ShapeAbstract {
    final private double length;
    final private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void calculateArea() {
    }

    public void displayInfo() {
        System.out.println("Rectangle - Length = " + length + ", Width : " + width);
    }
}

// concrete class untuk lingkaran

class Circle extends ShapeAbstract {
    final private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // implementasi hitungan untuk lingkaran
    @Override
    void calculateArea() {
    }

    public void  displayInfo() {
        System.out.println("Circle - Radius : " + radius);
    }
}