package com.db.actions;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class deleteEmployeeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        int employeeId = Integer.parseInt(request.getParameter("employeeId"));

        if(employeeId<=0)
        {
            request.setAttribute("error","Invalid Employee Id");
            request.getRequestDispatcher("error.jsp").forward(request, response);
            return;
        }

        boolean success = EmployeeDatabase.deleteEmployee(employeeId);
        if(!success)
        {
            request.setAttribute("error","Employee Id does not exist");
            request.getRequestDispatcher("error.jsp").forward(request, response);
            return;
        }
        else {
            request.setAttribute("message","Employee deleted successfully");
            request.getRequestDispatcher("index.jsp").forward(request, response);
            return;
        }

    }
}
