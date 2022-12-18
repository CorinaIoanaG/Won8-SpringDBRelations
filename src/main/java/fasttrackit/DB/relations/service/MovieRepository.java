package fasttrackit.DB.relations.service;

import fasttrackit.DB.relations.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie,Integer> {
    List<MovieRepository> saveAll();
}
