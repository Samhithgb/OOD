package bookingsystem;

import java.util.List;
import java.util.Map;

public class SearchCatalog implements Search{
    Map<String, List<CinemaHall>> moviesToCinemaHall;
    Map<String, List<Show>> citytoMovies;
    Map<String, List<Show>> cinemaToShows;

    @Override
    public List<CinemaHall> searchByMovie(String movieName) {
        return moviesToCinemaHall.get(movieName);
    }

    @Override
    public List<Show> searchByCity(String city) {
        return citytoMovies.get(city);
    }

    @Override
    public List<Show> searchByCinema(String cinema) {
        return cinemaToShows.get(cinema);
    }
}
