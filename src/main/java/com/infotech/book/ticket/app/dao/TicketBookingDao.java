package com.infotech.book.ticket.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

import com.infotech.book.ticket.app.entities.Ticket;

public interface TicketBookingDao extends JpaRepository<Ticket, Integer>{
	Ticket findByEmail(String email);
}
