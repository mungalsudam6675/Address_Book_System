package Address_Book_OOPS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
	List<Contact> people = new ArrayList<Contact>();

	public void addContacts() {
		Contact contact = new Contact();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Name:");
		String firstName = sc.nextLine();
		contact.setFirstName(firstName);

		System.out.println("Enter Last Name:");
		String lastName = sc.nextLine();
		contact.setLastName(lastName);

		System.out.println("Enter Adress:");
		String adress = sc.nextLine();
		contact.setAdress(adress);

		System.out.println("Enter city:");
		String city = sc.nextLine();
		contact.setCity(city);

		System.out.println("Enter state:");
		String state = sc.nextLine();
		contact.setState(state);

		System.out.println("Enter zip:");
		String zip = sc.nextLine();
		contact.setZip(zip);

		System.out.println("Enter phoneNumber:");
		String phoneNumber = sc.nextLine();
		contact.setPhoneNumber(phoneNumber);

		System.out.println("Enter email:");
		String email = sc.nextLine();
		contact.setEmail(email);

		people.add(contact);
		System.out.println("person created sucessfully");
	}

	public void listPeople() {
		if (people.isEmpty()) {
			System.out.println(" address book is empty.");
			return;
		}
		System.out.println("Address Book:");
		for (Contact element : people) {
			System.out.print(element.getFirstName());
		}

	}

	public void deletePerson() {
		Scanner sc = new Scanner(System.in);
         System.out.println("Enter the first name you want to remove.");
         String firstName = sc.nextLine();
         for(int i=0;i<people.size();i++) {
        	 if(people.get(i).getFirstName().equals(firstName)) {
        		 people.remove(people.get(i));
        		 System.out.println("person removed sucessfully");
        	 }
        	 else {
        		 System.out.println("person not found");
        	 }
        	 
         	}	
	}
}