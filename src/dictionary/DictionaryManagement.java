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

    public static List<Dictionary> getAll() {
        List<Dictionary> wordList = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;

        try {
            connection = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);

            /**
             * Query.
             */
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from words");

            while (resultSet.next()) {
                Dictionary dic;
                dic = new Dictionary(resultSet.getInt("id"),
                        resultSet.getString("word"), resultSet.getString("translate"),
                        resultSet.getString("example"), resultSet.getString("example_translate"));
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

    public static List<Dictionary> search(String searchKey) {
        List<Dictionary> wordList = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;

        try {
            connection = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);

            /**
             * Query.
             */
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from words where word='" + searchKey + "'");

            while (resultSet.next()) {
                Dictionary dic;
                dic = new Dictionary(resultSet.getInt("id"),
                        resultSet.getString("word"), resultSet.getString("translate"),
                        resultSet.getString("example"), resultSet.getString("example_translate"));
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

    public static void insert(Dictionary word) {
        Connection connection = null;
        Statement statement = null;
        String newWord = word.getWord();
        String translate = word.getTranslate();
        String example = word.getExample();
        String exampleTranslate = word.getExampleTranslate();

        try {
            connection = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);

            /**
             * Query.
             */
            statement = connection.createStatement();
            String sql = "INSERT INTO words(word, translate, example, example_translate) "
                    + "VALUES('" + newWord + "', '"
                    + translate + "', '" + example + "', '" + exampleTranslate + "')";
            statement.executeUpdate(sql);
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
    }

    public static void edit(int wordIdEdit, Dictionary word) {
        Connection connection = null;
        Statement statement = null;
        String newWord = word.getWord();
        String translate = word.getTranslate();
        String example = word.getExample();
        String exampleTranslate = word.getExampleTranslate();
        try {
            connection = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
            statement = connection.createStatement();
            String sql = "update words set word='" + newWord
                    + "', translate='" + translate
                    + "', example_translate='" + exampleTranslate
                    + "', example='" + example
                    + "'where id=" + wordIdEdit;
            statement.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(DictionaryManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void delete(int wordId) {
        Connection connection = null;
        Statement statement = null;

        try {
            connection = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);

            /**
             * Query.
             */
            statement = connection.createStatement();
            String sql = "DELETE FROM words WHERE id = " + wordId;
            statement.executeUpdate(sql);
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
    }
}
