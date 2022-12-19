package fasttrackit.DB.relations.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class MovieRating {
    @Id
    @GeneratedValue
    private Integer id;
    @OneToOne(mappedBy = "movieRating")
    @JsonIgnore
    private Movie movie;
    @Column
    private int rating;
    @Column
    private String agency;

    public MovieRating(int rating, String agency) {
        this.rating = rating;
        this.agency = agency;
    }
}
