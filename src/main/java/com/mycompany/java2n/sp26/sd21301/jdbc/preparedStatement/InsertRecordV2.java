package com.mycompany.java2n.sp26.sd21301.jdbc.preparedStatement;

import com.mycompany.java2n.sp26.sd21301.ass1.Student;
import com.mycompany.java2n.sp26.sd21301.jdbc.DatabaseConnectionManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class InsertRecordV2 {

    public static void main(String[] args) {

        DatabaseConnectionManager dcm = new DatabaseConnectionManager("java2N_sp26_sd21301", "sa", "123456");
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {

            connection = dcm.getConnection();

            String sql = """
                         INSERT INTO students(Id, Name, Age)
                         VALUES (?, ?, ?);
                         """;

            statement = connection.prepareStatement(sql);

            statement.setInt(1, 4);
            statement.setString(2, "Student 4");
            statement.setInt(3, 24);

            statement.executeUpdate();

            System.out.println("Done...");

        } catch (Exception e) {

            e.printStackTrace();
        } finally {

            // close
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
            if (statement != null) {
                try {
                    statement.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }

        }

    }

}
