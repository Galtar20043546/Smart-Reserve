package org.Nurel.models;

public class Table {
    private int id;          // Unique number of table
    private int capacity;    // Number of seats(2, 4, 6...)
    private String zone;     // Zones: "Main Hall", "VIP", "Window"

    public Table(int id, int capacity, String zone) {
        this.id = id;
        this.capacity = capacity;
        this.zone = zone;
    }

    public int getId() {
        return id;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getZone() {
        return zone;
    }

    @Override
    public String toString() {
        return "Table №" + id + " (" + zone + ", seat: " + capacity + ")";
    }
}
