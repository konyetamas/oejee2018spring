package main.java.hu.mir.books.ejbservice.domain;

/**
 * Created by mirso on 2018. 03. 04..
 */
public class Company extends Addressable {
    private String taxId;

    public Company(int id, String name, String countryCode, int zip, String state, String city, String address, String taxId) {
        super(id, name, countryCode, zip, state, city, address);
        this.taxId = taxId;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }
}
