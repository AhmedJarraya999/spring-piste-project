package tn.esprit.spring.skystation.demoo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "TPiste")
public class Piste implements Serializable {
    @Column(name="idPiste")
    @Id
    private Long numPiste;

    private String namePiste;

   @Enumerated(EnumType.STRING)
    private Color color;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Skier> skiers;
}
