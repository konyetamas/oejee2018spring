package main.java.hu.mir.books.ejbservice.exception;

/**
 * Created by mirso on 2018. 03. 04..
 */
public class FacadeException extends Exception {
    private static final long serialVersionUID = 1L;

    public FacadeException(String message) {
        super(message);
    }

    public FacadeException(String message, Throwable cause) {
        super(message, cause);
    }

}
