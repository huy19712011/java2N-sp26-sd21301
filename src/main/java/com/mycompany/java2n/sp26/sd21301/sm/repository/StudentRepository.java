package com.mycompany.java2n.sp26.sd21301.sm.repository;

import com.mycompany.java2n.sp26.sd21301.jdbc.DatabaseConnectionManager;
import com.mycompany.java2n.sp26.sd21301.sm.entity.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository {

    DatabaseConnectionManager dcm = new DatabaseConnectionManager("java2N_sp26_sd21301", "sa", "123456");

    String FIND_ALL_SQL = "SELECT * FROM students";
    String FIND_BY_ID_SQL = "SELECT * FROM students WHERE Id=?";
    String CREATE_SQL = "INSERT INTO students(Id, Name, Age) VALUES(?, ?, ?)";
    String UPDATE_SQL = "UPDATE students SET Name=, Age=? WHERE Id=?";
    String DELETE_SQL = "DELETE FROM students WHERE Id=?";

    //1.
    public List<Student> findAll() {

        List<Student> students = new ArrayList<>();

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {

            connection = dcm.getConnection();

            statement = connection.createStatement();

            resultSet = statement.executeQuery(FIND_ALL_SQL);

            while (resultSet.next()) {

                students.add(new Student(resultSet.getInt("Id"), resultSet.getString("Name"), resultSet.getInt("Age")));
            }


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

        return students;
    }

}
