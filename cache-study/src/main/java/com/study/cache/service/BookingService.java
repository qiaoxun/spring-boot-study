package com.study.cache.service;

import com.study.cache.domain.Booking;
import com.study.cache.mapper.BookingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@CacheConfig(cacheNames = "booking")
public class BookingService {

    @Autowired
    private BookingMapper bookingMapper;

    @Cacheable(cacheNames = {"bookings", "bookings2"}, key = "#room.methodName+'['+#p0+']'")
    public List<Booking> listBookings(Long id, String name) {
        return bookingMapper.listAllBooings();
    }

    @Cacheable(cacheNames = {"bookings", "bookings2"}, keyGenerator = "myKeyGenerator")
    public List<Booking> listBookings1(Long id, String name) {
        return bookingMapper.listAllBooings();
    }

    @Cacheable(cacheNames = {"bookings", "bookings2"}, keyGenerator = "myKeyGenerator", condition = "#a0>1")
    public List<Booking> listBookings2(Long id, String name) {
        return bookingMapper.listAllBooings();
    }


    @Cacheable(cacheNames = {"bookings", "bookings2"}, key = "#a0", unless = "#id==1")
    public List<Booking> listBookings3(Long id, String name) {
        return bookingMapper.listAllBooings();
    }

    @Cacheable(cacheNames = "bookings", key = "#id")
    public Booking getBookingById(Long id) {
        System.out.println("getBookingById = " + id);
        Booking booking = new Booking();
        booking.setId(id);
        booking.setDuration(11.2);
        booking.setRemark("test " + id);
        return booking;
    }

    @CachePut(cacheNames = "bookings", key = "#result.id")
    public Booking updateBookingById(Long id, Double duration, String remark) {
        System.out.println("getBookingById = " + id + ", Double = " + duration + ", remark = " + remark);
        Booking booking = new Booking();
        booking.setId(id);
        booking.setDuration(duration);
        booking.setRemark(remark);
        return booking;
    }

    @CacheEvict(cacheNames = "bookings", key = "#id", allEntries = true)
    public void deleteBookingById(Long id) {
        System.out.println("删除了 " + id);
    }

    @Caching(
            cacheable = {
                    @Cacheable(cacheNames = "bookings", key = "#a0"/** #p0, #id, #root.args[0] */)
            },
            put = {
                    @CachePut(cacheNames = "bookings", key = "#result.duration"),
                    @CachePut(cacheNames = "bookings", key = "#result.remark")
            }
    )
    public Booking getBookingById2(Long id) {
        System.out.println("getBookingById = " + id);
        Booking booking = new Booking();
        booking.setId(id);
        booking.setDuration(11.2);
        booking.setRemark("test " + id);
        return booking;
    }


}
