package bookingsystem;

import java.sql.Time;

public class Show {
    String showId;
    String movieId;
    String cinemaHallId;
    Time time;

    float[][] priceLayout;

    public Show(Movie movie, CinemaHall hall) {
        this.showId = movie.name + hall.toString();
    }

    public float selectSeats(int[][] selectSeats){
        float cost = 0.0F;
        for(int i=0; i < selectSeats.length; i++){
            for(int j=0; j < selectSeats.length; j++){
                //Select seat and add cost
            }
        }
        return cost;
    }
}
