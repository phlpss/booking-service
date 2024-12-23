package org.example.bookingservice.controller;

import org.example.bookingservice.domain.dto.CarDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

/** Users should be able to search for available cars
 *  by location, dates in which its available, and categories (e.g., sedan, SUV, etc.).
 */

@RestController
@RequestMapping("/api/cars")
public class CarController {

    @GetMapping("/search")
    public ResponseEntity<List<CarDTO>> searchCars(@RequestParam String location,
                                                   @RequestParam String category,
                                                   @RequestParam LocalDateTime startDate,
                                                   @RequestParam LocalDateTime endDate) {
        // Endpoint to search for available cars based on criteria
        throw new UnsupportedOperationException("Not supported yet.");
    }
}