package com.study.cache.service;

import com.study.cache.domain.Booking;
import com.study.cache.mapper.BookingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
//@CacheConfig(cacheNames = "booking")
public class BookingService {

    @Autowired
    private BookingMapper bookingMapper;

    @Cacheable("bookings")
    public List<Booking> listBookings() {
        return bookingMapper.listAllBooings();
    }

}
