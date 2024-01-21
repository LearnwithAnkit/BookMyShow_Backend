package com.bookmyshow.bookmyshow.controller;

import com.bookmyshow.bookmyshow.dto.BookShowRequestDto;
import com.bookmyshow.bookmyshow.dto.BookShowResponseDto;
import com.bookmyshow.bookmyshow.exceptions.UserIsNotValid;
import com.bookmyshow.bookmyshow.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class BookingController {

    @Autowired
    private BookingService bookingService;
    @PostMapping("/bookShow")
    public BookShowResponseDto bookShow(BookShowRequestDto request)  {
        return bookingService.bookShow(request);
    }
}
