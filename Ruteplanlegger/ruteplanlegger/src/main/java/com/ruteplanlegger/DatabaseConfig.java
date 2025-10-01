package com.ruteplanlegger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConfig {

    // ===== Database properties ===== //
    private static final String DB_NAME = "rutenett_db";
    private static final String DB_HOST = "localhost";
    private static final String DB_PORT = "3306";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "";
    private static final String DB_URL = "jdbc:mysql://" + DB_HOST + ":" + DB_PORT + "/" + DB_NAME;

    // ===== Getters ===== //
    public static String getDbUrl() { return DB_URL; }
    public static String getDbUsername() { return DB_USERNAME; }
    public static String getDbName() { return DB_NAME; }
    public static String getDbHost() { return DB_HOST; }
    public static String getDbPort() { return DB_PORT; }
    public static String getDbPassword() { return DB_PASSWORD; }
    
    // ===== Database Connection ===== //
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(getDbUrl(), getDbUsername(), getDbPassword());
    }
    
    // ===== Test Connection ===== //
    public static boolean testConnection() {
        try (Connection conn = getConnection()) {
            System.out.println("Database fungerer!");
            return true;
        } catch (SQLException e) {
            System.out.println("Database feil: " + e.getMessage());
            return false;
        }
    }

    // ===== Close Resources (Unngå memory leaks) ===== //
    public static void closeResources(Connection conn, Statement stmt, ResultSet rs) {
        try {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            System.err.println("Feil ved lukking: " + e.getMessage());
        }
    }

    // ===== Database Info ===== //
    public static String showDatabaseInfo() {
        return "===== Database Info =====\n" +
               "Host: " + DB_HOST + "\n" +
               "Port: " + DB_PORT + "\n" +
               "Name: " + DB_NAME + "\n" +
               "Username: " + DB_USERNAME + "\n" +
               "=========================";
    }
}
