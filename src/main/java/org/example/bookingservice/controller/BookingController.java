package org.example.bookingservice.controller;

import org.example.bookingservice.domain.dto.BookingDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Users can view their booking history.
 * Users can cancel a booking before a specified time limit.
 */
@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public ResponseEntity<BookingDTO> createBooking(@RequestBody BookingDTO bookingDTO) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<BookingDTO>> getUserBookings(@PathVariable Long userId) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @DeleteMapping("/cancel/{bookingId}")
    public ResponseEntity<String> cancelBooking(@PathVariable Long bookingId) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}