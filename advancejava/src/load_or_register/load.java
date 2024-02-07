package load_or_register;

import java.sql.*;
import java.util.Scanner;

import com.mysql.cj.protocol.x.SyncFlushDeflaterOutputStream;
public class load {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn=new Scanner(System.in);
//		System.out.println("Enter the movie name");
//		String moviename=sn.next();
//		
//		System.out.println("Enter the hero name");
//		String hero=sn.next();
//		
//		System.out.println("Enter the director name");
//		String director=sn.next();
//		
//		System.out.println("Enter the heroine name");
//		String heroine=sn.next();
//		
//		System.out.println("Enter the Collection name");
//		int collection =sn.nextInt();
//		
//		System.out.println("Enter the Music Director");
//		String musicdirector =sn.next();
		
		Connection c=null;////globally declaring connection
		try {
			
			//1.load or register driver
			// 1st way
//			Driver d=new com.mysql.cj.jdbc.Driver();
//			DriverManager.registerDriver(d);
			
			//2nd Way
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2.Establish connection
			c=DriverManager.getConnection("jdbc:mysql://localhost:3306/qspiders","root","root");
			//3.create statement
//			Statement s=c.createStatement();
			//4.executeQuery
//			s.executeUpdate("insert into movie values('legend','saravana','karthikeyan','all',600,'harisjayaraj')");
//			s.executeUpdate("update  movie set heroine='tamannah' where moviename='jailer'");
	
//			s.executeUpdate("delete from movie where moviename='legend'");
			
			
			//Prepared Statement--it is used to get dynamic input and store in mysql
			
			
			//insert in preparestatement
//			PreparedStatement ps=c.prepareStatement("insert into movie values(?,?,?,?,?,?)");
//			ps.setString(1,moviename);
//			ps.setString(2,hero);
//			ps.setString(3,director);
//			ps.setString(4,heroine);
//			ps.setInt(5,collection);
//			ps.setString(6,musicdirector);
//			
			/////////////////Updating dynamically//////////////////
//			String update=sn.next();
//			PreparedStatement ps=c.prepareStatement("update  movie set director=? where moviename='jailer'");
//			
//			ps.setString(1, update);
			
			///////////////Deleting Dynamically//////////////////////
//			String delete=sn.next();
//			PreparedStatement ps=c.prepareStatement("delete from movie where moviename=?");
//			ps.setString(1, delete);
//			ps.executeUpdate();

			/////Select in mysql through java
			Statement s=c.createStatement();
			ResultSet rs=s.executeQuery("Select * from movie");
			while (rs.next()) {
				System.out.println("MovieName-->"+rs.getString(1)+" ");
				System.out.println("HeroName-->"+rs.getString("hero")+" ");
				System.out.println("DirectorName-->"+rs.getString(3)+" ");
				System.out.println("HeroineName-->"+rs.getString(4)+" ");
				System.out.println("Collection-->"+rs.getInt(5)+" ");
				System.out.println("MusicDirector-->"+rs.getString(6)+" ");
				System.out.println("----------------------------------");
			}
			System.out.println("All Datas Printed");
//			System.out.println("All dynamic datas inserted");
			
			
			//Callable Statement-- used for advanced sql like trigerr

			
		}
		catch( ClassNotFoundException | SQLException  e) {
			e.printStackTrace();
//			System.out.println("Its");
		}
		finally {
			try {
				c.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
			}
			System.out.println("Finally closed");
		}

	}

}
