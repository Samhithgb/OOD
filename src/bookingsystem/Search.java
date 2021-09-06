package bookingsystem;

import java.util.List;

public interface Search {
    public List<CinemaHall> searchByMovie(String movieName);
    public List<Show> searchByCity(String city);
    public List<Show> searchByCinema(String cinema);
}
