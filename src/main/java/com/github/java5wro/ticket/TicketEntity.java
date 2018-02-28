package com.github.java5wro.ticket;

import com.github.java5wro.event.EventEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
@Entity
public class TicketEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull
    private String uuid;
    @NotNull
    @ManyToOne
    private EventEntity event;
    @NotNull
    private LocalDate purchaseDate;
    @NotNull
    private Long owner;

    protected TicketEntity() {
    }

    public TicketEntity(String uuid, EventEntity event, LocalDate purchaseDate, Long owner) {
        this.uuid = uuid;
        this.event = event;
        this.purchaseDate = purchaseDate;
        this.owner = owner;
    }

    public Long getId() {
        return id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public EventEntity getEvent() {
        return event;
    }

    public void setEvent(EventEntity event) {
        this.event = event;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Long getOwner() {
        return owner;
    }

    public void setOwner(Long owner) {
        this.owner = owner;
    }
}