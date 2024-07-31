package com.swsa;
import com.swsa.service.*;

import java.io.IOException;
import java.util.Scanner;

public class App {

    private static final ConnectionService connectionService = new ConnectionService();

    public static void main(String[] args) throws IOException {
        StudentService studentService = new StudentService();
        AddressService addressService = new AddressService();
        ATM_CardService atmCardService=new ATM_CardService();
        OpenNewAccountService openNewAccountService =new OpenNewAccountService();

        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            //Runtime.getRuntime().exec("reset");
            System.out.println("*** SWAMISAMARTH BANK MANAGEMENT SYSTEM ***");
            System.out.println("_______________________________");
            System.out.println("Select operation:");
            System.out.println("1. Create loan Account");
            System.out.println("2. Applying ATM Card");
            System.out.println("3. Opening For New Account");
            System.out.println("4. Deposit Amount");
            System.out.println("5. Withdraw Amount");
            System.out.println("0. Exit");

            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Performing CREATE operation on Student");
                    studentService.insertStudent();
                    break;
                case 2:
                    System.out.println("Applying For ATM Card");
                    atmCardService.insertatm_cardServices();
                    break;
                case 3:
                    System.out.println("Enter Data For Opening  New Account ");
                    openNewAccountService.insertOpenNewAccount();
                    break;
                case 4:
                    System.out.println("Performing DELETE operation on Employee");
                    // Add your delete logic here
                    break;
                case 5:
                    System.out.println("Performing RETRIEVE operation on Address..");

                    addressService.retrieveAddresses().forEach(address -> {
                        System.out.println("Address ID: " + address.getAddressId() + ", City: " + address.getCity());
                    });
                    break;
                case 0:
                    System.out.println("Exiting program");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 0);
        scanner.close();
    }
}