import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerBook managerBook = new ManagerBook();

        //Nhập thông tin Programming Book
        managerBook.listProgrammingBook();

        //Nhập thông tin Fiction Book
        managerBook.listFictionBook();

        int number;
        do {
            System.out.println("1. Thông tin Programming Book");
            System.out.println("2. Thông tin Fiction Book");
            System.out.println("3. Tính tổng tiền Programming Book");
            System.out.println("4. Tính tổng tiền Fiction Book");
            System.out.println("5. Số sách có ngôn ngữ Java");
            System.out.println("6. Tính tổng tiền sách");
            System.out.println("7. Tổng tiền khi đã trừ khuyến mãi");
            System.out.println("8. Tìm kiếm theo mã sách");
            System.out.println("0. Exit");
            System.out.print("Choice Number: ");
            number = scanner.nextInt();
            switch (number) {
                case 1:
                    managerBook.infomationProgrammingBook();
                    break;
                case 2:
                    managerBook.informationFictionBook();
                    break;
                case 3:
                    System.out.println("Tổng tiền Programming Book: " + managerBook.getTotalOfProgrammingBook());
                    break;
                case 4:
                    System.out.println("Tông tiền Fiction Book: " + managerBook.getTotalOfFictionBook());
                    break;
                case 5:
                    managerBook.checkLanguageJava();
                    break;
                case 6:
                    System.out.println("Tông tiền toàn bộ sách: " + managerBook.getTotalBook());
                    break;
                case 7:
                    System.out.println("Tổng tiền sau khi khuyễn mãi: " + managerBook.getTotalWhenDiscount());
                    break;
                case 8:
                    managerBook.checkBookCode();
                    break;
            }
        } while (number != 0);
        System.exit(0);

    }
}