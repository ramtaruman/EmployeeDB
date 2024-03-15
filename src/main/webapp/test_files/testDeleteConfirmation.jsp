<!DOCTYPE html>
<html>
<head>
    <script src="scripts/deleteValidation.js"></script>
    <meta charset="UTF-8">
    <title>Test Delete Confirmation</title>
</head>
<body>
    <h2>Test Delete Confirmation</h2>
    
    <form action="deleteEmployee.jsp" method="get" onsubmit="return confirm('Are you sure you want to delete this employee?');">
        <label for="employeeId">Employee ID:</label>
        <input type="text" id="employeeId" name="employeeId" required><br>
        <input type="submit" value="Delete">
    </form>
</body>
</html>
