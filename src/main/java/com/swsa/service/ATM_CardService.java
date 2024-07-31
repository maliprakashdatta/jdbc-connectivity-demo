
package com.swsa.service;
import java.sql.SQLException;
import java.util.Scanner;
import com.swsa.model.ATM_Card;
import com.swsa.repository.ATM_CardRepository;
public class ATM_CardService {

    private static final ATM_CardRepository ATM_CARD_REPOSITORY = new ATM_CardRepository();
    //private static final AddressRepository ADDRESS_REPO = new  AddressRepository();
    public void insertatm_cardServices() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pls enter card_id:");
        int card_id = Integer.parseInt(scanner.nextLine());

        System.out.println("Pls enter card_no:");
        int card_no = Integer.parseInt(scanner.nextLine());

        System.out.println("Pls enter account_no:");
        int account_no= Integer.parseInt(scanner.nextLine());

        System.out.println("Pls enter  customer_name:");
        String customer_name = scanner.nextLine();

        System.out.println("Pls enter cvv:");
        int cvv = Integer.parseInt(scanner.nextLine());

        System.out.println("Pls enter card_type:");
        String card_type = scanner.nextLine();

        //Address address = ADDRESS_REPO.retrieveAddress(addressId);
        ATM_Card atmCard = new  ATM_Card(card_id, card_no,account_no,customer_name,cvv,card_type);

        try {
            if (ATM_CARD_REPOSITORY.insertStudent(atmCard)) {
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

