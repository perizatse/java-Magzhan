package ClassHW;

import java.util.Objects;

//Task 8.2
public class Triangle {
    double side1;
    double side2;
    double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle() {
    }

    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public String toString() {
        return "Triangle {" + "side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Triangle triangle = (Triangle) obj;
        return Double.compare(triangle.side1, side1) == 0 &&
                Double.compare(triangle.side2, side2) == 0 &&
                Double.compare(triangle.side3, side3) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(side1, side2, side3);
    }

    public static void main(String[] args) {

        Triangle triangle = new Triangle(3, 4, 5);


        double perimeter = triangle.calculatePerimeter();
        double area = triangle.calculateArea();

        System.out.println("Периметр треугольника: " + perimeter);
        System.out.println("Площадь треугольника: " + area);
    }
}


