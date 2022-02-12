package pl.coderslab.web.forms;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/post5")
public class Form5 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String tempInput = request.getParameter("degrees");
        String conversionType = request.getParameter("conversionType");
        int temp = Integer.parseInt(tempInput);
        if(conversionType.equals("celcToFahr")){

            response.getWriter().println(temp + "C in Fahrenheit equals =  " + ((temp * 9/5) + 32));
        }else{
            response.getWriter().println(temp + "F in Celsius equals =  " + ((temp - 32) * 5/9));
        }
    }
}


