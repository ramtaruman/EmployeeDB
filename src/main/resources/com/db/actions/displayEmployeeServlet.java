package com.db.actions;


import com.db.data.Employee;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class displayEmployeeServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int employeeId = Integer.parseInt(request.getParameter("employeeId"));
        Employee employee = EmployeeDatabase.getEmployeeById(employeeId);
        if (employee == null) {
            request.setAttribute("error", "Employee not found");
            request.getRequestDispatcher("error.jsp").forward(request, response);
            return;
        }
        else {
            request.setAttribute("employee", employee);
            request.getRequestDispatcher("displayEmployeeOutput.jsp").forward(request, response);
        }
    }
}
