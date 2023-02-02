import Library_Project_main.Book;
import Library_Project_main.Library;
import Library_Project_main.Reader;

class Main {
    public static void main(String[] args) throws Exception {

        Library lb = new Library();
        Reader rd = new Reader("Иванов Сергей", "01.04.1987", "02.02.2022");
        Book bkOne = new Book("Война и Мир", "01.04.1987");
        Book bkTwo = new Book("Петр 1", "02.05.1999");
        Book bkThre = new Book("Война и Мир", "01.04.1987");

        lb.addBookToLb(bkOne, 4);
        lb.addBookToLb(bkTwo, 6);


        lb.addReader(rd,bkOne);
        lb.giveBook(rd, bkOne);
        lb.giveBook(rd, bkTwo);








       System.out.println(rd);
       System.out.println(lb);





    }
}
