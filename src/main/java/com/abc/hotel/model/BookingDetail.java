package com.abc.hotel.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

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
	
	@Column(columnDefinition = "hotelRoomId")
	private String hotelRoomId;

	@ManyToOne(optional=false)
	@JoinColumn(name="hotelRoomId", referencedColumnName="id", insertable = false, updatable = false)
	private Hotel hotel;

	@JsonIgnore
	@JsonProperty(value = "hotelRoomId")
	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

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

	public String getHotelRoomId() {
		return hotelRoomId;
	}

	public void setHotelRoomId(String hotelRoomId) {
		this.hotelRoomId = hotelRoomId;
	}
}
