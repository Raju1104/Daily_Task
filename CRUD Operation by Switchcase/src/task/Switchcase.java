package task;

import java.util.Scanner;

public class Switchcase {
	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
		
		 System.out.println("enter 1 to add data");
		 System.out.println("enter 2 to update data");
		 System.out.println("enter 3 to delete data");
		 System.out.println("enter 4 to select data");
		 System.out.println("enter 5 to selectall data");
		int a = sc.nextInt();
		
		switch (a) {
		case 1:
			System.out.println("Add method Called.....");
			User_Input.add();
			System.out.println(" Data  Added successfully ...");

			break;

		case 2:System.out.println("Update method Called.....");
			User_Input.update();
			System.out.println("Data  updated successfully...");
			break;

		case 3:System.out.println("Delete method Called.....");
			User_Input.delete();
			System.out.println(" Data  Deleted successfully...");
			break;
		case 4:System.out.println("Select method Called.....");
			User_Input.select();
			System.out.println("Selected data shown here...");
			break;
		case 5:System.out.println("Select all method Called.....");
			User_Input.selectall();
			System.out.println("  All Data select successfully...");
			break;
		}

	}

}
