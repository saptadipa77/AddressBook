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
                default:
                    System.out.println("Invalid choice.\n");
            }
        }
    }
}
