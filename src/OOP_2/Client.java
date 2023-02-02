package OOP_2;

public class Client extends Person{

    private int clientNumber;

    public Client(String name, String surname, int age, int clientNumber) {
        super(name, surname, age);
        this.clientNumber = clientNumber;
    }

    //-----------------------------------------------------


    public int getClientNumber() {
        return clientNumber;
    }

    //-----------------------------------------------------


    @Override
    public String toString() {
        return "Client{" +
                "clientNumber=" + clientNumber +
                '}';
    }
}
