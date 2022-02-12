package pl.coderslab.web.sessions;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;


@WebServlet(value = "/session1Set")
public class Session1Set extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {

        HttpSession session = request.getSession();
        session.setAttribute("counter",0);
        response.getWriter().println("attribute counter=0 has been set in session");

    }

}
