package com.javacodegeeks.rest.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javacodegeeks.rest.model.Ticket;
 
@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {
 
}