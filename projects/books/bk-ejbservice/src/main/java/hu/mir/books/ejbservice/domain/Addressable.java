package main.java.hu.mir.books.ejbservice.domain;

/**
 * Created by mirso on 2018. 03. 04..
 */
public class Addressable extends HasID {
    private String name;
    private String countryCode;
    private int zip;
    private String state;
    private String city;
    private String address;

    public Addressable(int id, String name, String countryCode, int zip, String state, String city, String address) {
        super(id);
        this.name = name;
        this.countryCode = countryCode;
        this.zip = zip;
        this.state = state;
        this.city = city;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
