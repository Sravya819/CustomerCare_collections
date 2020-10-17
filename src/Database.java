/**
 * 
 */

/**
 * @author asravya
 *
 */
public class Database {

	Customer [] customer_list;

	public Database() {
		super();
		// TODO Auto-generated constructor stub
		
		customer_list = new Person[3];
		
		/*
		Complaint [] c1 = new Complaint[3];
		c1[0] = new Complaint(1, "t1", "d1", 0, 1);
		c1[1] = new Complaint(2, "t2", "d2", 0, 1);
		c1[2] = new Complaint(3, "t3", "d3", 0, 1);
		*/
		
		Complaint [] c1 = {new Complaint(1, "title1", "description1", 0, 1), new Complaint(2, "title2", "description2", 0, 1), new Complaint(3, "title3", "description3", 0, 1)};
		Complaint [] c2 = {new Complaint(25, "title25", "description25", 0, 2), new Complaint(35, "title35", "description35", 0, 2)};
		Complaint [] c3 = {new Complaint(10, "title10", "description10", 0, 3)};
		
		customer_list[0] = new Person(1, "CustomerOne", c1);
		customer_list[1] = new Person(2, "CustomerTwo", c2);
		customer_list[2] = new Person(3, "CustomerThree", c3);
		
	}
	
	public void displayCustomers() {
		
		System.out.println("Name : CustomerOne, ID : 1");
		System.out.println("Name : CustomerTwo, ID : 2");
		System.out.println("Name : CustomerThree, ID : 3");
		
	}
	
	public void displayComplaints(int id) {
		
		System.out.println("Customer " + id + " made");
		
		if (id == 1) {
			System.out.println("Complaint 1 as description1");
			System.out.println("Complaint 2 as description2");
			System.out.println("Complaint 3 as description3");
		}
		
		else if (id == 2) {
			System.out.println("Complaint 1 as description25");
			System.out.println("Complaint 2 as description35");
		}
		
		else if (id == 3) {
			System.out.println("Complaint 1 as description10");
		}
		
	}
	
	public void displayStatus(int id) {
		
		Complaint c = new Complaint();
		int ch = c.status;
		
		if (ch == 0) {
			System.out.println("Under process");
		}
		
		else if (ch == 1) {
			System.out.println("Complete");
		}
		
	}
	
}
