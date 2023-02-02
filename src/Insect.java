public class Insect extends Animal {

    private int wingCount;
    private boolean likeJesus;


    {

        wingCount = 2;
        likeJesus = true;

    }

    public Insect(String type, String name, int age, double weight, boolean isFlye, boolean isWalk, boolean isSwim, int wingCount, boolean likeJesus) {
        super(type, name, age, weight, isFlye, true, isSwim);
        this.wingCount = wingCount;
        this.likeJesus = likeJesus;
    }

    public Insect(){
        super();

        setWalk(true);

    }
    public void ggggg() {

        System.out.println("ggggg");

    }


    @Override
    public void display() {
        System.out.println("I am Insect");
        super.display();
        System.out.println(wingCount);
        System.out.println(likeJesus);

    }

    public void setWingCount(int wingCount) {
        this.wingCount = wingCount;
    }

    public void setLikeJesus(boolean likeJesus) {
        this.likeJesus = likeJesus;
    }


    public int getWingCount() {
        return wingCount;
    }

    public boolean isLikeJesus() {
        return likeJesus;
    }
}
