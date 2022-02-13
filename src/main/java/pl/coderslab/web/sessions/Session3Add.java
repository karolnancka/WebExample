package pl.coderslab.web.sessions;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(value = "/addToSession")
public class Session3Add extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {

        String key = request.getParameter("key");
        String value = request.getParameter("value");

        HttpSession session = request.getSession();
        session.setAttribute(key,value);
        response.getWriter().println(("Attribute " + key + " set, value: " + value));

    }
}
