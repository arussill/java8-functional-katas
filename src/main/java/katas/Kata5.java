package katas;

import model.Movie;
import util.DataUtil;

import java.util.List;

/*
    Goal: Retrieve the largest rating using reduce()
    DataSource: DataUtil.getMovies()
    Output: Double
*/
public class Kata5 {
    public static Double execute() {
        List<Movie> movies = DataUtil.getMovies();
        return movies.stream()
                .reduce((mayor, menor) -> mayor.getRating() > menor.getRating() ? mayor : menor).get().getRating()
        ;
    }
}
