package main.java.hu.mir.books.ejbservice.domain;

/**
 * Created by mirso on 2018. 03. 04..
 */
public class StockStub extends HasID {
    private SupplierStub supplier;
    private BookStub book;
    private double purchasePrice;
    private double sellingPrice;
    private int purchasedQuantity;
    private int salableQuantity;

    public StockStub(int id, SupplierStub supplier, BookStub book, double purchasePrice, double sellingPrice, int purchasedQuantity, int salableQuantity) {
        super(id);
        this.supplier = supplier;
        this.book = book;
        this.purchasePrice = purchasePrice;
        this.sellingPrice = sellingPrice;
        this.purchasedQuantity = purchasedQuantity;
        this.salableQuantity = salableQuantity;
    }

    public SupplierStub getSupplier() {
        return supplier;
    }

    public void setSupplier(SupplierStub supplier) {
        this.supplier = supplier;
    }

    public BookStub getBook() {
        return book;
    }

    public void setBook(BookStub book) {
        this.book = book;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public int getPurchasedQuantity() {
        return purchasedQuantity;
    }

    public void setPurchasedQuantity(int purchasedQuantity) {
        this.purchasedQuantity = purchasedQuantity;
    }

    public int getSalableQuantity() {
        return salableQuantity;
    }

    public void setSalableQuantity(int salableQuantity) {
        this.salableQuantity = salableQuantity;
    }
}
