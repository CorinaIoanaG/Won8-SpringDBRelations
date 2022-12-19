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

public class Review {
    @Id
    @GeneratedValue
    private Integer id;
    @ManyToOne
    @JsonIgnore
    private Movie movie;
    @Column
    private String text;
    @Column
    private String reviewer;

    public Review(String text, String reviewer) {
        this.text = text;
        this.reviewer = reviewer;
    }
}
