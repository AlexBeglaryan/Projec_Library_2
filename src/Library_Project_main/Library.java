package Library_Project_main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Objects;

public class Library {

    private HashMap<Book, Integer> books;
    private HashMap<Reader, Book> readers;


    {
        books = new HashMap<>();
        readers = new HashMap<>();

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
                ", readers=" + readers +
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

    public void addReader(Reader reader, Book book) throws Exception {
        if (readers.containsKey(reader)) {
            ArrayList<Book> ar = new ArrayList<>(readers.values());
            for (Book iVar : ar) {
                if (iVar.equals(book)) {
                    throw new Exception("Такая книга уже есть у читателя");
                }
            }
        }else
            this.readers.put(reader, book);
    }

    public void removeReader(Reader reader) throws Exception {
        if (readers.containsKey(reader)) {
            readers.remove(reader);
        }else
            System.out.println("Такого клиента не существует");
    }







    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Objects.equals(books, library.books) && Objects.equals(readers, library.readers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(books, readers);
    }
}



