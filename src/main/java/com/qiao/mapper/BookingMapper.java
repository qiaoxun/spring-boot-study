package com.qiao.mapper;

import com.qiao.domain.cache.Booking;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BookingMapper {

    @Select("select * from saas_booking")
    List<Booking> listBookings();

}
