package com.ruteplanlegger;
import io.javalin.Javalin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class Main {

    // ===== Hjelpefunksjon for å laste HTML templates fra resources/templates ===== //
    private static String loadTemplate(String templateName) {
        try {
            InputStream is = Main.class.getResourceAsStream("/templates/" + templateName);
            return new String(is.readAllBytes(), StandardCharsets.UTF_8);
        } catch (Exception e) {
            return "<html><body><h1>Feil ved lasting av template: " + e.getMessage() + "</h1></body></html>";
        }
    }

    public static void main(String[] args) {

        // ===== Server Oppstart ===== //
        System.out.println("Starter Server...");
        System.out.println(DatabaseConfig.showDatabaseInfo());
        Javalin app = Javalin.create(config -> {
            config.staticFiles.add("/static"); //Rooter til CSS/JS fra resources/static
        }).start(7000);
        

        // ===== Ruter - Hovedside ===== //
        app.get("/", ctx -> {
            String html = loadTemplate("index.html");
            ctx.contentType("text/html; charset=utf-8").result(html);
        });

        // ===== Ruter - brukere ===== //
        app.get("/users", ctx -> {
            String template = loadTemplate("users.html");
            String html = template.replace("{{USER_FULLNAME}}", UserService.getUserFullname());
            ctx.contentType("text/html; charset=utf-8").result(html);
        });
        
        // ===== Database Test ===== //
        System.out.println("Tester database tilkobling...");
        if (DatabaseConfig.testConnection()) {
            System.out.println("Database tilkoblet!");
        } else {
            System.out.println("Database tilkobling feilet!");
        }


    }

}


