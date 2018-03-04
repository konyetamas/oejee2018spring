package main.java.hu.mir.books.ejbservice.facade;

import main.java.hu.mir.books.ejbservice.domain.AuthorStub;
import main.java.hu.mir.books.ejbservice.exception.FacadeException;

import javax.ejb.Local;

/**
 * Created by mirso on 2018. 03. 04..
 */
@Local
public interface AuthorFacade {
    AuthorStub getAuthor(int id) throws FacadeException;
}
