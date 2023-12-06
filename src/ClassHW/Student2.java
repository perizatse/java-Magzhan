package ClassHW;

public class Student2 {
    //Task 9

     private String name;
    private int id;
    private int yearOfStudy;

    public Student2(String name,int id){
        this.name=name;
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public int getYearOfStudy(){
        return yearOfStudy;
    }
    public void incYearOfStudy(){
        yearOfStudy++;
    }
}


