public class House extends Building implements LivingHouse{

    private int citizenCount;
    private boolean isInMortgage;

    {
        citizenCount = 6;
    }


    public House() {
        super();
        super.setMonument(false);
    }

    @Override
    public void display() {

    }


    public void cleaning(){

        System.out.println("Идет уборка в доме");

    }

    public void pay() {

        System.out.println("Счета оплачены");

    }

    public int getCitizenCount() {
        return citizenCount;
    }

    public void setCitizenCount(int citizenCount) {
        this.citizenCount = citizenCount;
    }

    public boolean isInMortgage() {
        return isInMortgage;
    }

    public void setInMortgage(boolean inMortgage) {
        isInMortgage = inMortgage;
    }


    @Override
    public String toString() {
        return "House{" +
                "citizenCount=" + citizenCount +
                ", isInMortgage=" + isInMortgage +
                '}';
    }

    @Override
    public void garage() {

        System.out.println("В гараж загнан автомобиль");

    }

    @Override
    public void backGarden() {

        System.out.println("В саду посажены цветы");

    }
}
