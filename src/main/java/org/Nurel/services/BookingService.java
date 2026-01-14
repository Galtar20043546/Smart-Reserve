package org.Nurel.services;

import org.Nurel.models.Reservation;
import org.Nurel.models.Table;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class BookingService {
    // 1. In-memory database (while the program is running)
    private List<Table> tables = new ArrayList<>();
    private List<Reservation> reservations = new ArrayList<>();

    // 2. Method: Add table to the restaurant
    public void addTable(Table table){
        tables.add(table);
        System.out.println("LOG: added " + table);
    }

    public boolean reserveTable(String guestName, int tableId, LocalDateTime dateTime){
        // 1. Table search
        Table foundTable = null;
        for (Table t: tables){
            if (t.getId() == tableId){
                foundTable = t;
                break;
            }
        }

        if (foundTable != null){
            Reservation newReservation = new Reservation(guestName, foundTable, dateTime);

            reservations.add(newReservation);

            System.out.println("✅ SUCCESS: Reservation created for " + guestName);
            return true;
        } else {
            System.out.println("❌ ERROR: Table with ID " + tableId + " doesn't exist.");
            return false;
        }
    }

    public void printAllReservations() {
        // Просто пробегаем по списку и печатаем каждую бронь
        for (Reservation r : reservations) {
            System.out.println(r);
        }
    }
}
