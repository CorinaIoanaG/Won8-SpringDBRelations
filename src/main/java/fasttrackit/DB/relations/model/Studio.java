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

public class Studio {
    @Id
    @GeneratedValue
    private Integer id;
    @OneToMany(mappedBy = "studio")
    @JsonIgnore
    private List<Movie> movies;
    @Column
    private String name;
    @Column
    private String address;

    public Studio(String name, String address) {
        this.name = name;
        this.address = address;
    }
}
