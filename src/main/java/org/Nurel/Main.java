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


        // Nurel want to reserve table №1 on 18:00 (It's OK)
        LocalDateTime timeNurel = LocalDateTime.of(2026, 1, 15, 18, 0);
        service.reserveTable("Nurel", 1, timeNurel);

        // Anna want to reserve same table on this time on 19:00 (But she gets ERROR)
        LocalDateTime timeAnna = LocalDateTime.of(2026,1, 15, 19, 0);
        service.reserveTable("Anna", 1,timeAnna);

        // Ivan tries to sit at the same table at 21:00 (It's okay, Nurel has already left)
        LocalDateTime timeIvan = LocalDateTime.of(2026, 1, 15, 21, 0);
        service.reserveTable("Ivan", 2, timeIvan);

        service.printAllReservations();
    }
}