public final class Fish extends Animal{

    private String squama;
    private boolean upStreamSwim;


    {

        squama = "Золотая";
        upStreamSwim = true;

    }


    public Fish(String type, String name, int age, double weight, boolean isFlye, boolean isWalk, boolean isSwim, String squama, boolean upStreamSwim) {
        super(type, name, age, weight, isFlye, isWalk,  true);
        this.squama = squama;
        this.upStreamSwim = upStreamSwim;
    }

     public Fish(){
        super();
        setSwim(true);

     }



    public void bul_bul(){

        System.out.println("bul_bul");

    }


    @Override
    public void display() {
        System.out.println("I am Fish");
        super.display();
        System.out.println(squama);
        System.out.println(upStreamSwim);

    }


    public void setSquama(String squama) {
        this.squama = squama;
    }

    public void setUpStreamSwim(boolean upStreamSwim) {
        this.upStreamSwim = upStreamSwim;
    }


    public String getSquama() {
        return squama;
    }

    public boolean isUpStreamSwim() {
        return upStreamSwim;
    }
}
