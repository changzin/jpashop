package jpabook.jpashop.domain;

import javax.persistence.*;

@Entity
public class Delivery {
    @Id
    @GeneratedValue
    @Column(name = "DELIVERY_ID")
    private Long id;
    @OneToOne(mappedBy = "delivery")
    private Orders orders;
    private String city;
    private String street;
    private String zipcode;
    @Enumerated(EnumType.STRING)
    private DelliveryStatus status;
}
