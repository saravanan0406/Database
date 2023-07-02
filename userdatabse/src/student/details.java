package student;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;


public class details{
    public void insert1(){
    	Scanner sc = new Scanner(System.in);
    	Student obj = new Student();
        char next; 	
    	do {
    	try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student_Database", "root","root");
			Statement stm = con.createStatement();
			System.out.println("Enter Register Number: ");
			int reg = sc.nextInt();
			System.out.println("Enter Student Name: ");
			sc.nextLine();
			String name =sc.nextLine();
			System.out.println("Enter E-Mail Id: ");
			String email =sc.nextLine();
			System.out.println("Enter Date-Of-Birth: ");
			String dob =sc.nextLine();
			System.out.println("Enter Age: ");
			int age  =sc.nextInt();
			System.out.println("Enter Community: ");
			sc.nextLine();
	     	String community =sc.nextLine();
			System.out.println("Enter Nationality: ");
			String nationality =sc.nextLine();
			System.out.println("Enter Mobile-No: ");
			String mobile =sc.nextLine();
			System.out.println("Enter Parent's-Mobile-No: ");
			String pmobile =sc.nextLine();
			System.out.println("Enter Medium of Instruction: ");
			String medium =sc.nextLine();
			System.out.println("Enter Address: ");
			String address =sc.nextLine();
			System.out.println("Enter SSLC: ");
			String sslc =sc.nextLine();
			System.out.println("Enter HSC: ");
			String hsc =sc.nextLine();

	        obj.setReg(reg);
	        obj.setName(name);
	        obj.setEmail(email);
	        obj.setDob(dob);
	        obj.setAge(age);
	        obj.setCom(community);
	        obj.setNational(nationality);
	        obj.setMobile(mobile);
	        obj.setPmobile(pmobile);
	        obj.setMedium(medium);
	        obj.setAdress(address);
	        obj.setSslc(sslc);
	        obj.setHsc(hsc);
		    String insert = "insert into Student_Details (Reg_no,Name,Email,DOB,Age,Community,Nationality,Mobile_No,Parents_Mobile,Medium_of_instruction,Address,SSLC,HSC) values ("+reg+",'"+name+"','"+email+"','"+dob+"',"+age+",'"+community+"','"+mobile+"','"+pmobile+"','"+nationality+"','"+medium+"','"+address+"','"+sslc+"','"+hsc+"')";
			stm.executeUpdate(insert);
			ResultSet  res = stm.executeQuery("select * from Student_Details");
			while(res.next()) {
				System.out.println(res.getString(1)+"  "+res.getString(2)+"  "+res.getString(3)+"  "+res.getString(4)+"  "+res.getString(5)+"  "+res.getString(6)+"  "+res.getString(7)+"  "+res.getString(8)+"  "+res.getString(9)+"  "+res.getString(10)+"  "+res.getString(11)+"  "+res.getString(12)+"  "+res.getString(13));
			}
    	}
    	catch(Exception e) {
			System.out.println(e.toString());
		}
    	System.out.println("Inserted Succesfully");
    	System.out.println("Next student");
        next = sc.next().charAt(0);
    	}
    	while(next=='y' || next=='Y'); 
    }
}
    	
class Student{
    private int reg, age;
    String name, email, com, national, mobile, pmobile, medium, adress, sslc, hsc,dob;
  

    public int getReg() {
        return reg;
    }

    public void setReg(int reg) {
        this.reg = reg;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getCom() {
        return com;
    }

    public void setCom(String com) {
        this.com = com;
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPmobile() {
        return pmobile;
    }

    public void setPmobile(String pmobile) {
        this.pmobile = pmobile;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getSslc() {
        return sslc;
    }

    public void setSslc(String sslc) {
        this.sslc = sslc;
    }

    public String getHsc() {
        return hsc;
    }

    public void setHsc(String hsc) {
        this.hsc = hsc;
    }
}
    


