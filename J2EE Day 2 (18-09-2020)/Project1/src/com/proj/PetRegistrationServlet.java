package com.proj;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PetRegistrationServlet")
public class PetRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public PetRegistrationServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	     response.setContentType("text/html");

         PrintWriter pw=response.getWriter();

         String fname=request.getParameter("fn");
         
         String lname=request.getParameter("ln");
        
         String address=request.getParameter("addr");
         
         String emailId=request.getParameter("email");
         
         String cname=request.getParameter("city");
         
         String sname=request.getParameter("state");
         
         long phone=Long.parseLong(request.getParameter("mob"));
         
         String petname=request.getParameter("pname");
         
         String pettype=request.getParameter("ptype");
         
         int petage=Integer.parseInt(request.getParameter("page"));

         Connection con=null;

         try{

        	 Class.forName("com.mysql.jdbc.Driver");

             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/PetRegistration", "root","root");
           
             PreparedStatement ps=con.prepareStatement("insert into Registration(FirstName, LastName, Address, EmailID, City, State, PhoneNumber, PetName, PetType, PetAge) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

             ps.setString(1, fname);
             
             ps.setString(2, lname);
             
             ps.setString(3, address);
             
             ps.setString(4, emailId);
             
             ps.setString(5, cname);

             ps.setString(6, sname);
             
             ps.setLong(7, phone);

             ps.setString(8, petname);
             
             ps.setString(9, pettype);
             
             ps.setInt(10, petage);
             
             int i = ps.executeUpdate();
             
             System.out.println("inserted");

             if(i==1){
            	 
            	 pw.println("Registration Details.. " + "<br/>");
            	 pw.println("First Name => " + fname + "<br/>"); 
            	 pw.println("Last Name => " + lname + "<br/>");
            	 pw.println("Address => " + address + "<br/>");   
            	 pw.println("Email ID => " + emailId + "<br/>");
            	 pw.println("City => " + cname + "<br/>");
            	 pw.println("State => "+ sname + "<br/>");
            	 pw.println("Phone Number => " + phone + "<br/>");
            	 pw.println("Pet Name => "+ petname + "<br/>");
            	 pw.println("Pet Type => "+ pettype + "<br/>");
            	 pw.println("Pet Age => "+ petage + "<br/><br/>");
            	 pw.println("Your Registration was Successfully Done...!!!! ");
            	 
                        // RequestDispatcher rd=request.getRequestDispatcher("/success.html");

                         // rd.forward(request, response);

             }
             else {
            	 
            	 RequestDispatcher rd=request.getRequestDispatcher("/error.html");

                 rd.forward(request, response);
             }

         }

         catch(Exception e){ 
             
        	 e.printStackTrace();
             System.out.println("Exception Caught");
             
         }
	}

}
