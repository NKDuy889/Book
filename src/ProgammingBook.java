import java.util.Scanner;

public class ProgammingBook extends Book{
    private String language;
    private String framework;


    public ProgammingBook(){}

    public ProgammingBook(int bookCode, String name, int price, String author, String language, String framework) {
        super(bookCode, name, price, author);
        this.language = language;
        this.framework = framework;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    public void information(Scanner sc){
        super.information(sc);
        System.out.println("Enter language: ");
        setLanguage(sc.next());
        System.out.println("Enter framework: ");
        setFramework(sc.next());
    }

    @Override
    public String toString() {
        return super.toString() +
                " language= " + language  +
                ", framework= " + framework;
    }
}
