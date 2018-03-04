package main.java.hu.mir.books.webplayer.servlet;

import main.java.hu.mir.books.ejbservice.domain.AuthorStub;
import main.java.hu.mir.books.ejbservice.exception.FacadeException;
import main.java.hu.mir.books.ejbservice.facade.AuthorFacade;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by mirso on 2018. 03. 04..
 */
@WebServlet("/AuthorPing")
public class AuthorPingServlet extends HttpServlet {
    private static final long serialVersionUID = 1;
    @EJB
    private AuthorFacade author;

    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException {
        httpServletResponse.setCharacterEncoding("UTF-8");
        final PrintWriter out = httpServletResponse.getWriter();
        try {
            final AuthorStub author = this.author.getAuthor(123);
            out.println(author.toString());
        } catch (final FacadeException e) {
            out.println(e.getLocalizedMessage());
        }
        out.close();
    }
}
