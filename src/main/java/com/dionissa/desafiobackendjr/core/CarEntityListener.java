package com.dionissa.desafiobackendjr.core;

import java.util.Date;

import jakarta.persistence.PrePersist;

public class CarEntityListener {

    @PrePersist
    public void prePersist(Car car) {
        car.setCreatedDate(new Date());
    }

}
