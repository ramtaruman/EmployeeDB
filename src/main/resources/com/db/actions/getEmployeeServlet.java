package com.db.actions;

import com.db.data.Employee;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class getEmployeeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        int employeeId = Integer.parseInt(request.getParameter("id"));
        if(employeeId < 0)
        {
            request.setAttribute("error", "Invalid employee ID");
            request.getRequestDispatcher("error.jsp").forward(request, response);
            return;
        }
        else
        {
            Employee employee = EmployeeDatabase.getEmployeeById(employeeId);
            request.setAttribute("employee", employee);
            request.getRequestDispatcher("displaySingleEmployee.jsp").forward(request, response);
        }


    }
}
