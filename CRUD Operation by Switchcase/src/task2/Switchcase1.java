package task2;

import java.util.Scanner;

import task.User_Input;

public class Switchcase1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter 1 to insert data");
		System.out.println("enter 2 to update data");
		System.out.println("enter 3 to delete data");
		System.out.println("enter 4 to select data");
		System.out.println("enter 5 to selectall data");
		int a = sc.nextInt();

		switch (a) {
		case 1:
			System.out.println("insert method Called.....");
			Methods.insert();
			break;

		case 2:
			System.out.println("Update method Called.....");
			Methods.update();

			break;

		case 3:
			System.out.println("Delete method Called.....");
			Methods.delete();

			break;
		case 4:
			System.out.println("Select method Called.....");
			User_Input.select();
     System.out.println("Selected Data is here..........");
			break;
		case 5:
			System.out.println("Select all method Called.....");
			User_Input.selectall();
			System.out.println("  All Data select successfully...");
			break;
		}

	};

}
