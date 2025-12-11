import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    private ArrayList<Contact> contacts;
    Scanner sc;

    public AddressBook() {
        contacts = new ArrayList<Contact>();
        sc = new Scanner(System.in);
    }

    // UC1: Add Contact
    public void addContact() {
        System.out.print("Enter First Name: ");
        String f = sc.nextLine();
        System.out.print("Enter Last Name: ");
        String l = sc.nextLine();
        System.out.print("Enter Address: ");
        String a = sc.nextLine();
        System.out.print("Enter City: ");
        String c = sc.nextLine();
        System.out.print("Enter State: ");
        String s = sc.nextLine();
        System.out.print("Enter ZIP: ");
        String z = sc.nextLine();
        System.out.print("Enter Phone: ");
        String p = sc.nextLine();
        System.out.print("Enter Email: ");
        String e = sc.nextLine();

        contacts.add(new Contact(f, l, a, c, s, z, p, e));
        System.out.println("Contact added successfully.\n");
        System.out.print("Do you want to add another contact? (yes/no): ");
//        String choice = sc.nextLine();
//
//        if (!choice.equalsIgnoreCase("yes")) {
//            return;
//        }
        String choice=sc.nextLine();
        if(choice.equalsIgnoreCase("yes"))
        {
            AddressBook b = new AddressBook();
            b.addContact();
            return;
        }
    }
    public void editContact() {

        System.out.print("Enter First Name of contact to edit: ");
        String name = sc.nextLine();

        for (Contact c : contacts) {
            if (c.getFirstName().equalsIgnoreCase(name)) {

                System.out.println("Enter new Address: ");
                String a = sc.nextLine();
                System.out.println("Enter new City: ");
                String ci = sc.nextLine();
                System.out.println("Enter new State: ");
                String st = sc.nextLine();
                System.out.println("Enter new ZIP: ");
                String z = sc.nextLine();
                System.out.println("Enter new Phone: ");
                String p = sc.nextLine();
                System.out.println("Enter new Email: ");
                String e = sc.nextLine();

                c.updateDetails(a, ci, st, z, p, e);
                System.out.println("Contact updated successfully.\n");
                return;
            }
        }
        System.out.println("Contact not found.\n");
    }
    public void deleteContact()
    {
        System.out.println("Enter First Name of contact to delete: ");
        String name=sc.nextLine();
        for(Contact c:contacts) {
            if (c.getFirstName().equalsIgnoreCase(name)) {
                contacts.remove(c);
                System.out.println("Contact deleted successfully.\n");
                return;
            }
        }
        System.out.println("Contact not found.\n");
    }
    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts found.\n");
            return;
        }

        for (Contact c : contacts) {
            System.out.println(c);
        }
    }
}
