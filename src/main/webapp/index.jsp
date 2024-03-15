<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="styles/home_styles.css">
    <title>Employee Database Application</title>
</head>

<body>
    <div class="area" >
        <ul class="circles">
                <li></li>
                <li></li>
                <li></li>
                <li></li>
                <li></li>
                <li></li>
                <li></li>
                <li></li>
                <li></li>
                <li></li>
        </ul>
    </div >
    <div class="context">
    <div class="success-container">
            <p>${requestScope.message}</p>
            <p>${requestScope.success}</p>
    </div>    
    <div class="container">
        
        <div class="card" onclick="navigateTo('createEmployee.jsp')">
            <h3>Create Employee</h3>
        </div>
        <div class="card" onclick="navigateTo('updateEmployee.jsp')">
            <h3>Update Employee</h3>
        </div>
        <div class="card" onclick="navigateTo('deleteEmployee.jsp')">
            <h3>Delete Employee</h3>
        </div>
        <div class="card" onclick="navigateTo('displayNav.jsp')">
            <h3>Display Employees</h3>
        </div>
        <div class="card" onclick="navigateTo('raiseEmployee.jsp')">
            <h3>Raise Employee Salary</h3>
        </div>
        
    </div>

    <script>
        function navigateTo(page) {
            window.location.href = page;
        }
    </script>
    </div>
    
</body>




</html>
