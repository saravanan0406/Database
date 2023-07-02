package display;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class show{
	public  void show1() {
		Scanner sc = new Scanner(System.in);
		char next; 	
    	do {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student_Database", "root","root");
			Statement stm = con.createStatement();
			System.out.println("1.Diaplay Whole table !");
			System.out.println("2.Display specific Student");
			int a = sc.nextInt();
			switch (a) {
			case 1:{
				ResultSet  res = stm.executeQuery("select * from Student_Details");
			while(res.next()) {
				System.out.println(res.getString(1)+"  "+res.getString(2)+"  "+res.getString(3)+"  "+res.getString(4)+"  "+res.getString(5)+"  "+res.getString(6)+"  "+res.getString(7)+"  "+res.getString(8)+"  "+res.getString(9)+"  "+res.getString(10)+"  "+res.getString(11)+"  "+res.getString(12)+"  "+res.getString(13));
			}
			break;
			}
			
			case 2:{
				System.out.println("Enter Student Reg-no:");
				int re = sc.nextInt();
				ResultSet  res = stm.executeQuery("select * from Student_Details where Reg_No= " +re);
				while(res.next()) {
					System.out.println(res.getString(1)+"  "+res.getString(2)+"  "+res.getString(3)+"  "+res.getString(4)+"  "+res.getString(5)+"  "+res.getString(6)+"  "+res.getString(7)+"  "+res.getString(8)+"  "+res.getString(9)+"  "+res.getString(10)+"  "+res.getString(11)+"  "+res.getString(12)+"  "+res.getString(13));
				}
				break;
			}
			}
		}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		 System.out.println("Do you want try another option !");
		 next = sc.next().charAt(0);
    	}while(next=='y' || next=='Y'); 
	}

}
