package fasttrackit.DB.relations.service;

import fasttrackit.DB.relations.model.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
        movieRepository = (MovieRepository) movieRepository.saveAll(getMovieRepository());
    }

    public List<Movie> getAll() {
        return movieRepository.findAll();
    }

    public List<Movie> getMovieRepository() {
        return movieRepository.saveAll(List.of(
                new Movie(1, "A", 2022, new MovieRating(9, "X"),
                        List.of(new  Review("abc","H"), new  Review("jkl","B")),
                        new Studio("XYZ", "def"), List.of(new Actor("A B", 1985), new Actor("G H", 1995))),
                new Movie(2, "B", 2019, new MovieRating(8, "Y"), List.of(new Review("mno", "E")),
                        new Studio("XYZ", "def"), List.of(new Actor("A B", 1985), new Actor("G H", 1995)))));
    }
}