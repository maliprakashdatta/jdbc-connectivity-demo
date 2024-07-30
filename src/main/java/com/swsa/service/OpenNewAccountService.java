
package com.swsa.service;
import java.sql.SQLException;
import java.util.Scanner;
import com.swsa.model.ATM_Card;
import com.swsa.model.OpenNewAccount;
import com.swsa.repository.ATM_CardRepository;
import com.swsa.repository.OpenNewAccountRepository;

public class OpenNewAccountService {

    private static final OpenNewAccountRepository openNewAccountRepository = new OpenNewAccountRepository();

    //private static final AddressRepository ADDRESS_REPO = new  AddressRepository();
    public static void insertOpenNewAccount() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pls enter account_no:");
        int account_no = Integer.parseInt(scanner.nextLine());

        System.out.println("Pls enter account_type:");
        String account_type = scanner.nextLine();

        System.out.println("Pls enter last_name:");
        String last_name= scanner.nextLine();

        System.out.println("Pls enter first_name:");
        String first_name= scanner.nextLine();

        System.out.println("Pls enter father_name:");
        String father_name= scanner.nextLine();

        System.out.println("Pls enter gender:");
        String gender= scanner.nextLine();

        System.out.println("Pls enter address:");
        String address= scanner.nextLine();

        System.out.println("Pls enter email_id:");
        String email_id= scanner.nextLine();

        System.out.println("Pls enter DOB:");
        Long DOB= scanner.nextLong();

        System.out.println("Pls enter mobile_no:");
        int mobile_no = Integer.parseInt(scanner.nextLine());

        System.out.println("Pls enter pin_code");
        int pin_code = Integer.parseInt(scanner.nextLine());

        System.out.println("Pls enter aadhaar_no");
        int aadhaar_no = Integer.parseInt(scanner.nextLine());

        //Address address = ADDRESS_REPO.retrieveAddress(addressId);
        OpenNewAccount openNewAccount = new OpenNewAccount(account_no, account_type, last_name,first_name,father_name,gender,
                address,email_id,DOB,mobile_no,pin_code,aadhaar_no);

        try {
            if (openNewAccountRepository.insertOpenNewAccount(openNewAccount)) {
                System.out.println("ATM Card inserted successfully!");
            } else {
                System.out.println("Failed to insert ATM Card.");
            }
        } catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
    }
}

