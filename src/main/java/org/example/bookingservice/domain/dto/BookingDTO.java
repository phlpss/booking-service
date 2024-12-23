package org.example.bookingservice.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingDTO {
    private Long id;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String status;
    private Long userId;
    private Long carId;
}