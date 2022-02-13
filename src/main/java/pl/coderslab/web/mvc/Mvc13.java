package pl.coderslab.web.mvc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/mvc13")
public class Mvc13 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        final String title = req.getParameter("title");
        final String author = req.getParameter("author");
        final Integer isbn = Integer.parseInt(req.getParameter("isbn"));

        try {
            Book book = new Book(title, author, isbn);
            req.setAttribute("book", book);

        } catch (NumberFormatException e) {

        }

        getServletContext()
                .getRequestDispatcher("/jsp3.jsp")
                .forward(req, resp);
    }
}
