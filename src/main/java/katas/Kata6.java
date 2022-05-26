package katas;

import model.BoxArt;
import model.Movie;
import util.DataUtil;

import java.util.Collection;
import java.util.List;


/*
    Goal: Retrieve the url of the largest boxart using map() and reduce()
    DataSource: DataUtil.getMovieLists()
    Output: String
*/
public class Kata6 {
    public static String execute() {
        List<Movie> movies = DataUtil.getMovies();

        return movies.stream()
                .map(Movie::getBoxarts)
                        .flatMap(Collection::stream)
                        .reduce((mayor, menor) -> mayor.getWidth() > menor.getWidth() ? mayor : menor)
                .map(BoxArt::getUrl).orElse("");
    }
}


