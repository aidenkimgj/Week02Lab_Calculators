
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ArithmeticCalculatorServlet extends HttpServlet {
    private String sendResult = "---";
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      request.setAttribute("message", sendResult);
      getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);           
    }
        
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String fNumber = request.getParameter("first");
        String sNumber = request.getParameter("second");
       
        int firstNumber = 0;
        int secondNumber = 0;
        int result = 0;
              
        request.setAttribute("fnumber", fNumber);
        request.setAttribute("snumber", sNumber);
       
        try {
            firstNumber = Integer.parseInt(fNumber);
            secondNumber = Integer.parseInt(sNumber);     
        }
        catch(NumberFormatException e) {
            request.setAttribute("message", "invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
            return;
        }
       
        if(request.getParameter("addition") != null) {            
            result = firstNumber + secondNumber;
            sendResult = Integer.toString(result);
            request.setAttribute("message", sendResult);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);        
       } else if(request.getParameter("subtraction") != null) {
            result = firstNumber - secondNumber;
            sendResult = Integer.toString(result);
            request.setAttribute("message", sendResult);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
       } else if(request.getParameter("multiplication") != null) {
            result = firstNumber * secondNumber;
            sendResult = Integer.toString(result);
            request.setAttribute("message", sendResult);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
       } else {
            result = firstNumber % secondNumber;
            sendResult = Integer.toString(result);
            request.setAttribute("message", sendResult);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
       } 
    }   
}
