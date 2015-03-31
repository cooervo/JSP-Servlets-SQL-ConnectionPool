<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.GregorianCalendar, java.util.Calendar" %>

<%
      GregorianCalendar currentDate = new GregorianCalendar();
     int currentYear = currentDate.get(Calendar.YEAR);
%>

<div id="CC">
   <img alt="creative commons" src="https://licensebuttons.net/l/by-nc-sa/3.0/88x31.png">
   <p>No Rights Reserved <br>Mateo Cuervo | <%=currentYear %> </p>
</div>
</body>
</html>