package model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "moto")
@NamedQueries({
        @NamedQuery(
                name="findAllMoto",
                query="SELECT p FROM Moto p"
        ),
})
public class Moto {
    @Id
    @Column(name = "moto_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToMany
    private List<Parcheggio> parcheggio;

    private final int postiOccupati = 1;

}
