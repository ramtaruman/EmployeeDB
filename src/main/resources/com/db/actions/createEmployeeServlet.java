package com.db.actions;

import com.db.data.Employee;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


public class createEmployeeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try {
            int id = Integer.parseInt(request.getParameter("id"));
            String name = request.getParameter("name");
            String position = request.getParameter("position");
            long salary = Long.parseLong(request.getParameter("salary"));

            if (id == 0 || name == null || name.trim().isEmpty() || position == null || position.trim().isEmpty() || salary == 0) {
                request.setAttribute("message", "All fields are mandatory");
                request.getRequestDispatcher("error.jsp").forward(request, response);
                return;
            }


            Employee newEmployee = new Employee();
            newEmployee.setId(id);
            newEmployee.setName(name);
            newEmployee.setPosition(position);
            newEmployee.setSalary(salary);

            boolean success = EmployeeDatabase.addEmployee(newEmployee);

            if (success) {
                request.setAttribute("message", "Employee added successfully");
                request.getRequestDispatcher("index.jsp").forward(request, response);
            } else {
                request.setAttribute("message", "Employee addition not successful");
                request.getRequestDispatcher("error.jsp").forward(request, response);

            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
