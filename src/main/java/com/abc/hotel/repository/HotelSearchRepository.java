package com.abc.hotel.repository;

import com.abc.hotel.dto.Request;
import com.abc.hotel.model.Hotel;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface HotelSearchRepository {
    List<Hotel> search(Request request);
}
