package fasttrackit.DB.relations.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@Entity
@NoArgsConstructor

public class Movie {
    @Id
    @GeneratedValue
    private Integer id;
    @Column
    private String name;
    @Column
    private int year;
    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JsonIgnore
    private MovieRating movieRating;
    @OneToMany(mappedBy = "movie", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JsonIgnore
    private List<Review> review;
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JsonIgnore
    private Studio studio;
    @ManyToMany(mappedBy = "movies",cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JsonIgnore
    private List<Actor> actors;
}
