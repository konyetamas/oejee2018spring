package main.java.hu.mir.books.ejbservice.facade;

import main.java.hu.mir.books.ejbservice.domain.AuthorStub;
import main.java.hu.mir.books.ejbservice.exception.FacadeException;

import javax.ejb.Stateless;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by mirso on 2018. 03. 04..
 */
@Stateless(mappedName = "ejb/authorFacade")
public class AuthorFacadeImpl implements AuthorFacade {
    @Override
    public AuthorStub getAuthor(int id) throws FacadeException {
        return new AuthorStub(1,"Lev Tolsztoj", new GregorianCalendar(1828,9,9).getTime(),"ru_RU");
    }
}
