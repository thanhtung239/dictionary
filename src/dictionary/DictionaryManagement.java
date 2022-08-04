/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dictionary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Thanh Tung Hoang
 */
public class DictionaryManagement {
    private static String DB_URL = "jdbc:mysql://localhost:3306/dictionary";
    private static String USER_NAME = "root";
    private static String PASSWORD = "";

    public static List<Dictionary> findAll() {
        List<Dictionary> wordList = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        try {
            connection = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
            
            /** Query. */
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from words");
            
            while (resultSet.next()) {
                Dictionary dic = new Dictionary(resultSet.getInt("id"),
                    resultSet.getString("word"), resultSet.getString("translate"),
                    resultSet.getString("example"));
                wordList.add(dic); 
            }
        } catch (SQLException ex) {
            Logger.getLogger(DictionaryManagement.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DictionaryManagement.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DictionaryManagement.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        return wordList;
    }
}
