package com.db.actions;

import com.db.data.Employee;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class updateEmployeeServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        int employeeId = Integer.parseInt(request.getParameter("employeeId"));

        if(employeeId < 0) {
            request.setAttribute("error", "Invalid employee ID");
            request.getRequestDispatcher("error.jsp").forward(request, response);
            return;
        } // trying to equip error handling

        Employee existingEmployee = EmployeeDatabase.getEmployeeById(employeeId);
        if(existingEmployee == null) {
            request.setAttribute("error", "Employee not found");
            request.getRequestDispatcher("error.jsp").forward(request, response);
            return;
        }

        existingEmployee.setId(employeeId);
        existingEmployee.setName(request.getParameter("name"));
        existingEmployee.setPosition(request.getParameter("position"));
        existingEmployee.setSalary(Long.parseLong(request.getParameter("salary")));

        boolean success = EmployeeDatabase.updateEmployee(existingEmployee);
        if(!success) {
            request.setAttribute("error", "Failed to update employee");
            request.getRequestDispatcher("error.jsp").forward(request, response);
            return;
        }
        else{
            request.setAttribute("success", "Employee updated successfully");
            request.getRequestDispatcher("success.jsp").forward(request, response);
            return;
        }

    }
}
