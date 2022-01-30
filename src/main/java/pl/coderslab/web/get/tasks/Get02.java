package pl.coderslab.web.get.tasks;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

@WebServlet("/get2")
public class Get02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String, String[]> parameters = req.getParameterMap();
        for (Map.Entry<String, String[]> e : parameters.entrySet()){
            resp.getWriter().println(String.format("%s : %s", e.getKey(), Arrays.toString(e.getValue())));
        }
        if(parameters.size() < 1) {
            resp.getWriter().println("No parameters provided");
        }

    }
}
