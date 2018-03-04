package main.java.hu.mir.books.ejbservice.domain;

/**
 * Created by mirso on 2018. 03. 04..
 */
public enum BookTypeStub {
    SCIFI("Sci-Fi"),
    LITERATURE("Literature"),
    HISTORICAL("Historical"),
    PHILOSOPHY("Philosophy");

    private final String label;

    private BookTypeStub(String label) {
        this.label = label;
    }

    public String getLabel() {
        return this.label;
    }

    public String getName() {
        return this.name();
    }


}
