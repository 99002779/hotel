package com.hotelapp.service;



import java.util.List;

import com.hotelapp.model.Hotel;

public interface HotelService {
	List<Hotel> getCuisine(String cuisine);
	List<Hotel> getHotelName(String hotelName);
	List<Hotel> getCity(String city);
	Hotel getHotelId(int hotelId);

}