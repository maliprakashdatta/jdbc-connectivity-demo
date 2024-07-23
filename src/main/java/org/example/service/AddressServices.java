

package org.example.service;
import java.util.Scanner;
import org.example.model.Address;
import org.example.model.Student;
import org.example.repository.AddressRepository;
import java.sql.SQLException;
import java.util.List;
public class AddressServices {

    private static final AddressRepository STUDENT_REPO = new AddressRepository();

    public List<Address> retrieveAddresses() {
        return STUDENT_REPO.retrieveAddresses();
    }

    public void insertStudent() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pls enter address id:");
        int studentId = Integer.parseInt(scanner.nextLine());
        System.out.println("Pls enter city :");
        String name = scanner.nextLine();

        System.out.println("Pls enter student Address Id:");
        int addressId = Integer.parseInt(scanner.nextLine());
        System.out.println("Pls enter student percentage:");
        float percentage = Float.parseFloat(scanner.nextLine());
        System.out.println("Pls enter student grade:");
        String grade = scanner.nextLine();

        Address address = STUDENT_REPO.retrieveAddress(addressId);
        Address student = new Address(addressId, address.getCity());

        try {
            if (STUDENT_REPO.insertStudent(student)) {
                System.out.println("Employee inserted successfully!");
            } else {
                System.out.println("Failed to insert employee.");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}

