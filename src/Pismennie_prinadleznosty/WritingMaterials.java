package Pismennie_prinadleznosty;

public class WritingMaterials {

    private String name;
    private String color;
    private double length;
    private double price;
    private boolean draw;

    public WritingMaterials(String name, String color, double length, double price, boolean draw) {
        this.name = name;
        this.color = color;
        this.length = length;
        this.price = price;
        this.draw = draw;
    }

    public WritingMaterials() {

    }

    public WritingMaterials(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public WritingMaterials(String name, double price) {
        this.name = name;
        this.price = price;
        this.color = "No Color";
    }


    public WritingMaterials(double length, double price, boolean draw) {
        this.length = length;
        this.price = price;
        this.draw = draw;
        this.color = "No Color";
        this.name = "NoName";
    }

    public void display() {

        System.out.println("Название: " + name + " Цвет: " + color + " Длина: " + length + " Цена: " + price);
        System.out.print(draw ? " Умеет рисовать: Да" : " Умеет рисовать: Нет");


    }


    public void replace_rod(String newColor) {

        this.color = newColor;
        System.out.println("Новый цвет: " + color);
    }

    public void priceUp(int newPrice) {

        this.price += newPrice;

        System.out.println("Новая цена: " + price);

    }

    public void priceDown(int newPrice) {

        this.price -= newPrice;
        System.out.println("Новая цена: " + price);

    }

    public void draw() {

        if (draw) {

            System.out.println(name + " провел линию.Её цвет " + color);

        } else System.out.println(name + " не может ничего нарисовать");


    }

    public void draw(int n) {

        if (draw) {

            System.out.println(name + " провел линий: "+ n +" Её цвет " + color);

        } else System.out.println(name + " не может ничего нарисовать");




    }

    public void draw(String color) {

        if (draw) {

            System.out.println(name + " провел линий: " + 1 + " Её цвет " + color);

        } else System.out.println(name + " не может ничего нарисовать");
    }

    public void draw(String color, int n) {

        if (draw) {

            System.out.println(name + " провел линий: " + n + " Её цвет " + color);

        } else System.out.println(name + " не может ничего нарисовать");
    }



    //--------------------------------------------------------------- get


    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getLength() {
        return length;
    }

    public double getPrice() {
        return price;
    }

    public boolean isDraw() {
        return draw;
    }
    //--------------------------------------------------------------- set


    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDraw(boolean draw) {
        this.draw = draw;
    }
}
