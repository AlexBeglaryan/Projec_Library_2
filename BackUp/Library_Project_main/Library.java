package Library_Project_main;

import java.util.HashMap;

public class Library {

    private HashMap<Book, Integer> books;

    {
        books = new HashMap<>();

    }

    public Library() {
    }

    public Library(HashMap<Book, Integer> books) {
        this.books = books;
    }

    public HashMap<Book, Integer> getBooks() {
        return books;
    }


    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                '}';
    }


    //--------------------------------Методы----------------------------------
    public void giveBook(Reader reader, Book book) throws Exception {
        if (books.get(book) == 0) {
            throw new Exception("Такой книги больше нет");
        }
        reader.addBook(book);
        books.replace(book, books.get(book) - 1);
    }

    public void returnBook(Reader reader, Book book) {

        reader.deleteBook(book);
        books.replace(book, books.get(book) + 1);
    }


    public void addBookToLb(Book book, int count) {
        if (books.containsKey(book)) {
            this.books.replace(book, books.get(book) + count);
        } else
            this.books.put(book, count);
    }
}
