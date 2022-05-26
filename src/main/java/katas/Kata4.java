package katas;

import model.MovieList;
import util.DataUtil;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


/*
    Goal: Retrieve id, title, and a 150x200 box art url for every video
    DataSource: DataUtil.getMovieLists()
    Output: List of ImmutableMap.of("id", "5", "title", "Bad Boys", "boxart": BoxArt)
*/
public class Kata4 {
    public static List<Map> execute() {
        List<MovieList> movieLists = DataUtil.getMovieLists();
        return movieLists.stream()
                .flatMap(peliculas -> peliculas.getVideos().stream()
                        .map(peli -> Map.of(
                                "id", peli.getId(),
                                "title", peli.getTitle(),
                                "box", peli.getBoxarts().stream()
                                        .filter(caja -> caja.getWidth() == 150 && caja.getHeight() == 200)
                                        .collect(Collectors.toList()))))
                .collect(Collectors.toList());
    }
}

