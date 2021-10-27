package model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "auto")
@NamedQueries({
        @NamedQuery(
                name="findAllCars",
                query="SELECT p FROM Auto p"
        ),
})
public class Auto {

    @Id
    @Column(name = "auto_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToMany
    private List<Parcheggio> parcheggio;
    private final int postiOccupati = 2;
}
