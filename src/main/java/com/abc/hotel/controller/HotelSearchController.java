package com.abc.hotel.controller;

import com.abc.hotel.dto.Request;
import com.abc.hotel.model.Hotel;
import com.abc.hotel.repository.HotelSearchRepository;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class HotelSearchController {

	@Autowired
	HotelSearchRepository hotelSearchRepository;
	
    public HotelSearchController() {
    }

    @PostMapping("/room/search")
    public List<Hotel> inboundSMSService(@RequestBody Request request) {
        
    	try {
    		
    		List<Hotel> hotelList = hotelSearchRepository.search(request);
    		return hotelList;
        } catch (Exception e) {
        	throw e;
        }
    }
    
}
