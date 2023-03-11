package tn.esprit.spring.skystation.demoo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "Skier")
@Getter
@Setter
public class Skier implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idSkier")
    private Long numSkier; //primary key
    private String FirstName;
    private String LastName;
    private Date DateofBirth;
    private String City;
    @ManyToMany(mappedBy = "skiers",cascade=CascadeType.ALL)
    private Set<Piste> pistes;
    //@OneToMany
  //  private Set<Course> courses;
}
