package pl.coderslab.web.sessions;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(value = "/session1Del")
public class Session1Del extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {

        HttpSession session = request.getSession();
        session.removeAttribute("counter");
        response.getWriter().println("Attribute counter removed from session");
    }
}