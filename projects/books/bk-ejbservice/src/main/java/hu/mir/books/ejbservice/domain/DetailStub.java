package main.java.hu.mir.books.ejbservice.domain;

/**
 * Created by mirso on 2018. 03. 04..
 */
public class DetailStub extends HasID {
    private StockStub stock;
    private int quantity;

    public DetailStub(int id, StockStub stock, int quantity) {
        super(id);
        this.stock = stock;
        this.quantity = quantity;
    }

    public StockStub getStock() {
        return stock;
    }

    public void setStock(StockStub stock) {
        this.stock = stock;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
