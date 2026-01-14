package org.Nurel;

import org.Nurel.models.Table;
import org.Nurel.models.Reservation;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // 1. Creating a pari of tables
        Table t1 = new Table(1, 4, "Window");
        Table t2 = new Table(2, 2, "VIP");

        // 2. Printing them
        System.out.println(t1);
        System.out.println(t2);

        // 3. Trying to create a new reservation(for today)
        Reservation r1 = new Reservation("Nurel Urdinov",t1,LocalDateTime.now());

        // 4. Printing the reservation
        System.out.println(r1);
    }
}