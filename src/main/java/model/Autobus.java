package model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "autobus")
@NamedQueries({
        @NamedQuery(
                name="findAllCars",
                query="SELECT p FROM Autobus p"
        ),
})
public class Autobus {
    @Id
    @Column(name = "autobus_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "posti_occupati")
    private final int postiOccupati = 3;

    @ManyToMany
    private List<Parcheggio> parcheggio;
}
