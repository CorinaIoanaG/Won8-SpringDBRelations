package fasttrackit.DB.relations.controller;

import fasttrackit.DB.relations.model.Movie;
import fasttrackit.DB.relations.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("movies") // http://host:port/movies

public class MovieController {
    private final MovieService movieService;

    @GetMapping
    public List<Movie> getAll(){
        return movieService.getAll();
    }
}
