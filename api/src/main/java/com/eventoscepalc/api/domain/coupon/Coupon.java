package com.eventoscepalc.api.domain.coupon;


import com.eventoscepalc.api.domain.event.Event;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "coupon")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Coupon {
    @Id
    @GeneratedValue
    private UUID id;

    private Integer discount;

    private Date valid;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

}
