package pl.coderslab.web.cookies;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/cookie3")
public class Cookie3 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {

        String key = request.getParameter("key");
        String value = request.getParameter("value");
        String timeString = request.getParameter("time");

        int time = Integer.parseInt(timeString) * 3600;

        if (key == null || value == null || time == 0) {
            response.getWriter().println("no data");
            return;
        }

        Cookie cookie = new Cookie(key, value);
        cookie.setPath("/");
        cookie.setMaxAge(time);
        response.addCookie(cookie);
        response.getWriter().println("Cookie" + key + " has ben set");

    }
}
