package Pismennie_prinadleznosty;

public class Pen extends WritingMaterials {

    public int countColor;
    public boolean auto;

    public Pen() {
       super();

       setDraw(true);

    }

    public void writeMyName() {

        System.out.println("Моё имя: Алекксандр");

    }

    public int getCountColor() {
        return countColor;
    }

    public void setCountColor(int countColor) {
        this.countColor = countColor;
    }

    public boolean isAuto() {
        return auto;
    }

    public void setAuto(boolean auto) {
        this.auto = auto;
    }


    @Override
    public void display() {
        System.out.println("This is Pen");
        super.display();
        System.out.println("Сколько цветов " + countColor + " ручка автоматическая? " + auto);
    }
}
