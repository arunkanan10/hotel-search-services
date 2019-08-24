package com.abc.hotel.repository;

import com.abc.hotel.dto.Request;
import com.abc.hotel.model.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class HotelSearchRepositoryimpl implements  HotelSearchRepository {

    @Autowired
    private EntityManager entityManager;

    public List<Hotel> search(Request request) {

        StringBuilder query = buildQuery(request);
        List<Hotel> hotelList = entityManager.createQuery(query.toString()).getResultList();

        return hotelList;
    }

    private StringBuilder buildQuery(Request request) {
        StringBuilder query = new StringBuilder("SELECT h FROM Hotel h WHERE ");

        if (request.getCity() != null && !"".equalsIgnoreCase(request.getCity())) {
            query.append(" h.city LIKE '" + request.getCity());
            query.append("' AND ");
        }

        if (request.getHotelName() != null && !"".equalsIgnoreCase(request.getHotelName())) {
            query.append(" h.hotelName LIKE '" + request.getHotelName());
            query.append("' AND ");
        }

        int lastIndex = query.lastIndexOf("AND");
        query.replace(lastIndex, lastIndex + 3, "");
        return query;
    }
}
