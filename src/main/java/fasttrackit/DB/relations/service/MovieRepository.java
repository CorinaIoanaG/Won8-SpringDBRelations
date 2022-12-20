package fasttrackit.DB.relations.service;

import fasttrackit.DB.relations.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {
   // La Query am eroare.
    @Query("select m from Movie m " +
            "join MovieRating mv on mv.id = m.movieRating_id"+
            "join Review r on r.movie_id = m.review_id" +
            "join Studio s on s.id = m.studio_id" +
            "join Actor a on a.id = m.actors_id")
    List<Movie> findAllMoviesInfos();
}
