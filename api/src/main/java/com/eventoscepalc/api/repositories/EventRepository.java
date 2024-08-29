package com.eventoscepalc.api.repositories;

import com.eventoscepalc.api.domain.event.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EventRepository extends JpaRepository<Event, UUID> {
}
