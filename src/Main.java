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
            System.out.println("1. Tính tổng tiền sách");
            System.out.println("2. Số sách có ngôn ngữ Java");
            System.out.println("3. Tổng tiền khi đã trừ khuyến mãi");
            System.out.println("0. Exit");
            System.out.print("Choice Number: ");
            number = scanner.nextInt();
            switch (number) {
                case 1:
                    System.out.println("Tông tiền: " + managerBook.getTotalBook());
                    break;
                case 2:
                    managerBook.checkLanguageJava();
                    break;
                case 3:
                    System.out.println("Tổng tiền sau khi khuyễn mãi: " + managerBook.getTotalWhenDiscount());
                    break;
            }
        } while (number != 0);
        System.exit(0);

    }
}