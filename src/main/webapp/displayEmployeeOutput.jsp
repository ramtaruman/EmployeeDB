<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="styles/output_styles.css">
    <meta charset="UTF-8">
    <title>Display Employees</title>
</head>
<body>
    <div class="container">
        <table class="employee-table">
            <c:if test="${employee ne null}">
                <tr>
                    <td>ID:</td>
                    <td>${employee.id}</td>
                </tr>
                <tr>
                    <td>Name:</td>
                    <td>${employee.name}</td>
                </tr>
                <tr>
                    <td>Position:</td>
                    <td>${employee.position}</td>
                </tr>
                <tr>
                    <td>Salary:</td>
                    <td>${employee.salary}</td>
                </tr>
            </c:if>
        </table>

        <div class="back-to-home">
            <a href="index.jsp">Back to Homepage</a>
        </div>
    </div>
</body>
</html>
