<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="styles/form_styles.css">
    <script src="scripts/formValidation.js"></script>
    <script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
    <meta charset="UTF-8">
    <title>Display Employees</title>
</head>
<body>
    
    <form action="displayEmployee" method="get" onsubmit="return validateForm_display()">
        <label for="employeeId">Enter Employee ID: </label>
        <input type="text" id="employeeId" name="employeeId">
        <input type="submit" value="Display Employee">
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
    <!-- <a class="button" href="index.jsp">Home</a> -->
</body>
</html>
