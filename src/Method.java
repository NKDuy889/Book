import java.util.Scanner;

public class Method {
    private int size = 4;
    private Book[] listBook = new Book[size];


    public void addProgammingBook(Scanner sc) {
        for (int i = 0; i < 2; i++) {
            Book book = new ProgammingBook();
            book.information(sc);
            listBook[i] = book;
            System.out.println(listBook[i]);
        }
    }

    public void addFictionBook(Scanner sc) {
        for (int i = 2; i < size; i++) {
            Book book = new FictionBook();
            book.information(sc);
            listBook[i] = book;
        }
    }


    public void addBook(Scanner sc) {
        addProgammingBook(sc);
        addFictionBook(sc);
    }

    public void showList() {
        for (Book book : listBook) {
            System.out.println(book);
        }
    }

    public int countBook() {
        int count = 0;
        for (Book book : listBook) {
            if (book instanceof ProgammingBook) {
                if (((ProgammingBook) book).getLanguage().equals("Java")) {
                    count++;
                }
            }
        }
        return count;
    }

    public int totalMoney() {
        int totalMoney = 0;
        for (Book book : listBook
        ) {
            totalMoney = totalMoney + book.getPrice();
        }
        return totalMoney;
    }

    public void getPriceBookByName(Scanner sc) {
        String nameBook = sc.next();
        System.out.println("Enter a name book you want find: ");
        for (Book book : listBook) {
            if (nameBook.equals(book.getName())) {
                System.out.println(book.getPrice());
            }
        }
    }

    public void bubleSort() {
        boolean check = true;
        for (int i = 1; i < listBook.length; i++) {
            check = false;
            for (int j = 0; j < listBook.length - 1; j++) {
                if (listBook[j].getPrice() > listBook[j + 1].getPrice()) {
                    Book temp = listBook[j];
                    listBook[j] = listBook[j + 1];
                    listBook[j + 1] = temp;
                    check = true;
                }
            }
            if (check = false) {
                System.out.println("Array sort");
                break;
            }
        }
        showList();
    }

//    public void selectionSort(){
//        for (int i = 0; i < listBook.length - 1; i++) {
//            int a = listBook[i].getPrice();
//            int b = i;
//            for (int j = i + 1; j < listBook.length ; j++) {
//                if (a > listBook[j].getPrice()){
//                    Book temp = listBook[i];
//                    listBook[i] = listBook[j];
//                    listBook[j] = temp;
//                }
//            }
//            if (b != i){
//
//            }
//        }
//    }

    public void binarySearch(Scanner sc) {
        int key = sc.nextInt();
        sc.nextLine();
        bubleSort();
        int low = 0;
        int hight = listBook.length;
        while (low < hight) {
            int mid = (low + hight) / 2;
            if (key < listBook[mid].getPrice()) {
                hight = mid - 1;
            } else if (key == listBook[mid].getPrice()) {
                System.out.println("index of book: " + mid);
                break;
            } else {
                low = mid + 1;
            }
            if (low > hight){
                System.out.println("Not found");
            }
        }
    }
}
