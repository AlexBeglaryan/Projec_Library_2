package OOP_2;

public class Employee extends Person{

    private String position;


    public Employee(String name, String surname, int age, String position) {
        super(name, surname, age);
        this.position = position;
    }

    //-----------------------------------------
    public String getPosition() {
        return position;
    }
}
