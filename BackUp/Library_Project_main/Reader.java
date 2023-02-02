package Library_Project_main;

import java.util.ArrayList;

public class Reader {

    private String name;
    private String dayOfBirth;
    private String registrationDate;
    private ArrayList<Book> books;


    public Reader() {

        this.books = new ArrayList<>();
    }


    public Reader(String name, String dayOfBirth, String registrationDate, ArrayList<Book> books) {
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.registrationDate = registrationDate;
        this.books = books;
    }

    public Reader(String name, String dayOfBirth, String registrationDate) {
        this.name = name;
        this.dayOfBirth = dayOfBirth;
        this.registrationDate = registrationDate;
        this.books = new ArrayList<>();
    }







    public String getName() {
        return name;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }


    //-------------------- Методы------------------------------------

    public void addBook(Book book) throws Exception {
        if (books.contains(book)) {
            System.out.println("Такая книга уже есть");
        }
        books.add(book);
    }

    public void deleteBook(Book book){
        books.remove(book);
    }

    @Override
    public String toString() {
        return "Reader{" +
                "books=" + books +
                '}';
    }
}
