package update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
public class change {

	public void update() {
		Scanner sc = new Scanner(System.in);
		char next; 	
    	do {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student_Database", "root","root");
			Statement stm = con.createStatement();
			
			    System.out.println("What you have to update !");
		        System.out.println("1.Update Student Details with sepecific Reg-no !");
		        System.out.println("2.Rename Table Name !");
		        System.out.println("3.Rename Column Name !");
	
		        int n =sc.nextInt();

		        switch (n){

		            case 1:{
		                System.out.println("Enter Reg-No");
		                sc.nextLine();
		                String d = sc.next();
		                System.out.println("Enter column Name");
		                sc.nextLine();
		                String c = sc.next();
		                c.toLowerCase();
		                System.out.println("Enter column value");
		                sc.nextLine();
		                String e = sc.next();
		                if((c == "Reg_No") || (c == "Name") || (c == "Email") || (c == "DOB") || (c == "Age") || (c == "Community") || (c == "Nationality") || (c == "Mobile_No") || (c == "Parents_Mobile") || (c == "Medium_of_instruction") || (c == "Address") || (c == "SSLC") || (c == "HSC")){
		                    String rename = "update Student_Details set "+c+" = '"+e+"' where Reg_No="+ d;
		                    stm.executeUpdate(rename);
		                }
		                break;
		            }

		            case 2:{		      
		                System.out.println("Enter New Name");
		                sc.nextLine();
		                String c = sc.next();
		                String truncate = "alter table Student_Details rename "+ c;
		                stm.executeUpdate(truncate);
		                break;
		            }

		            case 3:{
		                System.out.println("Enter Column Name");
		                sc.nextLine();
		                String c = sc.next();
		                c.toLowerCase();
		                System.out.println("Enter New Name");
		                sc.nextLine();
		                String d = sc.next();
		                if((c == "Reg_No") || (c == "Nmae") || (c == "Email") || (c == "DOB") || (c == "Age") || (c == "Community") || (c == "Nationality") || (c == "Mobile_No") || (c == "Parents_Mobile") || (c == "Medium_of_instruction") || (c == "Address") || (c == "SSLC") || (c == "HSC")){
		                    String rename = "update Student_Details set " +c+ " = "+ d;
		                    stm.executeUpdate(rename);
		                }
		                break;
		            }
			    }
		        System.out.println("Do you want to see table !?");
		        sc.nextLine();
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
