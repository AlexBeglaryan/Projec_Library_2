public class Library extends Building {

    private int clientCount;
    private boolean isInternet;


    {
        clientCount = 256;
    }


    public Library() {
        super();
        super.setMonument(true);

    }


    public void giveBook() {

        System.out.println("Выдана книга");

    }

    public void giveSession() {

        System.out.println("Предоставлен пк с доступом в интернет");

    }

    @Override
    public void display() {

        System.out.println("Это библиотека");

    }

    public int getClientCount() {
        return clientCount;
    }

    public void setClientCount(int clientCount) {
        this.clientCount = clientCount;
    }

    public boolean isInternet() {
        return isInternet;
    }

    public void setInternet(boolean internet) {
        isInternet = internet;
    }

//    @Override
//    public void call() {
//
//        Lift.super.call();
//    }

    @Override
    public String toString() {
        return "Library{" +
                "clientCount=" + clientCount +
                ", isInternet=" + isInternet +
                '}';
    }


//    @Override
//    public void cafe() {
//
//        System.out.println("В кафе бизнес ланч с 12:00 до 15:00");
//
//    }

//    @Override
//    public void reception() {
//
//        System.out.println("Менеджер оказывает консультацию");
//
//    }
}
