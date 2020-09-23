package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AgeCalculatorServlet extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String sAge = request.getParameter("age");
        
        if(sAge == null || sAge.equals("")) {
            request.setAttribute("message", "You must give your current age.");
            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
            return;
        }
        
        try {
            int age = Integer.parseInt(sAge);
            int result = age + 1;
            String sendResult = "Your age next birthday will be " + result;
            request.setAttribute("message",sendResult);
            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
        }
        catch(NumberFormatException e){
           request.setAttribute("message", "You must enter a number");
           getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
           return;
       } 
    }
}
