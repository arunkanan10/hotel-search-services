package com.abc.hotel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "bookingDetails")
public class BookingDetail {

	@Id
    @GeneratedValue(generator = "account_generator")
    @SequenceGenerator(
            name = "account_generator",
            sequenceName = "account_id_seq",
            initialValue = 1000
    )
	private int id;
	
	@Column(columnDefinition = "date")
	private String date;
	
	@Column(columnDefinition = "roomId")
	private String roomId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getRoomId() {
		return roomId;
	}

	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
	
}
