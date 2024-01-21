package com.bookmyshow.bookmyshow.dto;

import com.bookmyshow.bookmyshow.model.ResponseStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookShowResponseDto {
    private Long bookingId;
    private int amount;
    private ResponseStatus responseStatus;
    private String responseMessage;
}
