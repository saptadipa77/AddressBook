import java.util.Scanner;

public class AddressBookNameMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program\n");
        AddressBook book = new AddressBook();
        //book.addContact();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Display Contacts");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    book.addContact();
                    break;
                case 2:
                    book.editContact();
                    break;
                case 3:
                    book.deleteContact();
                    return;
                case 4:
                    book.displayContacts();
                    return;
                case 5:
                    System.out.println("Thank you");
                    return;
                default:
                    System.out.println("Invalid choice.\n");
            }
        }
    }
}
