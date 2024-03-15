package com.db.actions;

import com.db.data.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import static com.db.util.DatabaseUtil.getConnection;

public class EmployeeDatabase {
    private static Connection connection = getConnection();
    public static Employee getEmployeeById(int id) {
        String sql = "SELECT * FROM emp_db WHERE id = ?";
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                Employee employee = new Employee();
                employee.setId(resultSet.getInt("id"));
                employee.setName(resultSet.getString("name"));
                employee.setPosition(resultSet.getString("position"));
                employee.setSalary(resultSet.getLong("salary"));
                return employee; //grabbing the employee object containing the values of that certain row
            }
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
        return null;
    }


    public static boolean addEmployee(Employee employee) {
        String sql = "INSERT INTO emp_db (id,name, position,salary) VALUES (?,?,?, ?)";

        try  {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, employee.getId());
            preparedStatement.setString(2, employee.getName());
            preparedStatement.setString(3, employee.getPosition());
            preparedStatement.setLong(4, employee.getSalary());


            int rowsAffected = preparedStatement.executeUpdate();


            return rowsAffected > 0; //true if works


        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }


    public static boolean updateEmployee(Employee employee) {
        String sql = "UPDATE emp_db SET name = ?, position = ?, salary = ? WHERE id = ?";

        try

        {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, employee.getName());
            preparedStatement.setString(2, employee.getPosition());
            preparedStatement.setLong(3, employee.getSalary());
            preparedStatement.setInt(4, employee.getId());

            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0; //only should work if return true
        }
        catch (Exception e)
        {
            System.out.println(e);
            return false;
        }
        }

    public static boolean deleteEmployee(int employeeId) {

        String sql = "DELETE FROM emp_db WHERE id = ?";

        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql))
        {
            preparedStatement.setInt(1, employeeId);
            int rowsAffected = preparedStatement.executeUpdate();
            return rowsAffected > 0; //only should work if return true
        }
        catch (Exception e)
        {
            System.out.println(e);
            return false;
        }
    }

    public static ResultSet getAllEmployees() {

        String sql = "SELECT * FROM emp_db";
        try
        {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            return preparedStatement.executeQuery();
        }
        catch (Exception e)
        {
            System.out.println(e);
            return null;
        }
    }

    public static void raiseSalary(int id, long raise) {

        String sql = "UPDATE emp_db SET salary = salary + ? WHERE id = ?";
        try
        {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, raise);
            preparedStatement.setInt(2, id);
            preparedStatement.executeUpdate();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}