
package com.swsa.repository;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.swsa.model.ATM_Card;
import com.swsa.service.ConnectionService;

public class ATM_CardRepository
{

    private static Connection connection = null;

    private void initConnection() throws SQLException {
        if (connection == null || connection.isClosed()) {
            connection = new ConnectionService().getConnection();
        }
    }

    public List<ATM_Card> retrieveATM_Card() {
        List<ATM_Card> ATM_Card = new ArrayList<>();
        // Use the connection to execute SQL queries and interact awith the database
        try {
            this.initConnection();

            // Your database operations here...
            Statement statement = connection.createStatement();
            ResultSet ResultSet1 = statement.executeQuery("SELECT * FROM ATM_Card");

            // Iterate over the result set
            while (ResultSet1.next()) {
                int card_id= ResultSet1.getInt("card_id");
                int card_no=ResultSet1.getInt("card_no");
                int  account_no=ResultSet1.getInt(" account_no");
                String customer_name=ResultSet1.getString("customer_name");
                int cvv=ResultSet1.getInt("cvv");
                String card_type=ResultSet1.getString("card_type");

                // Do something with the data, e.g., print it
                ATM_Card atmCard = new ATM_Card(card_id,card_no, account_no,customer_name,cvv,card_type);
                ATM_Card.add(atmCard);
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
        return ATM_Card;
    }

    // Method to update user data into the database

    public boolean insertStudent(ATM_Card atmCard) throws SQLException {
        this.initConnection();
        String query = "INSERT INTO ATM_Card VALUES (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = connection. prepareStatement(query)) {
            preparedStatement.setInt(1,atmCard.getCard_id());
            preparedStatement.setInt(2 ,atmCard.getCard_id());
            preparedStatement.setInt(3,atmCard.getAccount_no());
            preparedStatement.setString(4,atmCard.getCustomer_name());
            preparedStatement.setInt(5,atmCard.getCvv());
            preparedStatement.setString(6,atmCard.getCard_type());
            //preparedStatement.setString(5, student.getGrade());
            System.out.println("inserting ATM Card  data to table: " + atmCard);

            int rowsInserted = preparedStatement.executeUpdate();

            return rowsInserted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
