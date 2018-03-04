package main.java.hu.mir.books.ejbservice.domain;

import java.util.Date;
import java.util.List;

/**
 * Created by mirso on 2018. 03. 04..
 */
public class BookStub {
    private String isbn;
    private String title;
    private String subtitle;
    private Date published;
    private PublisherStub publisher;
    private BookTypeStub type;
    private String languageCode;
    private List<AuthorStub> authors;

    public BookStub(String isbn, String title, String subtitle, Date published, PublisherStub publisher, BookTypeStub type, String languageCode, List<AuthorStub> authors) {
        this.isbn = isbn;
        this.title = title;
        this.subtitle = subtitle;
        this.published = published;
        this.publisher = publisher;
        this.type = type;
        this.languageCode = languageCode;
        this.authors = authors;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public Date getPublished() {
        return published;
    }

    public void setPublished(Date published) {
        this.published = published;
    }

    public PublisherStub getPublisher() {
        return publisher;
    }

    public void setPublisher(PublisherStub publisher) {
        this.publisher = publisher;
    }

    public BookTypeStub getType() {
        return type;
    }

    public void setType(BookTypeStub type) {
        this.type = type;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public List<AuthorStub> getAuthors() {
        return authors;
    }

    public void setAuthors(List<AuthorStub> authors) {
        this.authors = authors;
    }
}
