package org.example.bookingservice.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public class CarDTO {
        private Long id;
        private String brand;
        private String model;
        private String category;
        private String location;
        private boolean available;
    }
