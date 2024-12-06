 <!DOCTYPE html> 
<html> 
<head> 
    <title>Employee Form</title> 
</head> 
<body> 
    <h2>Employee Form</h2> 
    <form action="/addEmployee" method="post"> 
        <label for="id">ID:</label> 
        <input type="text" id="id" name="id" required><br><br>
        <label for="name">Name:</label> 
        <input type="text" id="name" name="name" required><br><br> 
        <label for="dept">Department:</label> 
        <input type="text" id="dept" name="dept" required><br><br> 
        <label for="salary">Salary:</label> 
        <input type="text" id="salary" name="salary" required><br><br> 
        <input type="submit" value="Submit"> 
    </form> 
</body> 
</html> 