package com.SpringZero.SpringApi.domain.entities;

import com.SpringZero.SpringApi.util.AeroLine;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Entity(name = "fly")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class FlyEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double originLat;
    private Double originLng;
    private Double destinyLat;
    private Double destinyLng;
    @Column(length = 20)
    private String originName;
    @Column(length = 20)
    private String destinyName;
    private BigDecimal price;
    @Column(length = 20)
    @Enumerated(EnumType.STRING)
    private AeroLine aeroLine;
@OneToMany(mappedBy = "fly",cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    private List<TicketEntity> tickets;




}
