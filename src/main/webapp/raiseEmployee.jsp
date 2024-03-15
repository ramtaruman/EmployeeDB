<html>
    <head>
        <link rel="stylesheet" href="styles/form_styles.css">
        <title>Raise Employee</title>
    </head>
    <body>
        <form action="raiseEmployee" method="get">
            <label for="id">Employee ID:</label>
            <input type="number" id="id" name="id"><br>
            <label for="raise">Raise Amount:</label>
            <input type="number" id="raise" name="raise"><br>
            <input type="submit" value="Raise">
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