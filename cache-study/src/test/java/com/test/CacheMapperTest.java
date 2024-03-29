package com.test;

import com.study.cache.domain.Booking;
import com.study.cache.mapper.BookingMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CacheMapperTest {

    @Autowired
    private BookingMapper bookingMapper;

    @Test
    public void test() {
        List<Booking> bookingList = bookingMapper.listAllBooings() ;
        bookingList.forEach(System.out::println);
    }
}
