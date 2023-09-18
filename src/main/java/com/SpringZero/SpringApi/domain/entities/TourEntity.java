package com.SpringZero.SpringApi.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Entity(name = "tour")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class TourEntity  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(mappedBy = "tour",cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    private List<ReservationEntity> reservations;
    @OneToMany(mappedBy = "tour",cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    private List<TicketEntity>tickets;
    @ManyToOne
    @JoinColumn(name = "id_customer")
    private  CustomerEntity customer;


}
