package org.example.repository;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import org.example.model.Address;
import org.example.service.ConnectionService;
public class AddressRepository {


    private static Connection connection = null;

    private void initConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            connection = new ConnectionService().getConnection();
        }
    }

    public List<Address> retrieveAddresses() {

        List<Address> addresses = new ArrayList<>();

        // Use the connection to execute SQL queries and interact with the database
        try {
            this.initConnection();
            // Your database operations here...
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM student");
            // Iterate over the result set
            while (resultSet.next()) {
                int id = resultSet.getInt("address_id"); // Replace "id" with your actual column name
                String city = resultSet.getString("city"); // Replace "city" with your actual column name
                // Do something with the data, e.g., print it
                Address address = new Address(id, city);
                addresses.add(address);
            }
        } catch (SQLException e) {
            System.err.println("SQL error: " + e.getMessage());
        } finally {
            // Close the connection when done
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.err.println("Error closing connection: " + e.getMessage());
                }
            }
        }
        return addresses;
    }

    public Address retrieveAddress(int addressId) {
        Address address = null;
        // Use the connection to execute SQL queries and interact with the database
        try {
            this.initConnection();
            // Your database operations here...
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM address where address_id = " + addressId);
            // Iterate over the result set
            while (resultSet.next()) {
                int id = resultSet.getInt("address_id"); // Replace "id" with your actual column name
                String city = resultSet.getString("city"); // Replace "city" with your actual column name
                // Do something with the data, e.g., print it
                address = new Address(id, city);
            }
        } catch (SQLException e) {
            System.err.println("SQL error: " + e.getMessage());
        } finally {
            // Close the connection when done
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    System.err.println("Error closing connection: " + e.getMessage());
                }
            }
        }
        return address;
    }

    public boolean insertStudent(Address address) throws SQLException {
        this.initConnection();
        String query = "INSERT INTO student VALUES (?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1,address.getAddressId());
            preparedStatement.setString(2,address.getCity());

            String Address;
            //System.out.println("inserting student data to table: " +Address);

            int rowsInserted = preparedStatement.executeUpdate();

            return rowsInserted > 0;
        } catch (SQLException e) {
            System.err.println("Error closing connection: " + e.getMessage());
        }
        return false;
    }
}

