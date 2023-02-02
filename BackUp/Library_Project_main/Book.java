package Library_Project_main;

import java.util.Objects;

public class Book {

    private String name;
    private String dayOfManufature;


    public Book() {

    }

    public Book(String name, String dayOfManufature) {
        this.name = name;
        this.dayOfManufature = dayOfManufature;
    }


    public String getName() {
        return name;
    }

    public String getDayOfManufature() {
        return dayOfManufature;
    }


    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", dayOfManufature='" + dayOfManufature + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name) && Objects.equals(dayOfManufature, book.dayOfManufature);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dayOfManufature);
    }
}
