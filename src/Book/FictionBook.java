package Book;

import java.util.Scanner;

public class FictionBook extends Book implements Discount {

    //Danh sách thuộc tính
    private String category;
    private double promotionalPrice;

    //Danh sách phương thức
    public FictionBook() {
    }

    public FictionBook(String category, double promotionalPrice) {
        this.category = category;
        this.promotionalPrice = promotionalPrice;
    }

    public FictionBook(int bookCode, String name, int price, String author, String category, double promotionalPrice) {
        super(bookCode, name, price, author);
        this.category = category;
        this.promotionalPrice = promotionalPrice;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPromotionalPrice() {
        return promotionalPrice;
    }

    public void setPromotionalPrice(double promotionalPrice) {
        this.promotionalPrice = promotionalPrice;
    }

    public void addNewFictionBook() {
        super.addNewBook();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thể loại: ");
        category = scanner.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Thể loại: " + getCategory();
    }

    public double setDiscount(int persent) {
        promotionalPrice = getPrice() * (1 - persent) / 100;
        return promotionalPrice;
    }

}
