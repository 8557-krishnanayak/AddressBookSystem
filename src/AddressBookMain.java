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
    }
}