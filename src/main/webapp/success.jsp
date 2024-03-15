<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Success Page</title>
    <link rel="stylesheet" type="text/css" href="styles/error_styles.css">
</head>

<body>
    
    <div class="error-container">
        
        <h1>Success </h1>
            <p>${requestScope.message}</p>
            <p>${requestScope.success}</p>

    </div>
    <div class="press">
    <a href="index.jsp">Home</a>
    </div>


    
    
</body>


</html>
