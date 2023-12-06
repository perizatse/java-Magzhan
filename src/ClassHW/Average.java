package ClassHW;

import java.util.Objects;

//Task 8.4
public class Average {
    double firstNumber;
    double secondnumber;
    double thirdNumber;

    public Average(double firstNumber, double secondnumber, double thirdNumber) {
        this.firstNumber = firstNumber;
        this.secondnumber = secondnumber;
        this.thirdNumber = thirdNumber;
    }
    @Override
    public String toString() {
        return "Average {" +
                "firstNumber=" + firstNumber +
                ", secondNumber=" + secondnumber +
                ", thirdNumber=" + thirdNumber +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Average average = (Average) obj;
        return Double.compare(average.firstNumber, firstNumber) == 0 &&
                Double.compare(average.secondnumber, secondnumber) == 0 &&
                Double.compare(average.thirdNumber, thirdNumber) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstNumber, secondnumber, thirdNumber);
    }


    public Average() {}

    public double getAverage() {
        double average = (this.firstNumber + this.secondnumber + this.thirdNumber) / 2;
        return average;
    }

    public static void main(String[] args) {
        Average average = new Average(10, 10, 10);
        double average1 = average.getAverage();
        System.out.println(average1);
    }
}
