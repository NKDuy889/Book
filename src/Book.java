import java.util.Scanner;

public class Book {
    private int bookCode;
    private String name;
    private int price;
    private String author;

    public Book() {}

    public Book(int bookCode, String name, int price, String author) {
        this.bookCode = bookCode;
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public int getBookCode() {
        return bookCode;
    }

    public void setBookCode(int bookCode) {
        this.bookCode = bookCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void information(Scanner sc){
        System.out.println("Enter book code: ");
        setBookCode(sc.nextInt()); sc.nextLine();
        System.out.println("Enter name of book: ");
        setName(sc.next());
        System.out.println("Enter a price: ");
        setPrice(sc.nextInt()); sc.nextLine();
        System.out.println("Enter author: ");
        setAuthor(sc.next());
    }

    @Override
    public String toString() {
        return "Book:  " +
                "bookCode= " + bookCode +
                ", name= " + name +
                ", price= " + price +
                ", author= " + author + ", ";
    }
}
