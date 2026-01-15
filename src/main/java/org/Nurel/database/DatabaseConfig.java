package org.Nurel.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConfig {
    // 1. URL - name of out base
    private static final String URL = "jdbc:postgresql://localhost:5432/smart_reserve_db";

    private static final String USER = "postgres";

    private static final String PASSWORD = "azatnurel2017";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL,USER,PASSWORD);
    }
}
