package com.qiao.controller;

import com.qiao.domain.cache.Booking;
import com.qiao.mapper.BookingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("cache")
public class CacheTestController {

    @Autowired
    private BookingMapper bookingMapper;

    @GetMapping("/listBookings")
    public List<Booking> listBookings() {
        return bookingMapper.listBookings();
    }

}
