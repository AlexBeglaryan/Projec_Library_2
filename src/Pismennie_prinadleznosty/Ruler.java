package Pismennie_prinadleznosty;

public class Ruler extends WritingMaterials{

    public double length;
    public boolean wood;

    public Ruler() {
        super();
        setDraw(false);
    }

    public void measure(){


        System.out.println("Сейчас померяем длину");


    }

    @Override
    public double getLength() {
        return length;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    public boolean isWood() {
        return wood;
    }

    public void setWood(boolean wood) {
        this.wood = wood;
    }
}
