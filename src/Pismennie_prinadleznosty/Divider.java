package Pismennie_prinadleznosty;

public class Divider extends WritingMaterials {

    public String dividerType;
    public boolean metal;

    public Divider() {
        super();
        setDraw(true);
    }

    public void draw_circle() {


        System.out.println("Нарисован круг");


    }


    public String getDividerType() {
        return dividerType;
    }

    public void setDividerType(String dividerType) {
        this.dividerType = dividerType;
    }

    public boolean isMetal() {
        return metal;
    }

    public void setMetal(boolean metal) {
        this.metal = metal;
    }
}
