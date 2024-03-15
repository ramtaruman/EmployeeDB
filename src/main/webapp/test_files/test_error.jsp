<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Test Error Page</title>
</head>
<body>
    <h2>Test Error Page</h2>

    <%-- Simulate an error and redirect to errorPage.jsp with custom message and error details --%>
    <%
        String errorMessage = "This is a test error message.";
        String errorDetails = "Test error details: Something went wrong.";

        response.sendRedirect("error.jsp?message=" + java.net.URLEncoder.encode(errorMessage, "UTF-8") + "&error=" + java.net.URLEncoder.encode(errorDetails, "UTF-8"));
    %>
</body>
</html>
