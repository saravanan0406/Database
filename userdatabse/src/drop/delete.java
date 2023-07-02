package drop;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class delete{

	public void remove() {
		Scanner sc = new Scanner(System.in);
		char next; 	
    	do {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student_Database", "root","root");
			Statement stm = con.createStatement();
			
	        System.out.println("     What you have to delete !   ");
	        System.out.println("1.Delete Entire Table !");
	        System.out.println("2.Delete Data in the table !");
	        System.out.println("3.Delete Specific Reg-no !");
	        System.out.println("4.Delete Specific column !");
	        
	        int n =sc.nextInt();

	        switch (n){

	            case 1:{
	                String drop = "drop table Student_Details";
	                stm.executeUpdate(drop);
	                break;
	            }

	            case 2:{
	                String truncate = "truncate table Student_Details";
	                stm.executeUpdate(truncate);
	                break;
	            }

	            case 3:{
	            	System.out.println("Enter Reg-No: ");
	                int reg = sc.nextInt();
	                String delete = " delete from Student_Details where Reg_No = " +reg;
	                stm.executeUpdate(delete);
	                break;
	            }

	            case 4:{
	                String col = sc.nextLine();
	                String alter = "alter table Student_Details drop column "+col;
	                stm.executeUpdate(alter);
	            }
	        }
	        System.out.println("Do you want to see table !?");
	        char s = sc.next().charAt(0);
	        if(s=='y') {
	        ResultSet  res = stm.executeQuery("select * from Student_Details");
			while(res.next()) {
				System.out.println(res.getString(1)+"  "+res.getString(2)+"  "+res.getString(3)+"  "+res.getString(4)+"  "+res.getString(5)+"  "+res.getString(6)+"  "+res.getString(7)+"  "+res.getString(8)+"  "+res.getString(9)+"  "+res.getString(10)+"  "+res.getString(11)+"  "+res.getString(12)+"  "+res.getString(13));
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
