package com.microservice.hotel.hotel.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.hotel.hotel.entities.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, String>{

}
