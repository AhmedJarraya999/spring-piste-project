package tn.esprit.spring.skystation.demoo.entity;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import java.io.Serializable;

public class Course implements Serializable {
    private Long numCourse ;

    @Enumerated(EnumType.STRING)
    private TypeCourse TypeCourse;

    @Enumerated(EnumType.STRING)
    private Support Support;
    private int level;
    private int timeSlot;
    private float price;
    @ManyToOne
    Skier skier;
}
