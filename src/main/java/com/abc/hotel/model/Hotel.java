package com.abc.hotel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "hotel")
public class Hotel {
	
	@Id
    @GeneratedValue(generator = "account_generator")
    @SequenceGenerator(
            name = "account_generator",
            sequenceName = "account_id_seq",
            initialValue = 1000
    )
	private int id;
	
	@Column(columnDefinition = "hotel_name")
	private String hotelName;
	
	@Column(columnDefinition = "room_num")
	private String roomNum;

	@Column(columnDefinition = "price")
	private String price;
	
	@Column(columnDefinition = "city")
	private String city;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
}
