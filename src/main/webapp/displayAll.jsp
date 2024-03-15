<%@ page import="com.db.data.Employee" %>
<%@ page import="java.util.ArrayList" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="styles/output_all_styles.css">
    <!-- <script src="scripts/displayAll.js"></script>
    <script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jspdf/2.5.1/jspdf.umd.min.js"></script> -->
    
    <title>Display All Employees</title>
</head>
<body>

    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Position</th>
                <th>Salary</th>
            </tr>
        </thead>
        <tbody>
            <% 
                ArrayList<Employee> employees = (ArrayList<Employee>)request.getAttribute("employees");
                
                for (Employee employee : employees) {
            %>
                <tr>
                    <td><%= employee.getId() %></td>
                    <td><%= employee.getName() %></td>
                    <td><%= employee.getPosition() %></td>
                    <td><%= employee.getSalary() %></td>
                </tr>
            <%
                }
            %>
        </tbody>
    </table>
     <!-- <button id="saveAsPdf">Save as PDF</button>
    <a id="downloadLink" class="button" style="display: none;" download="employees_data.pdf">Download PDF</a> -->
    <a class="button" href="index.jsp">Home</a>
</body>
</html>
