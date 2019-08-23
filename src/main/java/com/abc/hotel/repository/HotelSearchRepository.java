package com.abc.hotel.repository;

import com.abc.hotel.model.Hotel;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelSearchRepository extends JpaRepository<Hotel, Long> {
    Hotel findByRoomNum(String roomNum);
    
    @Query("SELECT h FROM Hotel h WHERE ((:city is null and h.city is null) or h.city = :city) "
    		+ " AND ((:hotelName is null and h.hotelName is null) or h.hotelName = :hotelName)"
    		+ " ")
    List<Hotel> search(@Param("city") String city, 
    						@Param("hotelName") String hotelName);
}
