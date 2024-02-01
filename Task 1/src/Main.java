import java.util.Scanner;

public class Main {
    static String booksInfo = "";


    public static void main(String[] args) {
        while (true) {
            String name = inputBookName();
            int pageCount = inputPageCount();
            double bookPrise = inputBookPrise();

//            addBook(name);
//            addBook(name, pageCount);
            addBook(name, pageCount, bookPrise);
            //todo использовать новый метод тут

            printInfo();
        }
    }

    public static double inputBookPrise(){
        System.out.println("Введите цену книги:");
        return new Scanner(System.in).nextDouble();
    }

    public static String inputBookName() {
        System.out.println("Введите название книги:");
        return new Scanner(System.in).nextLine();
    }

    public static int inputPageCount() {
        System.out.println("Введите кол-во страниц:");
        return new Scanner(System.in).nextInt();
    }

    public static void addBook(String bookName) {
        addBook(bookName, 0);
    }

    public static void addBook(String bookName, int pageCount) {
       addBook(bookName, pageCount, 0);
    }

    public static void addBook(String bookName, int pageCount, double bookPrise) {
        booksInfo = booksInfo + bookName + " - " + (pageCount > 0 ? pageCount : " N/A") + " стр." +
                "; " + (bookPrise > 0 ? bookPrise + " Rub" : " N/Danniyh") + "\n";
    }

    public static void printInfo() {
        System.out.println(booksInfo);
    }

}
