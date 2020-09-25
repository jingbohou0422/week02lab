/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jingbo hou
 */
public class ArithmeticCalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String num1 =request.getParameter("number1");
        String num2 =request.getParameter("number2");
        //double number1 = Double.parseDouble(request.getParameter("number1"));
        //double number2 = Double.parseDouble(request.getParameter("number2"));

        if(num1==null || num1.equals("") ||num2==null || num2.equals("") ){
            String count = "---";
            request.setAttribute("message", count);
        } else if(request.getParameter("plus") != null){
            double number1 = Double.parseDouble(request.getParameter("number1"));
            double number2 = Double.parseDouble(request.getParameter("number2"));
            double count=0;
            count = number1+number2;
            request.setAttribute("message", count);
            
        }else if (request.getParameter("minus") != null) {
            double number1 = Double.parseDouble(request.getParameter("number1"));
            double number2 = Double.parseDouble(request.getParameter("number2"));
            double count=0;
            count = number1-number2;
            request.setAttribute("message", count);
            
        } else if (request.getParameter("multiply") != null) {
            double number1 = Double.parseDouble(request.getParameter("number1"));
            double number2 = Double.parseDouble(request.getParameter("number2"));
            double count=0;
            count = number1*number2;
            request.setAttribute("message", count);
           
        } else if (request.getParameter("modulo") != null) {
            double number1 = Double.parseDouble(request.getParameter("number1"));
            double number2 = Double.parseDouble(request.getParameter("number2"));
            double count=0;
            count = number1%number2;
            request.setAttribute("message", count);
        }

        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }


}
