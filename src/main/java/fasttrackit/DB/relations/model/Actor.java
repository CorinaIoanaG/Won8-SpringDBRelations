package fasttrackit.DB.relations.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Actor {
    @Id
    @GeneratedValue
    private Integer id;
    @ManyToMany
    @JsonIgnore
    private List<Movie> movies;
    @Column
    private String name;
    @Column
    private int birthYear;

    public Actor(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;}
}
