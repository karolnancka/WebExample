package pl.coderslab.web.cookies;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/deleteCookie")
public class Cookie1Del extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {

        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie c : cookies) {
                if ("User".equals(c.getName())) {
                    c.setMaxAge(0);
                    response.addCookie(c);
                    response.getWriter().println("Cookie User deleted");
                    return;
                }
            }

        }else {
            response.getWriter().println("No cookies with that name found");
        }
    }
}