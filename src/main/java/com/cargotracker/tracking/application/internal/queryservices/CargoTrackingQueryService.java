package com.cargotracker.tracking.application.internal.queryservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cargotracker.tracking.domain.model.aggregates.TrackingActivity;
import com.cargotracker.tracking.infrastructure.repositories.TrackingRepository;
import com.cargotracker.tracking.domain.model.entities.BookingId;

/**
 * Application Service which caters to all queries related to the Booking Bounded Context
 */
@Service
public class CargoTrackingQueryService {
	@Autowired 
    private TrackingRepository trackingRepository; // Inject Dependencies

    /**
     * Find a specific Cargo based on its Booking Id
     * @param bookingId
     * @return Cargo
     */
    public TrackingActivity find(String bookingId){
        return trackingRepository.findByBookingNumber(new BookingId(bookingId));
    }
}