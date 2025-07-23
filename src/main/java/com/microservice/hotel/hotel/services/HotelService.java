package com.microservice.hotel.hotel.services;

import java.util.List;

import com.microservice.hotel.hotel.entities.Hotel;

public interface HotelService {
	
	//create

    Hotel create(Hotel hotel);

    //get all
    List<Hotel> getAll();

    //get single
    Hotel get(String id);
}
