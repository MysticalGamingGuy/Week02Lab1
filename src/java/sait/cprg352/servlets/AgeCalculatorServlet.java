package sait.cprg352.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AgeCalculatorServlet extends HttpServlet 
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String name = request.getParameter("birth");
        if(name.isEmpty()){
            request.setAttribute("message","Please Enter An Age.");
        }
        else if (name.matches("^\\d+$")){
            request.setAttribute("message","Your Age Next Birthday will be "+(Integer.parseInt(name)+1));
        }
        else{
            request.setAttribute("message","Not A Valid Age");
            request.setAttribute("birth", name);
        }
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
    }
}
