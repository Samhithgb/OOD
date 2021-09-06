package bookingsystem.model;

import bookingsystem.interfaces.SearchableItem;

public class CinemaHall implements SearchableItem {
    private String hallId;
    private String name;
    private Seats[][] layout;

    public Seats[][] getLayout() {
        return layout;
    }
}
