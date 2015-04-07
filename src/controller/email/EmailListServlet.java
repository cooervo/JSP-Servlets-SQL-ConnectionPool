package controller.email;
//Controller: controls the flow of the application
import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import model.business.User;
import model.data.UserDB;

@SuppressWarnings("serial")
public class EmailListServlet extends HttpServlet { 
	 @Override
	    protected void doPost(HttpServletRequest request,
	            HttpServletResponse response)
	            throws ServletException, IOException {
	        String url = "/index.jsp";
	        
	        // get current action
	        String action = request.getParameter("action");
	        if (action == null) {
	            action = "join";  // default action
	        }

	        // perform action and set URL to appropriate page
	        if (action.equals("join")) {
	            url = "/index.jsp";    // the "join" page
	        } 
	        else if (action.equals("add")) {
	            // get parameters from the request
	            String firstName = request.getParameter("firstName");
	            String lastName = request.getParameter("lastName");
	            String email = request.getParameter("email");

	            // store data in User object
	            User user = new User(firstName, lastName, email);

	            // validate the parameters
	            String message;
	            if (UserDB.emailExists(user.getEmail())) {
	                message = "This email address already exists.<br>" +
	                          "Please enter another email address.";
	                url = "/index.jsp";
	            }else if (firstName == null || lastName == null ||
	                firstName.isEmpty() || lastName.isEmpty() ) {
	                message = "Please fill out all three text boxes.";
	                url = "/index.jsp";
	                
	            } else if (!email.contains("@") || !email.contains(".") ||
	            		email.isEmpty()  || email == null){
	            	message = "Please check that you're email is correct";
	            	url="/index.jsp";
	            } else if (( email.contains("<") ||email.contains(">")) || 
	            			( firstName.contains("<") ||firstName.contains(">")) ||
	            			( lastName.contains("<") || lastName.contains(">")) ){
	            	message = "None of the fields should contain brackets (<) or (>)";
	            	url="/index.jsp";
	            }
	            
	            else {
	                message = "";
	                url = "/thanks.jsp";
	                UserDB.insert(user);
	            }
	            request.setAttribute("user", user);
	            request.setAttribute("message", message);
	        }
	        getServletContext()
	                .getRequestDispatcher(url)
	                .forward(request, response);
	    }
	    
	    @Override
	    protected void doGet(HttpServletRequest request,
	            HttpServletResponse response)
	            throws ServletException, IOException {
	        doPost(request, response);
	    }    
	}