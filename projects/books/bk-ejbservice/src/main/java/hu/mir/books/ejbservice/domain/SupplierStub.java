package main.java.hu.mir.books.ejbservice.domain;

/**
 * Created by mirso on 2018. 03. 04..
 */
public class SupplierStub extends Company {

    public SupplierStub(int id, String name, String countryCode, int zip, String state, String city, String address, String taxId) {
        super(id, name, countryCode, zip, state, city, address, taxId);
    }
}
