package com.study.cache.mapper;

import com.study.cache.domain.Booking;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BookingMapper {

    @Select("select * from saas_booking")
    public List<Booking> listAllBooings();

}
