# Email List web app implementing Java EE 

### What this web app does 
The first page of this app is a JSP page that gets data from the user and sends it to the  server as an HTTP request. 

The second page of this app is a JSP that display the data that the user has entered.

### Technologies & guidelines used
This website uses the following technologies to work properly:

* JSP (with JSTL & EL)
* Servlets
* JavaBean (User.class)
* MySQL & JDBC
* HTML and CSS
* XML
* Apache Tomcat
* Git for VCS
* MVC compound pattern to help structure the project

###Additional Notes
implementing the **MVC compound pattern** in where the views, model and controller are all organized into separate files:
#####Model
Business layer of the app. This is usually implemented with **JavaBeans**. This type of class defines the data for the business objects and provides the methods that do the business processing (User.class, UserDB.class).

#####View
Defines the presentation layer of the app. MVC app uses HTML or JSPs to present the view to the browser. (index.html, thanks.jsp, *.css)

#####Controller
Manages the flow of the app, this work is done by one or more servlets. First, a servlet reads any parameters that are available from the request. Second, the servlet updates the model and saves it to the data store. Finally, the servlet forwards the updated model to one of several possible JSPs/HTMLs for presentation (EmailListServlet.class).

We should strive to keep the model, view, controller as independent as possible from each other, it's very difficult to keep the completely independent but is a goal to strive towards to. 

#####JavaBean
 User class is a JavaBean or bean, because it follows the rules that all JavaBeans must follow:

1) a JavaBean must contain a zero-argument constructor, which is a construct that doesn't accept any arguments

2) A JavaBean must contain **get** and **set methods** for all the properties(instances vars) that need to be accessed by JSP
 ->Booleans: **is** & **get methods** instead of get & set.

3) A JavaBean must implement the **Serializable** or **Externalizable interface**. The Serializable interface indicates that a class contains get, set and is(for booleans) methods that another class can use to read and write an objects instance variables to and from a persistent data source. This can make Tomcat to save the Users object state (serialize) befor it shuts down and it can restore (deserialize) the User objects state when it start up next time
 
 *	JavaBeans apart from defining business objects. Can be used to define buttons and other user interface controls. 
 *  Java beans are just Java classes (plain old java object=POJO)

### Todo's

* MySQL & JDBC implementation/ Perhaps JPA
* Add XSS protection with JSTL out tags


