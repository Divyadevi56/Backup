package service;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import mobile.Details;
public class ServiceImpl extends Details implements Service  {
		Details details=new Details();
		Scanner scan=new Scanner(System.in);
	@Override
	public void purchase() {
		
		System.out.println("Customer Name :");
		details.cName=scan.nextLine();
		System.out.println("Customer Number :");
		details.mobileNo=scan.nextInt();
		System.out.println("Mobile Name :");
		details.mobileName=scan.nextLine();
		System.out.println("Model Number :");
		details.modelNO=scan.nextLine();
		System.out.println("Brand Name :");
		details.brand=scan.nextLine();
		System.out.println("Quantity :");
		details.quantity=scan.nextInt();

		
	}

	@Override
	public void search(String mobile) {
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","vishnu1119");
			System.out.println("connected");
			Statement s=con.createStatement();
			ResultSet rS=s.executeQuery("select * from mobiles");
			System.out.println(rS.next());
			
			while(!(rS.next()))
			{
				
//				String n1=rS.getString("modelno");
//				System.out.println(n1);
//				if(mobile==n1)
//				{
//					ResultSet rs=s.executeQuery("select * from mobiles where modelno='"+n1+"'");
//					System.out.println(rs.next());
//					while(!(rs.next()))
//					{
//						System.out.println("x");
//						String a=rs.getString("modelno");
//						String v=rs.getString("mobilename");
//						int x=rs.getInt("quantity");
//						String y=rs.getString("os");
//						System.out.println(a);
//						System.out.println(v);
//						System.out.println(x);
//						System.out.println(y);
//					}
				}
				
//				else
//				{
//					System.out.println("no data");
//				}
				System.out.println(rS.next());
//				}
				s.close();
			rS.close();
			con.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void display() {
		
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","vishnu1119");
				PreparedStatement s=con.prepareStatement("select modelno from mobiles");
				ResultSet rS=s.executeQuery();
				System.out.println("connected");
				System.out.println(rS.next());
				if(!rS.next())
				{
				
					System.out.println("entered");
					
					String n=rS.getString(1);
//					String v=rS.getString(2);
//					int x=rS.getInt(2);
//					String y=rS.getString(3);
//					System.out.println(n);
//					System.out.println(v);
//					System.out.println(x);
					System.out.println(n);
					}
				s.close();	
				rS.close();
				con.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
	}
	public static void main(String[] args) {
		ServiceImpl si=new ServiceImpl();
//	si.search("C1210");
		si.display();
	}

}