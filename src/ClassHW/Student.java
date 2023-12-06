package ClassHW;

public class Student {
    String name;
    String surname;
    String adress;
    int id;

    public Student(String name, String surname, String adress, int id) {
        this.name = name;
        this.surname = surname;
        this.adress = adress;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + adress + '\'' +
                ", id=" + id +
                '}';
    }

    public Student() {

    }

    public static void main(String[] args) {
        Student Student = new Student();
        Student.name = "Алиса";
        Student.surname = "Смит";
        Student.adress = "Коктем-2";
        Student.id = 24;

        Student Student1 = new Student();
        Student.name = "Азамат";
        Student.surname = "Мусагалиев";
        Student.adress = "Коктем-3";
        Student.id = 30;

        Student Student3 = new Student();
        Student.name = "Кристина";
        Student.surname = "Асмус";
        Student.adress = "Коктем-4";
        Student.id = 26;


    }
}