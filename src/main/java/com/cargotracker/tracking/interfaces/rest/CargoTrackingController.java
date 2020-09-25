package com.cargotracker.tracking.interfaces.rest;

import com.cargotracker.tracking.application.internal.queryservices.CargoTrackingQueryService;
import com.cargotracker.tracking.domain.model.aggregates.TrackingActivity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@Controller    // This means that this class is a Controller
@RequestMapping("/cargotracking")
public class CargoTrackingController {

    private CargoTrackingQueryService cargoTrackingQueryService;

    /**
     * Provide the dependencies
     * @param cargoTrackingQueryService
     */
    public CargoTrackingController(CargoTrackingQueryService cargoTrackingQueryService){
        this.cargoTrackingQueryService = cargoTrackingQueryService;
    }

    /**
     * GET method to retrieve all tracking events for a cargo
     * @param
     * @return
     */
    @GetMapping("/trackCargo")
    @ResponseBody
    public TrackingActivity trackCargo(@RequestParam("bookingId") String bookingId){
        return cargoTrackingQueryService.find(bookingId);
    }    
}
