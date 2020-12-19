import java.util.Scanner;

public class FictionBook extends Book{
    private String category;

    public FictionBook(){}

    public FictionBook(int bookCode, String name, int price, String author, String category) {
        super(bookCode, name, price, author);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void information(Scanner sc){
        super.information(sc);
        System.out.println("Enter category: ");
        setCategory(sc.next());
    }

    @Override
    public String toString() {
        return super.toString() +
                " category= " + category;
    }
}
