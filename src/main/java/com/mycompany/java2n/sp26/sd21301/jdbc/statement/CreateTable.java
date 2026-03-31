package com.mycompany.java2n.sp26.sd21301.jdbc.statement;

import com.mycompany.java2n.sp26.sd21301.jdbc.DatabaseConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class CreateTable {

    public static void main(String[] args) {

        DatabaseConnectionManager dcm = new DatabaseConnectionManager("java2N_sp26_sd21301", "sa", "123456");

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {

            connection = dcm.getConnection();

            statement = connection.createStatement();

            String sql = """
                         CREATE TABLE students(
                            Id INT NOT NULL,
                            Name NVARCHAR(30) NOT NULL,
                            Age INT NOT NULL,
                            PRIMARY KEY (Id)
                         );
                         """;

            statement.execute(sql);

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
