package ClassHW;

import java.util.Objects;

//Task 8.3
public class Rectangle {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {

    }
    public double areaCalculator() {
        double area = this.length * this.width;
        return area;
    }
    @Override
    public String toString() {
        return "Rectangle {" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Rectangle rectangle = (Rectangle) obj;
        return Double.compare(rectangle.length, length) == 0 &&
                Double.compare(rectangle.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, width);
    }
    public static void main(String[] args) {
        Rectangle rectangle1= new Rectangle(5,9);

        double area= rectangle1.areaCalculator();
        System.out.println(area);
    }
}