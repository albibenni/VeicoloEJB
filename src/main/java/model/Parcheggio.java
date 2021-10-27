package model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "parcheggio")
@NamedQueries({
        @NamedQuery(
                name="findAllParcheggi",
                query="SELECT p FROM Parcheggio p"
        ),
})
public class Parcheggio {
    @Id
    @Column(name = "parcheggio_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToMany
    private List<Auto> auto;
    @ManyToMany
    private List<Moto> moto;
    @ManyToMany
    private List<Autobus> autobus;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPosti() {
        return posti;
    }

    public void setPosti(int posti) {
        this.posti = posti;
    }

    @Column(name = "posti_liberi")
    private int posti;
}
