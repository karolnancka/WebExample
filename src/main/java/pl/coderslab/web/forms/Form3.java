package pl.coderslab.web.forms;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/getForm3")
public class Form3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String parameter = request.getParameter("page");
        int parameterInt = Integer.parseInt(parameter);
        int count = 1;
        for (int i = 1; i <= parameterInt; i++) {
            if (parameterInt % i == 0) {
                response.getWriter().println("divider nr: " + count + " " + i);
                count++;

            }


        }
    }
}
