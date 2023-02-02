public abstract class Building {

    private String name;
    private String address;
    private String buildYear;
    private String archName;
    private boolean isMonument;


    public Building() {


    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBuildYear() {
        return buildYear;
    }

    public void setBuildYear(String buildYear) {
        this.buildYear = buildYear;
    }

    public String getArchName() {
        return archName;
    }

    public void setArchName(String archName) {
        this.archName = archName;
    }

    public boolean isMonument() {
        return isMonument;
    }

    public void setMonument(boolean monument) {
        isMonument = monument;
    }



    public abstract void display();


    @Override
    public String toString() {
        return "Building{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", buildYear='" + buildYear + '\'' +
                ", archName='" + archName + '\'' +
                ", isMonument=" + isMonument +
                '}';
    }
}
