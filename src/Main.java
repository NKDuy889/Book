import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Method method = new Method();
        method.addBook(sc);
        System.out.println("                List book");
        method.showList();
        System.out.println();
        System.out.println("total money: " + method.totalMoney());
        System.out.println("Number of book language Java: " + method.countBook());
        System.out.println();
        method.getPriceBookByName(sc);
        System.out.println();
        method.bubleSort();
        method.binarySearch(sc);
    }
}
