package pl.coderslab.web.sessions;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(value = "/session1Get")
public class Session1Get extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {

        HttpSession session = request.getSession();
        Integer counter = (Integer) session.getAttribute("counter");

        if (counter != null) {
            session.setAttribute("counter", counter + 1);
            response.getWriter().println(session.getAttribute("counter"));
            return;
        }
        response.getWriter().println("no data");
    }
}