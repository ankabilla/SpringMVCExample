<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="<spring:theme code='styleSheet'/>" type="text/css"/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admission Form</title>
</head>
<body>
<!-- 
  <a href="/FirstSpringMVCProject/admissionForm.html/?siteTheme=red">Red</a>
   <a href="/FirstSpringMVCProject/admissionForm.html/?siteTheme=green">Green</a>
<br/>
   <a href="/FirstSpringMVCProject/admissionForm.html/?siteLanguage=en">English</a>
   <a href="/FirstSpringMVCProject/admissionForm.html/?siteLanguage=fr">French</a> -->
   <h1>${welcome}</h1>
   <form:errors path="student.*"/>
   <form action="submitAdmissionForm.html" method="post">
   <table border="0">
   
   <tr>
   <td><spring:message code="label.name"/></td>
   <td><input type="text" name="name"/></td>
   </tr>
   
   <tr>
   <td><spring:message code="label.hobbies"/></td>
   <td><input type="text" name="hobbies"/></td>
   </tr>
   
   <tr>
   <td><spring:message code="label.dob"/></td>
   <td><input type="text" name="dob"/></td>
   </tr>
   
   <tr>
   <td><spring:message code="label.phone"/></td>
   <td><input type="text" name="phone"/></td>
   </tr>
   
   <tr>
   <td><spring:message code="label.skills"/></td>
   <td>
   <select name="skills" multiple>
    <option value="java">java</option>
    <option value="struts">struts</option>
    <option value="spring">spring</option>
    
   </select>
   </td>
   </tr>
    
   <tr><td><spring:message code="label.studentAddress"/></td>
   <td>
   
   <table>
   <tr>
   <td><spring:message code="label.city"/></td>
   <td><input type="text" name="address.city"></td>
   </tr>
   
   
   <tr>
   <td><spring:message code="label.state"/></td>
   <td><input type="text" name="address.state"></td>
   </tr>
   
   
   <tr>
   <td><spring:message code="label.zip"/></td>
   <td><input type="text" name="address.pincode"></td>
   </tr>
   
   
   <tr>
   <td><spring:message code="label.country"/></td>
   <td><input type="text" name="address.country"></td>
   </tr>
   </table>
   
   </td>
   </tr> 
    
   <tr><td>
   <input type="submit" value="Submit Application">
   </td></tr> 
   </table>
   </form>
</body>
</html>