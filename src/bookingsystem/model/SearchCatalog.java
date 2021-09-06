package bookingsystem.model;

import bookingsystem.interfaces.Search;
import bookingsystem.interfaces.SearchableItem;

import java.util.List;
import java.util.Map;

public class SearchCatalog implements Search {
    Map<String, List<SearchableItem>> moviesToCinemaHall,citytoMovies,cinemaToShows;

    @Override
    public List<SearchableItem> searchByMovie(String movieName) {
        return moviesToCinemaHall.get(movieName);
    }

    @Override
    public List<SearchableItem> searchByCity(String city) {
        return citytoMovies.get(city);
    }

    @Override
    public List<SearchableItem> searchByCinema(String cinema) {
        return cinemaToShows.get(cinema);
    }
}
