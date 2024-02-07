package load_or_register;

import java.sql.*;
import java.util.*;

public class batchprocessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn=new Scanner(System.in);
		Connection c=null;
		System.out.println("Enter the Number of rows to insert");
		int count=sn.nextInt();
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		 c=DriverManager.getConnection("jdbc:mysql://localhost:3306/qspiders","root","root");
		PreparedStatement ps=c.prepareStatement("insert into movie values(?,?,?,?,?,?)");
		
		for(int i=0;i<count;i++)
		{
			
			System.out.println("Enter the movie name");
			String moviename=sn.next();
			
			System.out.println("Enter the hero name");
			String hero=sn.next();
			
			System.out.println("Enter the director name");
			String director=sn.next();
			
			System.out.println("Enter the heroine name");
			String heroine=sn.next();
			
			System.out.println("Enter the Collection name");
			int collection =sn.nextInt();
			
			System.out.println("Enter the Music Director");
			String musicdirector =sn.next();
			
		ps.setString(1,moviename);
		ps.setString(2,hero);
		ps.setString(3,director);
		ps.setString(4,heroine);
		ps.setInt(5,collection);
		ps.setString(6,musicdirector);
		ps.addBatch();
		}
		ps.executeBatch();
		System.out.println("Batch Processed");
//		c.close();
		//	
		}
		catch(ClassNotFoundException | SQLException  e){
			e.printStackTrace();
		}
		finally {
			try {
				c.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
