public class Animal {
    //-------------------Инициализатор



    //------------------------------Свойства-----------------------------------
    private String type;
    private String name;
    private int age;
    private double weight;
    private boolean isFlye;
    private boolean isWalk;
    private boolean isSwim;

    private final static String description = "Этот класс описывает дикое животное";

    static int number;


    //-------------------Инициализатор

    {

        name = "Том";
        type = "Млекопитающее";

        number ++;


    }



    //------------------------------Конструкторы-----------------------------------


    public Animal(String type, String name, int age, double weight, boolean isFlye, boolean isWalk, boolean isSwim) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isFlye = isFlye;
        this.isWalk = isWalk;
        this.isSwim = isSwim;
    }

    public Animal(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public Animal(String type, int age) {
        this.type = type;
        this.name = "No Name";
        this.age = age;
    }


    public Animal(){


    }

    //------------------------------Методы-----------------------------------
    public void display() {

        System.out.println("Тип:" + " " + type);
        System.out.println("Имя:" + " " + name);
        System.out.println("Возраст:" + " " + age);
        System.out.println("Вес:" + " " + weight);
        System.out.println(isFlye ? "Умеет летать:" + " " + "Да" : "Умеет летать" + " " + "Нет");
        System.out.println(isSwim ? "Умеет плавать:" + " " + "Да" : "Умеет плавать" + " " + "Нет");

    }


    public final void rename(String newName) {
        this.name = newName;
        System.out.println("Имя изменено на:" + " " + this.name);
    }


    public void holiday(int holidayCount) {

        this.weight += (0.1 * holidayCount);
        System.out.println("За праздники животное поправилось и теперь весит" + " " + this.weight);

    }

    public void holiday(double m) {

        this.weight += (0.1 * m);
        System.out.println("За праздники животное поправилось и теперь весит" + " " + this.weight);

    }

    public void holiday(double m, int n) {

        double localWeight = weight;

        for (int i = 0; i < n; i++) {

            localWeight += m;
        }

        this.weight = localWeight;
        System.out.println("За праздники животное поправилось и теперь весит" + " " + this.weight);

    }


    public static void hunt(){
        System.out.println("Животное охотится");

    }


    //------------------------------Get-----------------------------------

    public void getType() {
        System.out.println(type);
    }

    public void getName() {
        System.out.println(name);
    }

    public void getAge() {
        System.out.println(age);
    }

    public void getWeight() {
        System.out.println(weight);
    }

    public void isflye() {
        System.out.println(isFlye);
    }

    public void isSwim() {
        System.out.println(isSwim);
    }

    public void isWalk() {
        System.out.println(isWalk);
    }
    //------------------------------Set-----------------------------------

    public void setType(String newType) {
        this.type = newType;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public void setWeight(double newWeight) {
        this.weight = newWeight;
    }

    public void setFlye(boolean newIsFlye) {
        this.isFlye = newIsFlye;
    }

    public void setSwim(boolean newIsSwim) {
        this.isSwim = newIsSwim;
    }

    public void setWalk(boolean newIsWalk) {
        this.isWalk = newIsWalk;
    }


    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", isFlye=" + isFlye +
                ", isWalk=" + isWalk +
                ", isSwim=" + isSwim +
                ", Общее количество животных = " + number +
                '}';
    }
}

