package org.Nurel;

import org.Nurel.models.Table;
import org.Nurel.services.BookingService;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        BookingService service = new BookingService();

        service.addTable(new Table(1, 4, "Window"));
        service.addTable(new Table(2, 2, "VIP"));
        service.addTable(new Table(3, 6, "Main Hall"));

        System.out.println("\n--- Booking attempt ---");

        // Successful reservation
        service.reserveTable("Nurel", 1, LocalDateTime.of(2026,1,15,18,0));

        // Booking a non-existent table (error checking)
        service.reserveTable("Alex", 99, LocalDateTime.now());

        // Another successful booking
        service.reserveTable("Anna", 2, LocalDateTime.now());

        // 4. We output the result
        System.out.println("");
        service.printAllReservations();
    }
}