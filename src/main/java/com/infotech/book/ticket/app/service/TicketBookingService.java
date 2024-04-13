package com.infotech.book.ticket.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotech.book.ticket.app.dao.TicketBookingDao;
import com.infotech.book.ticket.app.entities.Ticket;

import java.util.Optional;

@Service
public class TicketBookingService {

	@Autowired
	private TicketBookingDao ticketBookingDao;
	
	public Ticket createTicket(Ticket ticket) {
		return ticketBookingDao.save(ticket);
	}
	public Optional<Ticket> getTicketById(Integer ticketId) {
		return ticketBookingDao.findById(ticketId);
	}
	public Iterable<Ticket> getAllBookedTickets() {
		return ticketBookingDao.findAll();
	}
	public void deleteTicket(Integer ticketId) {
		ticketBookingDao.deleteById(ticketId);
	}
	public Ticket updateTicket(Integer ticketId, String newEmail) {
		Optional<Ticket> ticketFromDb = ticketBookingDao.findById(ticketId);
		ticketFromDb.get().setEmail(newEmail);
		Ticket upadedTicket = ticketBookingDao.save(ticketFromDb.orElse(null));
		return upadedTicket;
	}
	public Ticket getTicketByEmail(String email) {
		return ticketBookingDao.findByEmail(email);
	}
}
