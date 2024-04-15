package com.dionissa.desafiobackendjr.core;

import java.util.Date;

import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;

public class ClientEntityListener {

    @PrePersist
    public void prePersist(Client client) {
        client.setCreatedAt(new Date());
        client.setUpdatedAt(new Date());
    }

    @PreUpdate
    public void preUpdate(Client client) {
        client.setUpdatedAt(new Date());
    }

}
