package pl.coderslab.web.forms;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/post2")
public class Form2 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Hello World");
        String message = request.getParameter("message");
        String acknowledgement = request.getParameter("acknowledgement");
        response.getWriter().println(String.format("Hello, %s %s", message, acknowledgement));
    }
}
