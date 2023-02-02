public class Bird extends Animal {

    private String area;
    private boolean winterFly;

    static int animalCount;



    //-------------------Инициализатор

    {

        area = "Небо";
        winterFly = true;
        animalCount ++;

    }
    //-------------------Конструктор
    public Bird() {
        super();

        setFlye(true);

    }

    public Bird(String type, String name, int age, double weight, boolean isFlye, boolean isWalk, boolean isSwim, String area, boolean winterFly) {
        super(type, name, age, weight, true, isWalk, isSwim);
        this.area = area;
        this.winterFly = winterFly;


    }

    //------------------------- Методы

    public void chirick_chirick() {

        System.out.println("Chirik-Chirik");


    }


    @Override
    public String toString() {
        return "Bird{" +
                "area='" + area + '\'' +
                ", winterFly=" + (winterFly ? "Умеет летать"  : "Не умеет летать") +
                " Это животное по счету: " + animalCount +
                '}';
    }

    @Override
    public void display() {
        System.out.println("I am Bird");
        super.display();
        System.out.println(area);
        System.out.println(winterFly);

    }


    public void setArea(String area) {
        this.area = area;
    }

    public void setWinterFly(boolean winterFly) {
        this.winterFly = winterFly;
    }


    public String getArea() {
        return area;
    }

    public boolean isWinterFly() {
        return winterFly;
    }
}
