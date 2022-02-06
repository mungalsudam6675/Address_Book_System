package Address_Book_OOPS;

public class AddressBookMain {

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book");
		AddressBook addressBook = new AddressBook();
		addressBook.addContacts();
		addressBook.listPeople();

	}

}
