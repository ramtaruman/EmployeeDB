<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="styles/form_styles.css">
    <script src="scripts/formValidation.js"></script>
    <script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
    <meta charset="UTF-8">
    <title>Update Employee</title>
</head>
<body>
    <form action="updateEmployee" method="get" onsubmit="return validateForm_update()">
        <label for="employeeId">Employee ID:</label>
        <input type="text" id="employeeId" name="employeeId" required><br>

        <label for="name">Name:</label>
        <input type="text" id="name" name="name" required><br>

        <label for="position">Position:</label>
        <input type="text" id="position" name="position" required><br>

        <label for="salary">Salary:</label>
        <input type="number" id="salary" name="salary"><br>

        <input type="submit" value="Update">
    </form>
    <div class="navbar">
        
        <a href="index.jsp">Home</a>
        <a href="displayAll">Display All</a>
        <a href="raiseEmployee.jsp">Raise</a>
        <a href="createEmployee.jsp">Create</a>
        <a href="updateEmployee.jsp">Update</a>
        <a href="deleteEmployee.jsp">Delete</a>
        <a href="displayEmployeeInput.jsp">Display One</a>
        
    </div>
</body>
</html>
