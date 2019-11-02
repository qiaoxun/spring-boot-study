package com.study.cache.controller;

import com.study.cache.domain.Booking;
import com.study.cache.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cache")
public class CacheController {

    @Autowired
    private BookingService bookingService;

    @GetMapping("/listBookings")
    public List<Booking> listBookings() {
        return bookingService.listBookings();
    }

}
