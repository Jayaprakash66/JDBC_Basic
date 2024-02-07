package load_or_register;


import java.util.*;

import com.mysql.cj.protocol.x.SyncFlushDeflaterOutputStream;

import java.sql.*;
public class execute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn=new Scanner(System.in);
		Connection c=null;


		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		 c=DriverManager.getConnection("jdbc:mysql://localhost:3306/qspiders","root","root");
		Statement s=c.createStatement();
		
		boolean b=s.execute("select * from movie");
		System.out.println("Batch Processed");
//		c.close();
		//	
		if(b) {
			ResultSet rs=s.getResultSet();
			while(rs.next()) {
				System.out.println("MovieName-->"+rs.getString(1)+" ");
				System.out.println("HeroName-->"+rs.getString("hero")+" ");
				System.out.println("DirectorName-->"+rs.getString(3)+" ");
				System.out.println("HeroineName-->"+rs.getString(4)+" ");
				System.out.println("Collection-->"+rs.getInt(5)+" ");
				System.out.println("MusicDirector-->"+rs.getString(6)+" ");
				System.out.println("----------------------------------");
			}
		}
		else
		{
			System.out.println("The Process is from java to dbms");
			
		}
		}
		catch(ClassNotFoundException | SQLException  e){
			e.printStackTrace();
		}
		
	}

}
