<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!-- above: JSP directives -->

<c:import url="/includes/header.html"/>    

   <div id="main-wrapper">
      <h1>Join our email list</h1>
      <p>To join our email list, please enter your name and email address in the form below</p>
      
      <%-- if message isn't null then show it --%> 
      <c:if test="${message != null }">
         <%-- JSTL out tag to escape chars for XSS protection --%>
         <div id="error-message"><c:out value="${message}"/></div>
      </c:if>
      <form action="emailList" method="post"><!-- Request servlet through mapped URL emailList -->
   
         <input type="hidden" name="action" value="add">
         
         <label>Email:</label>
         <input type="email" name="email"    value="${user.email}"><br>
         
         <label>First name:</label>
         <input type="text" name="firstName"  value="${user.firstName}"><br>
         
         <label>Last name:</label>
         <input type="text" name="lastName"   value="${user.lastName}"><br>
         
         <label>&nbsp;</label><!-- &nbsp; is the entity used to represent a non-breaking space. It is essentially a standard space, the primary difference being that a browser should not break (or wrap) a line of text at the point that this &nbsp; occupies. -->
         <input type="submit" value="Join Now" id="submit-button"><br>

   </form>
   </div>   
   
<c:import url="/includes/footer.jsp"/>    