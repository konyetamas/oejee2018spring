package main.java.hu.mir.books.ejbservice.domain;

import java.util.Date;

/**
 * Contains author's data.
 * Created by mirso on 2018. 03. 04..
 */
public class AuthorStub extends HasID {
    private String name;
    private Date birthDate;
    private String countryCode;

    public AuthorStub(int id, String name, Date birthDate, String countryCode) {
        super(id);
        this.name = name;
        this.birthDate = birthDate;
        this.countryCode = countryCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
}
