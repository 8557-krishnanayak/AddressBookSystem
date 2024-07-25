import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");
        Scanner sc = new Scanner(System.in);
        ArrayList<Contact> myContactList = new ArrayList<>();

        boolean quite = false;
        while (!quite) {
            System.out.println("Menu Driven Program\n" +
                    "1. Add Contact\n" +
                    "2. Edit Contact\n" +
                    "3. Delete Contact\n" +
                    "4. Display Contact List\n" +
                    "5. Exit");

            String choice = sc.nextLine();
            switch (choice) {
                case "1" -> {
                    System.out.println("Enter First Name: ");
                    String firstname = sc.nextLine();
                    System.out.println("Enter Last Name: ");
                    String lastname = sc.nextLine();
                    System.out.println("Enter Phone Number: ");
                    String phoneNumber = sc.nextLine();
                    System.out.println("Enter Address: ");
                    String address = sc.nextLine();
                    System.out.println("Enter Zip Name: ");
                    String zip = sc.nextLine();
                    System.out.println("Enter City Name: ");
                    String city = sc.nextLine();
                    System.out.println("Enter Email Name: ");
                    String email = sc.nextLine();
                    Contact c = new Contact(firstname, lastname, phoneNumber, address, zip, city, email);
                    myContactList.add(c);
                }

                case "2" -> {
                    System.out.println("Enter a number to User Name");
                    String personName = sc.nextLine();


                    System.out.println("Enter number of the field you want to change:\n" +
                            "1. first Name\n" +
                            "2. last Name\n" +
                            "3. address\n" +
                            "4. city\n" +
                            "5. state\n" +
                            "6. zip\n" +
                            "7. phone Number\n" +
                            "8. email");

                    String decide = sc.nextLine();

                    System.out.println("Enter the update text:");
                    String updateVal = sc.nextLine();

                    for (Contact c : myContactList) {
                        if (c.getFirstname().equals(personName)) {
                            editContact(c, decide, updateVal);
                            break;
                        }
                    }
                }

                case "3" -> deleteContact();


                case "4" -> displayContact(myContactList);

                case "5" -> {
                    System.out.println("Exit");
                    sc.close();
                    quite = true;
                }
            }
        }
    }

    public static void editContact(Contact contact, String choice, String updateVal) {
        switch (choice) {
            case "1" -> contact.setFirstname(updateVal);
            case "2" -> contact.setLastname(updateVal);
            case "3" -> contact.setAddress(updateVal);
            case "4" -> contact.setCity(updateVal);
//            case "5" -> contact.setState(updateVal);
            case "6" -> contact.setZip(updateVal);
            case "7" -> contact.setPhoneNumber(updateVal);
            case "8" -> contact.setEmail(updateVal);
            default -> System.out.println("Invalid Input");
        }
    }


    public static void deleteContact() {
    }

    public static void displayContact(ArrayList<Contact> myContactList) {
        for (Contact c : myContactList) {
            System.out.println(c);
        }
    }
}