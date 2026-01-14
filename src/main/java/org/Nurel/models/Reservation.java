package org.Nurel.models;

import java.time.LocalDateTime;

public class Reservation {
    private static int idCounter = 1;

    private int id;
    private String guestName;
    private Table table;
    private LocalDateTime dateTime;

    public Reservation(String guestName, Table table, LocalDateTime dateTime) {
        this.id = idCounter++;
        this.guestName = guestName;
        this.table = table;
        this.dateTime = dateTime;
    }

    public int getId() {
        return id;
    }

    public String getGuestName() {
        return guestName;
    }

    public Table getTable() {
        return table;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    @Override
    public String toString() {
        return "Reservation №" + id + ": " + guestName + " -> " + table + " on " + dateTime;
    }
}
