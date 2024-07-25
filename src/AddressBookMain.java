import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");

        Scanner sc = new Scanner(System.in);
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
        String email= sc.nextLine();

        Contact c = new Contact(firstname,lastname,phoneNumber,address,zip,city,email);
        String print = c.toString();

        System.out.println(print);

        System.out.println("Enter a number to Edit the Number");
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

        String choice = sc.nextLine();

        System.out.println("Enter the update text:");
        String updateVal = sc.nextLine();

        editContact(c,choice,updateVal);

        print = c.toString();
        System.out.println("Updated the user name: "+ personName);
        System.out.println(print);



    }

//    public static Contact findByPersonName(String person){
//
//        return null;
//    }

    public static void editContact(Contact contact, String choice, String updateVal){
        switch (choice){
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
}