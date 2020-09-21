package com.login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String id = request.getParameter("loginId");
		String pwd = request.getParameter("password");
		
		boolean status = false;
		
		Connection con=null;

        try{

       	 	Class.forName("com.mysql.jdbc.Driver");

            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Registration", "root","root");
            
            pw.println("Connected");
            
            PreparedStatement ps=con.prepareStatement("select * from User where loginId=? and password=?");

            ps.setString(1, id);
            
            ps.setString(2, pwd);
            
            ResultSet rs = ps.executeQuery();
            
            status = rs.next();
        }
        catch(Exception e) {
        	System.out.println(e);
        }
        finally {
        	if(status) {
        		RequestDispatcher rd = request.getRequestDispatcher("./success.html");
        		rd.forward(request, response);
        	}
        	else {
        		RequestDispatcher rd = request.getRequestDispatcher("./error.html");
        		rd.forward(request, response);
        	}
        }
		pw.close();
	}

}
