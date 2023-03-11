package tn.esprit.spring.skystation.demoo.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "subscription")
public class Subscription implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "subID")
    private Long numSub;
    private Date startDate;
    private Date EndDate;
    private float Price;
    private TypeSubscription TypeSubscription;

}
