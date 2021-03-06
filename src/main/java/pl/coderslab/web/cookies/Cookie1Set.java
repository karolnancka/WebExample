package pl.coderslab.web.cookies;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/setCookie")
public class Cookie1Set extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {

        Cookie cookie = new Cookie("User", "CodersLab");
        cookie.setMaxAge(24*3600);
        cookie.setPath("/");
        response.addCookie(cookie);
        response.getWriter().println("Cookie has ben set");

    }
}