
package com.swsa.repository;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.swsa.model.OpenNewAccount;
import com.swsa.service.ConnectionService;

public class OpenNewAccountRepository {

    private static Connection connection = null;

    private void initConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            connection = new ConnectionService().getConnection();
        }
    }

    public List<OpenNewAccount> retrieverNewAccounts() {
        List<OpenNewAccount> openNewAccounts = new ArrayList<>();
        // Use the connection to execute SQL queries and interact with the database
        try {
            this.initConnection();

            // Your database operations here...
            Statement statement= connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM customer");

            // Iterate over the result set
            while (resultSet.next()) {
                int account_no=resultSet.getInt("account_no");
                String account_type = resultSet.getString("account_type");
                String last_name = resultSet.getString("last_name");
                String first_name = resultSet.getString("first_name");
                String father_name = resultSet.getString("father_name");
                String gender = resultSet.getString("gender");
                String address = resultSet.getString("address");
                String email_id = resultSet.getString("email_id");
                Long DOB = resultSet.getLong("DOB");
                int mobile_no=resultSet.getInt("mobile_no");
                String email = resultSet.getString("email");
                int pin_code = resultSet.getInt("pin_code");
                int aadhaar_no = resultSet.getInt("aadhaar_no");

                // Do something with the data, e.g., print it
              OpenNewAccount openNewAccount = new OpenNewAccount(account_no, account_type, last_name,first_name,father_name,gender,
                      address,email_id,DOB,mobile_no,pin_code,aadhaar_no);
                OpenNewAccount.add(openNewAccount);
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
        return openNewAccounts;
    }

    // Method to update user data into the database
    public boolean insertOpenNewAccount(OpenNewAccount OpenNewAccount) throws SQLException {
        this.initConnection();
        String query = "INSERT INTO student VALUES (?, ?, ?, ?, ?, ?,?, ?, ?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = connection. prepareStatement(query)) {
            preparedStatement.setInt(1, OpenNewAccount.getAccount_no());
            preparedStatement.setString(2, OpenNewAccount.getAccount_type());
            preparedStatement.setString(3, OpenNewAccount.getLast_name());
            preparedStatement.setString(4, OpenNewAccount.getFirst_name());
            preparedStatement.setString(5, OpenNewAccount.getFather_name());
            preparedStatement.setString(6, OpenNewAccount.getGender());
            preparedStatement.setString(7,OpenNewAccount.getAddress());
            preparedStatement.setString(8,OpenNewAccount.getEmail_id());
            preparedStatement.setLong(9,OpenNewAccount.getDOB());
            preparedStatement.setInt(10,OpenNewAccount.getMobile_no());
            preparedStatement.setInt(11,OpenNewAccount.getPin_code());
            preparedStatement.setInt(12,OpenNewAccount.getAadhaar_no());

            System.out.println("Creating Swami Samarth New Bank .. : " + OpenNewAccount);

            int rowsInserted = preparedStatement.executeUpdate();

            return rowsInserted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
