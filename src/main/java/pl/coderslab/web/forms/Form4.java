package pl.coderslab.web.forms;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Scanner;

@WebServlet(value = "/post4")
public class Form4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String parameterA = request.getParameter("A");
        int a = Integer.parseInt(parameterA);
        String parameterB = request.getParameter("B");
        int b = Integer.parseInt(parameterB);
        String parameterC = request.getParameter("C");
        int c = Integer.parseInt(parameterC);


        response.getWriter().println("Quadratic equation with provided factors: " + a + "x^2 + " + b + "x + " + c + " = 0");
        double delta = b * b - 4 * a * c;

        response.getWriter().println("Discriminant value is: " + delta);

        if (delta < 0) {
            response.getWriter().println("Quadratic equation with provided factors has no distinct roots.");
        } else if (delta == 0) {
            response.getWriter().println("Quadratic equation with provided factors have one distinct root: \n");
            double x0 = -(b / (2 * a));
            response.getWriter().println("x0 = " + x0);
        } else {
            response.getWriter().println("Quadratic equation with provided factors has two distinct roots: \n");
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            response.getWriter().println("x1 = " + x1);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            response.getWriter().println("x2 = " + x2);

        }
    }
}


