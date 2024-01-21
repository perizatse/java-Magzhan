package ClassHW;
import java.util.Scanner;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Book {
    private String name;
    private int age;

    public Book (String name, int age){
        this.name=name;
        this.age=age;
    }
    @Override
    public String toString() {
        return "Пользователь: "+ name +"," + " " + "Возраст:"+age;
    }

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя:" );
        String name = scan.nextLine();
        System.out.println("Введите возраст: ");
        int age = scan.nextInt();

        Book mybook = new Book(name,age);
        System.out.println(mybook);
    }
}
