import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    private ArrayList<Contact> contacts;
    Scanner sc;

    public AddressBook() {
       ArrayList<Contact> contacts = new ArrayList<>();
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
    }
}
