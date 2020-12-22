import Book.Book;
import Book.FictionBook;
import Book.ProgrammingBook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ManagerBook {
    Scanner scanner = new Scanner(System.in);

    //Danh sách thuộc tính
    int numberProgrammingBook;
    int numberFictionBook;
    double totalOfProgrammingBook = 0;
    double totalOfFictionBook = 0;

    //Tạo List
    ArrayList<ProgrammingBook> arrProgrammingBooks = new ArrayList<>();
    ArrayList<FictionBook> arrFictionBooks = new ArrayList<>();

    //Danh sách phương thức
    public ManagerBook() {
    }

    public void infomationProgrammingBook() {
        System.out.println("Programming Book");
        for (int i = 0; i < arrProgrammingBooks.size(); i++) {
            System.out.println(arrProgrammingBooks.get(i));
            System.out.print("\n");
        }
    }

    public void informationFictionBook() {
        System.out.println("Fiction Book");
        for (int i = 0; i < arrFictionBooks.size(); i++) {
            System.out.println(arrFictionBooks.get(i));
            System.out.print("\n");
        }
    }

    public void listProgrammingBook() {
        ProgrammingBook programmingBook = new ProgrammingBook();
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
        System.out.println("Nhập số lượng sách FictionBook: ");
        numberFictionBook = scanner.nextInt();
        for (int i = 0; i < numberFictionBook; i++) {
            fictionBook.addNewFictionBook();
            arrFictionBooks.add(fictionBook);
            System.out.print("\n");
        }
    }

    public double getTotalOfProgrammingBook() {
        for (int i = 0; i < arrProgrammingBooks.size(); i++) {
            totalOfProgrammingBook += arrProgrammingBooks.get(i).getPrice();
        }
        return totalOfProgrammingBook;
    }

    public double getTotalOfFictionBook() {
        for (int i = 0; i < arrFictionBooks.size(); i++) {
            totalOfFictionBook += arrFictionBooks.get(i).getPrice();
        }
        return totalOfFictionBook;
    }

    public double getTotalBook() {
        return getTotalOfProgrammingBook() + getTotalOfFictionBook();
    }

    public double getTotalWhenDiscount() {
        FictionBook fictionBook = new FictionBook();
        System.out.print("Nhập phần trăm khuyến mãi: ");
        int persent = scanner.nextInt();
        double discount = getTotalOfFictionBook() - fictionBook.setDiscount(persent);
        return getTotalOfProgrammingBook() + discount;
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

    public void checkBookCode() {
        ArrayList<Book> arrbooks = new ArrayList<>();
        arrbooks.addAll(arrProgrammingBooks);
        arrbooks.addAll(arrFictionBooks);
        System.out.print("Nhập mã sách cần tìm: ");
        int index = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < arrbooks.size(); i++) {
            if (index == arrbooks.get(i).getBookCode()) {
                System.out.println("Sách cần tìm");
                System.out.println(arrbooks.get(i));
                count++;
            }
        }
        if (count == 0) {
            System.err.println("Không tìm thấy");
        }
    }

}

