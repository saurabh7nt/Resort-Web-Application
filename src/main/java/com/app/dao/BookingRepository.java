package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Booking;

public interface BookingRepository extends JpaRepository<Booking, Integer> {

	List<Booking> findByDummy(Integer dummy);

}
