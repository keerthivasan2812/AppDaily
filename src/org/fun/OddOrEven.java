package org.fun;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class OddOrEven {
	
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the name");
		String name1 = s.nextLine();
		Connection con=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","keerthi");
			String sql="insert into scan(name) values(?)";
			
			PreparedStatement ps = con.prepareStatement(sql);
			
			ps.setString(1, name1);
			ps.executeQuery();
			ps.executeUpdate();
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
;			
		}
	
	
		
		s.close();
		
		
		
		
		
	}

}
