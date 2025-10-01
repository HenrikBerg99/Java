package com.ruteplanlegger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserService {

    public static String getUserFullname() {
        String result = "";
        
        try (Connection conn = DatabaseConfig.getConnection();
            PreparedStatement stmt = conn.prepareStatement("SELECT firstname, lastname FROM users")) {
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                String firstname = rs.getString("firstname");
                String lastname = rs.getString("lastname");
                result += "<li>" + firstname + " " + lastname + "</li>\n";
            }
            
        } catch (SQLException e) {
            result = "Feil: " + e.getMessage();
        }
        
        return result;
    }
}   
