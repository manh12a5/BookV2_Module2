import Book.Book;
import Book.FictionBook;
import Book.ProgrammingBook;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerBook {

    //Danh sách thuộc tính
    int numberProgrammingBook;
    int numberFictionBook;

    //Tạo List
    ArrayList<ProgrammingBook> arrProgrammingBooks = new ArrayList<>();
    ArrayList<FictionBook> arrFictionBooks = new ArrayList<>();

    //Danh sách phương thức
    public ManagerBook() {
    }

    public void listProgrammingBook() {
        ProgrammingBook programmingBook = new ProgrammingBook();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng sách ProgrammingBook: ");
        numberProgrammingBook = scanner.nextInt();
        for (int i = 0; i < numberProgrammingBook; i++) {
            programmingBook.addNewProgrammingBook();
            arrProgrammingBooks.add(programmingBook);
            System.out.print("\n");
        }
    }

    public void listFictionBook() {
        FictionBook fictionBook = new FictionBook();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng sách FictionBook: ");
        numberFictionBook = scanner.nextInt();
        for (int i = 0; i < numberFictionBook; i++) {
            fictionBook.addNewFictionBook();
            arrFictionBooks.add(fictionBook);
            System.out.print("\n");
        }
    }

    public double getDiscountFictionBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số % được giảm giá: ");
        int persent = scanner.nextInt();
        double totalOfFictionBook = 0;
        FictionBook fictionBook = new FictionBook();
        for (int i = 0; i < arrFictionBooks.size(); i++) {
            totalOfFictionBook += arrFictionBooks.get(i).getPrice() - fictionBook.setDiscount(persent);
        }
        return totalOfFictionBook;
    }

    public void getTotalBook() {
        double totalOfBook = 0;
        ArrayList<Book> arrbooks = new ArrayList<>();
        arrbooks.addAll(arrProgrammingBooks);
        arrbooks.addAll(arrFictionBooks);
        for (int i = 0; i < arrbooks.size(); i++) {
            totalOfBook += arrbooks.get(i).getPrice() - getDiscountFictionBook();
        }
        System.out.println("Tông tiền là: " + totalOfBook);
    }

    public void checkLanguageJava() {
        int count = 0;
        for (int i = 0; i < arrProgrammingBooks.size(); i++) {
            if (arrProgrammingBooks.get(i).getLanguage().contains("Java")
                    || arrProgrammingBooks.get(i).getLanguage().contains("java")) {
                count++;
            }
        }
        System.out.println("Số lương sách ProgrammingBook có ngôn ngữ Java là: " + count);
    }

}
