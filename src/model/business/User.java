package model.business;

import java.io.Serializable;
/*
 * ---Java Beans class---
 * User class is a JavaBean or bean, because it follows the rules
 * that all JavaBeans must follow:
 *	1) a JavaBean must contain a zero-argument constructor, which is a construct that doesn't accept any arguments
 *	2) A JavaBean must contain get and set methods for all the properties(instances vars) that need to be accessed by JSP
 *		->Booleans: is & get methods instead of get & set.
 *	3) A JavaBean must implement the Serializable or Externalizable interface. The Serializable interface indicates that a class contains get, set and is(for booleans) methods that another class can use to read and write an objects instance variables to and from a persistent data source. This can make Tomcat to save the Users object state (serialize) befor it shuts down and it can restore (deserialize) the User objects state when it start up next time
 *
 *	JavaBeans apart from defining business objects. Can be used to define buttons and other user interface controls. 
 *  Java beans are just Java classes (plain old java object=POJO)
 */
@SuppressWarnings("serial")
public class User implements Serializable {
	private String firstName;
	private String lastName;
	private String email;

	public User() {
		firstName = "";
		lastName = "";
		email = "";
	}

	public User(String firstName, String lastName, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
