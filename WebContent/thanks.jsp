<%@page contentType="text/html" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   

<c:import url="/includes/header.html"/>    


   <div id="main-wrapper">
       <h1>Thanks for joining our email list</h1>
   
       <p>Here is the information that you entered:</p>
         
        <%--The following are known as Expression Language tags (EL) 
        they always are used ${...} --%> 
        <ul> 
          <li><label>Email:</label>
          <span>${user.email}</span><br></li>
          <li><label>First Name:</label>
          <span>${user.firstName}</span><br></li>
          <li><label>Last Name:</label>
          <span>${user.lastName}</span><br></li>
       </ul>
       <!-- Notice there's no JAva code embedded in this JSP, 
       remember the JSP is part of the VIEW so it's bad practice
       better leave the CONTROLLER part to the servlet which
       forward the request and response objects to the JSP. 
       This is very beneficial as means the designer can develop the 
       JSP with minimal interaction with the programming logic, and the
       programmer can develop the servlet without worrying about
       the HTML -->
         
       <p>To enter another email address, click on the Return button shown 
       below.</p>
   
       <form action="" method="get">
           <input type="hidden" name="action" value="join">
           <input type="submit" value="Return" id="return-button">
       </form>
   </div>
   
<c:import url="/includes/footer.jsp"/>    