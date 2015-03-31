<%@page contentType="text/html" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Sorry for the inconvenience</title>
    <link rel="stylesheet" href="styles/main.css" type="text/css"/>
</head>
<body>
   <div id="main-wrapper">
      <p>Sorry, there was an exception.</p>
      <p>To continue, click the Back button.</p>
      
      <h2>Details</h2>
      <p>Type: ${pageContext.exception["class"]}</p>
      <p>Message: ${pageContext.exception.message}</p>
   </div>
</body>
</html>