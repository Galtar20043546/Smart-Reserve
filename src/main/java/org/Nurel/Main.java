package org.Nurel;

import org.Nurel.models.Table;
import org.Nurel.services.BookingService;
import java.time.LocalDateTime;
import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        System.out.println("\uD83D\uDE80  Launching the program SmartReserve...");

        // 1. Creating service
        BookingService service = new BookingService();

        // 2. Uploading tables from DataBase (PostgreSQL)
        System.out.println("\uD83D\uDD0C Connecting to the DB and loading tables...");
        service.loadTablesFromDB();

        // 3. Testing the logic of reservation
        // Script 1: Nurel reserving the table №1 ---
        System.out.println("\n--- Attempt 1: Nurel (18:00) ---");
        LocalDateTime timeNurel = LocalDateTime.of(2026, 1, 15, 18, 0);
        service.reserveTable("Nurel", 1, timeNurel);

        // Script 2: Anna tries to sit at the same table at 19:00 ---
        // (We expect an error because the table is occupied until 20:00)
        System.out.println("\n--- Attempt 1: Anna (19:00, same table) ---");
        LocalDateTime timeAnna = LocalDateTime.of(2026,1,15,19,0);
        service.reserveTable("Anna", 1, timeAnna);

        // --- Script 3: Ivan books Table 2 (VIP) ---
        System.out.println("\n--- Attempt 3: Ivan (20:00, different table) ---");
        LocalDateTime timeIvan = LocalDateTime.of(2026, 1, 15, 20, 0);
        service.reserveTable("Ivan", 2, timeIvan);

        System.out.println("\n\uD83D\uDCCA Final report:");
        service.printAllReservations();
    }
}