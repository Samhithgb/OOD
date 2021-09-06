package bookingsystem.interfaces;

import java.util.List;

public interface Search {
    public List<SearchableItem> searchByMovie(String movieName);
    public List<SearchableItem> searchByCity(String city);
    public List<SearchableItem> searchByCinema(String cinema);
}
