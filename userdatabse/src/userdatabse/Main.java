package userdatabse;
import java.util.*;
import student.details;
import display.show;
import update.change;
import drop.delete;
public class Main {

	public static void main(String[] args) {
		
		boolean ne = true;
		while(ne) {
		   Scanner sc = new Scanner(System.in);
			System.out.println();
			System.out.println("*!*!*!*!*!*!*!* Welcome !*!*!*!*!*!*!*!*");
			System.out.println();
			System.out.println("1.details");
			System.out.println("2.show");
			System.out.println("3.update");
			System.out.println("4.delete");
			
			details obj = new details();
			show obj1 = new show();
			change obj2 = new change();
			delete obj3 = new delete();
			int a = sc.nextInt();
			switch(a) {
			case 1:{
			     obj.insert1();
			     break;
			}
			
			case 2:{
				obj1.show1();
				break;
			}
			
			case 3:{
				obj2.update();
				break;
			}
			
			case 4:{
				obj3.remove();
				break;
			}
			}
		System.out.println("Do you want to go Back!");
		char s = sc.next().charAt(0);
		if(s=='n') {
			ne=false;
		}
		}
	}
}
