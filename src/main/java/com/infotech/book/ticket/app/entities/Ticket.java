package com.infotech.book.ticket.app.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="ticket")
public class Ticket {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="ticket_id")
	private Integer ticketId;

	@Column(name="passenger_name",nullable=false)
	private String passengerName;

	@Column(name="booking_date",nullable=false)
	private Date bookingDate;

	@Column(name="source_station",nullable=false)
	private String sourceStation;

	@Column(name="dest_station",nullable=false)
	private String destStation;

	@Column(name="email",unique=true)
	private String email;
}
