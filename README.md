# Email List web app implementing Java EE 

#####Screenshots:

######Adding a new user********************* Success screen**************************Error validation (repeated email)
![Alt text](http://i.imgur.com/NmbhCYU.png) ![Alt text](http://i.imgur.com/wQdl1A8.png) ![Alt text](http://i.imgur.com/hKihdb1.png)

----------------------
### Connection Pool

Openning a connection to a DB is time consuming as a result it is common programming practice to create a collection of connection objects and store them in anoter object that's known as DBCP. Then the  Connection object in the pool are shared by all the users of a web app. 
----------------------
### What this web app does 
The first page of this app is a JSP page that gets data from the user and sends it to the  server as an HTTP request. 

The second page of this app is a JSP that display the data that the user has entered.
----------------------
### Technologies & guidelines used
This website uses the following technologies to work properly:

* JSP (with JSTL, EL, includes and custom tags)
* JSP <c:out> tags to escape chars and protect against XSS (cross site scripting)
* JDBC and prepared statement to protect against SQL injection attacks
* Servlets
* JavaBean (User.class)
* MySQL 
* Object Relational Mapping (ORM) in class UserDB
* HTML and CSS
* XML
* Apache Tomcat
* Git for VCS
* MVC compound pattern to help structure the project


----------------------
###Additional Notes
implementing the **MVC compound pattern** in where the views, model and controller are all organized into separate files:
#####Model
Business layer of the app. This is usually implemented with **JavaBeans**. This type of class defines the data for the business objects and provides the methods that do the business processing (User.class, UserDB.class).

#####View
Defines the presentation layer of the app. MVC app uses HTML or JSPs to present the view to the browser. (index.html, thanks.jsp, *.css)

#####Controller
Manages the flow of the app, this work is done by one or more servlets. First, a servlet reads any parameters that are available from the request. Second, the servlet updates the model and saves it to the data store. Finally, the servlet forwards the updated model to one of several possible JSPs/HTMLs for presentation (EmailListServlet.class).

We should strive to keep the model, view, controller as independent as possible from each other, it's very difficult to keep the completely independent but is a goal to strive towards to. 
----------------------
##### Security

###### XSS (Cross Site Scripting):
In addition, to validation with JavaScript I'm adding **JSP out tag to scape characters** and server side validation to defend against most XSS.
###### SQL injection attacks:
Usage of **prepared statements** automatically check their parameter values to prevent most types of SQL injection attacks. As a result, it's generally considered a best practice to use a prepared statement whenever possible.

----------------------
#####JavaBean
 User class is a JavaBean or bean, because it follows the rules that all JavaBeans must follow:

1) a JavaBean must contain a zero-argument constructor, which is a construct that doesn't accept any arguments

2) A JavaBean must contain **get** and **set methods** for all the properties(instances vars) that need to be accessed by JSP
 ->Booleans: **is** & **get methods** instead of get & set.

3) A JavaBean must implement the **Serializable** or **Externalizable interface**. The Serializable interface indicates that a class contains get, set and is(for booleans) methods that another class can use to read and write an objects instance variables to and from a persistent data source. This can make Tomcat to save the Users object state (serialize) befor it shuts down and it can restore (deserialize) the User objects state when it start up next time
 
 *	JavaBeans apart from defining business objects. Can be used to define buttons and other user interface controls. 
 * Java beans are just Java classes (plain old java object=POJO)
 
----------------------


