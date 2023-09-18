package com.SpringZero.SpringApi.domain.repositories;

import com.SpringZero.SpringApi.domain.entities.HotelEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<HotelEntity,Long> {
}
