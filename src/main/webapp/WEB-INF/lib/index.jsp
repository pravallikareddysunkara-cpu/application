<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h2>Student Marks Application</h2>
  
  <form action="student" method="post">
  
  Student Name:
  <input type="text" name="name">
  <br><br>
  
  Marks:
  <input type="number" name="marks">
  <br><br>
  
  <input type="submit" value="Calculate Grade">
  </form>
</body>
</html>