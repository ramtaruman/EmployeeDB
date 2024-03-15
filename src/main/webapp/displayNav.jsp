<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" type="text/css" href="styles/home_styles.css">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Display Navigation</title>
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
    <div class="container">
        
        <div class="card" onclick="navigateTo('displayEmployeeInput.jsp')">
            <h3>Display One Employee </h3>
        </div>
        <div class="card" onclick="navigateTo('displayAll')">
            <h3>Display All Employees</h3>
        </div>
        <div class="card" onclick="navigateTo('index.jsp')">
            <h3>Home</h3>
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
