<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admission Success</title>
</head>
<body>
<h1>${welcome}</h1>
 <table>
   
   <tr>
   <td>Name</td>
   <td>${student.name}</td>
   </tr>
   
   <tr>
   <td>Hobbies</td>
   <td>${student.hobbies}</td>
   </tr>
   
   <tr>
   <td>Date Of Birth</td>
   <td>${student.dob}</td>
   </tr>
   
    <tr>
   <td>Number</td>
   <td>${student.phone}</td>
   </tr>
   
    <tr>
   <td>Skills</td>
   <td>${student.getSkills()}</td>
   </tr> 
    
    <tr>
   <td>Student Address</td>
   <td>${student.address.city}</td>
   <td>${student.address.state}</td>
   <td>${student.address.country}</td>
   <td>${student.address.pincode}</td> 
   </tr>
    
    
   </table>


</body>
</html>