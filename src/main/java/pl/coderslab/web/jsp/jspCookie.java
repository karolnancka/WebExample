package pl.coderslab.web.jsp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/jspCookie")
public class jspCookie extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {

        Cookie cookie = new Cookie("foo", "bar");
        cookie.setMaxAge(3600);
        cookie.setPath("/");
        response.addCookie(cookie);
        //response.getWriter().println("Cookie " + cookie.getName() + " has ben set: " + cookie.getValue());

    }
}