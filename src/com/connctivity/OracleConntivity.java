package com.connctivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleConntivity {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		try{  
			//step1 load the driver class  
			  Class.forName("oracle.jdbc.driver.OracleDriver");  
			  String dbUrl=("jdbc:oracle:thin:@localhost:1521:xe");
			  String userName="scott";
			  String password="tiger";
			//step2 create  the connection object  
			Connection con=DriverManager.getConnection(dbUrl,userName,password);  
			  
			//step3 create the statement object  
			Statement stmt=con.createStatement();  
			  
			//step4 execute query  
			ResultSet rs=stmt.executeQuery("select * from emp");  
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3) +rs.getInt(4)+"  "+rs.getDate(5)+"  "+rs.getInt(6)+"  ");  
			  
			//step5 close the connection object  
			con.close();  
			  
			}catch(Exception e){ System.out.println(e);}  
			  
			}  
			}

// ###################### MYSQL ###############################



/*String dbUrl = "jdbc:mysql://localhost:3036/emp";					

//Database Username		
String username = "root";	

//Database Password		
String password = "guru99";				

//Query to Execute		
String query = "select *  from employee;";	

 //Load mysql jdbc driver		
   Class.forName("com.mysql.jdbc.Driver");			

	//Create Connection to DB		
Connection con = DriverManager.getConnection(dbUrl,username,password);

	//Create Statement Object		
Statement stmt = con.createStatement();					

	// Execute the SQL Query. Store results in ResultSet		
	ResultSet rs= stmt.executeQuery(query);							

	// While Loop to iterate through all data and print results		
while (rs.next()){
    		String myName = rs.getString(1);								        
            String myAge = rs.getString(2);					                               
            System. out.println(myName+"  "+myAge);		
    }		
	 // closing DB Connection		
	con.close();			
}
}*/