package pl.coderslab.web.get.tasks;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

@WebServlet("/get3")
public class Get03 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String widthStr = req.getParameter("width");
        String heightStr = req.getParameter("height");

        if (widthStr != null & heightStr != null) {
            try {

                int width = Integer.valueOf(widthStr);
                int height = Integer.valueOf(heightStr);
                for (int i = 1; i <= height; i++) {
                    for (int j = 1; j <= width; j++) {
                        resp.getWriter().print(j * i + "  ");
                    }
                    resp.getWriter().println();
                }


            } catch (NumberFormatException e) {
                resp.getWriter().println("Incorrect request data. Input numbers in parameters: start and end");
                resp.getWriter().println(String.format("start=%s, end=%s", heightStr, widthStr));


            }
        } else {
            int width = 5;
            int height = 10;
            for (int i = 1; i <= height; i++) {
                for (int j = 1; j <= width; j++) {
                    resp.getWriter().print(j * i + " ");
                }
                resp.getWriter().println();
            }
        }
    }
}
