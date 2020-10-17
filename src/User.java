import java.util.Scanner;

/**
 * 
 */

/**
 * @author asravya
 *
 */
public class User {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int choice;
		
		Database db = new Database();
		Person p = new Person();

		System.out.println("Hello!!!\nWelcome to the XYZ CustomerCare Service.....");
		System.out.println("Enter your desired option......The Menu is shown below:");
		
		do {
			
			System.out.println("");
			
			System.out.println("1. View all customers by name with keyId");
			System.out.println("2. Select a customer using keyId to view all complaints launched by customer");
			System.out.println("3. Select a complaint to view its status");
			System.out.println("4. Launch a new complaint");
			System.out.println("5. Completion of using service");
			
			System.out.println("Enter your choice : ");
			
			choice = sc.nextInt();
			
			if (choice < 0 && choice > 5) {
				System.out.println("Invalid choice......Please enter a valid number");
				continue;
			}
			
			else {
				switch(choice) {
				
				case 1 : db.displayCustomers();
						 break;
						 
				case 2 : int i = sc.nextInt();
						 db.displayComplaints(i);
						 break;
						 
				case 3 : int id = sc.nextInt();
						 db.displayStatus(id);
						break;
						
				case 4 : p.launchComplaint();
						 break;
						 
				case 5 : System.out.println("Thank you for using our Customercare service");
						 break;
						 
				default : break;
				
				}
				
			}
			
		}while(choice != 5);
		
	}

}
