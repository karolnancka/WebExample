package pl.coderslab.web.mvc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Locale;

@WebServlet("/mvc11")
public class Mvc11 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String roleParamStr = req.getParameter("role");
        if (roleParamStr != null) {
            final String userRole = "ROLE_" + roleParamStr.toUpperCase();
            req.setAttribute("userRole", userRole);
        }

        getServletContext()
                .getRequestDispatcher("/jsp1.jsp")
                .forward(req, resp);
    }
}
