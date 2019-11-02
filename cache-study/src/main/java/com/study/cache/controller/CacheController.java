package com.study.cache.controller;

import com.study.cache.domain.Booking;
import com.study.cache.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cache")
public class CacheController {

    @Autowired
    private BookingService bookingService;

    @GetMapping("/listBookings/{id}")
    public List<Booking> listBookings(@PathVariable Long id) {
        return bookingService.listBookings1(id, "test");
    }

    @GetMapping("/getBookingById/{id}")
    public Booking getBookingById(@PathVariable Long id) {
        return bookingService.getBookingById(id);
    }

    @GetMapping("/updateBooking/{id}")
    public Booking updateBooking(@PathVariable Long id, Double duration, String remark) {
        return bookingService.updateBookingById(id, duration, remark);
    }

}
