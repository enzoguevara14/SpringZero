package com.SpringZero.SpringApi.domain.entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

@Entity(name = "hotel")
public class HotelEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50)
    private String name;
    @Column(length = 50)
    private String address;
    private Integer rating;
    private BigDecimal price;
    @OneToMany(mappedBy = "hotel",cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    private List<ReservationEntity> reservations;

}
