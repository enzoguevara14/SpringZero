package com.SpringZero.SpringApi.domain.repositories;

import com.SpringZero.SpringApi.domain.entities.FlyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlyRepository extends JpaRepository<FlyEntity,Long> {

}
