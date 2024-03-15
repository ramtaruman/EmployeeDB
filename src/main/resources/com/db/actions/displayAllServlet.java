package com.db.actions;

import com.db.data.Employee;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import static com.db.util.DatabaseUtil.getConnection;

public class displayAllServlet extends HttpServlet {
    Connection connection = null;

    public void init() throws ServletException {

        connection = getConnection();
    }



    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String sql = "SELECT * FROM emp_db";
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;

        try
        {
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        if(resultSet==null)
        {
            request.setAttribute("error", "No employees found");
            request.getRequestDispatcher("error.jsp").forward(request, response);
            return;
        }
        else
        {
            ArrayList<Employee> employees = new ArrayList<>();
            try {
                while (resultSet.next()) {
                    Employee employee = new Employee();
                    employee.setId(resultSet.getInt("id"));
                    employee.setName(resultSet.getString("name"));
                    employee.setPosition(resultSet.getString("position"));
                    employee.setSalary(resultSet.getLong("salary"));
                    employees.add(employee);
                }
            } catch (Exception e) {
                System.out.println(e);
                return;
            }

            request.setAttribute("employees", employees);
            request.getRequestDispatcher("displayAll.jsp").forward(request, response);
            return;
        }
    }
}
