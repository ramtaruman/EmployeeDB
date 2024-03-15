package com.db.actions;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class raiseSalaryServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

        try
        {

            int id = Integer.parseInt(request.getParameter("id"));
            long raise = Long.parseLong(request.getParameter("raise"));

            if (id == 0 || raise == 0) {
                request.setAttribute("message", "All fields are mandatory");
                request.getRequestDispatcher("error.jsp").forward(request, response);
                return;
            }
            else
            {
                EmployeeDatabase.raiseSalary(id, raise);
                request.setAttribute("message", "Salary raised successfully");
                request.getRequestDispatcher("index.jsp").forward(request, response);

            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
            request.setAttribute("message", "Salary raise not successful, check log");
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }
}
