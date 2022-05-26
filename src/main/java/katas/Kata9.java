package katas;

import model.InterestingMoment;
import model.MovieList;
import util.DataUtil;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
    Goal: Retrieve each video's id, title, middle interesting moment time, and smallest box art url
    DataSource: DataUtil.getMovies()
    Output: List of ImmutableMap.of("id", 5, "title", "some title", "time", new Date(), "url", "someUrl")
*/
public class Kata9 {
    public static List<Map> execute() {
        List<MovieList> movieLists = DataUtil.getMovieLists();

        return movieLists.stream()
                .flatMap(peliculas -> peliculas.getVideos().stream()
                        .map(peli -> Map.of(
                                "id", peli.getId(),
                                "title", peli.getTitle(),
                                "time: ", peli.getInterestingMoments().stream()
                                        .map(InterestingMoment::getTime),
                                "box", peli.getBoxarts().stream()
                                        .reduce((mayor, menor) -> mayor.getWidth() * mayor.getHeight() > menor.getWidth() * menor.getHeight() ? mayor : menor)
                        )))
                .collect(Collectors.toList());
    }
}
