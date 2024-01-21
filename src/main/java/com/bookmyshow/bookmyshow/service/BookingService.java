package com.bookmyshow.bookmyshow.service;

import com.bookmyshow.bookmyshow.dto.BookShowRequestDto;
import com.bookmyshow.bookmyshow.dto.BookShowResponseDto;
import com.bookmyshow.bookmyshow.exceptions.ShowNotFound;
import com.bookmyshow.bookmyshow.exceptions.UserIsNotValid;
import com.bookmyshow.bookmyshow.model.*;
import com.bookmyshow.bookmyshow.repository.ShowRepository;
import com.bookmyshow.bookmyshow.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BookingService {
    private final String USER_NOT_FOUND = "User Is Invalid";
    private final String SHOW_NOT_FOUND = "Show Is Invalid";
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ShowRepository showRepository;

    public BookShowResponseDto bookShow(BookShowRequestDto request) {

        try {
            //Fetch User Details
            Optional<User> user = userRepository.findById(request.getUserId());
            if (!user.isPresent()) {
                throw new UserIsNotValid();
            }
            //Fetch show Details
            Optional<Show> show = showRepository.findById(request.getShowId());
            if (!show.isPresent()) {
                throw new ShowNotFound();
            }
            List<ShowSeat> reserveShowSeats = reserveShowSeats(request.getShowSeatIds());
            Booking booking = new Booking();
            booking.setAmount(priceCalculator(request.getShowSeatIds(), request.getShowId()));
            booking.setStatus(BookingStatus.PENDING);
            booking.setUser(user.get());
            booking.setPayments(new ArrayList<>());

            return new BookShowResponseDto(null, 0, ResponseStatus.SUCCESS, "Successfully Booked the Ticket");
        } catch (UserIsNotValid userIsNotValid) {
            return new BookShowResponseDto(null, 0, ResponseStatus.FAILURE, USER_NOT_FOUND);
        } catch (ShowNotFound showNotFound) {
            return new BookShowResponseDto(null, 0, ResponseStatus.FAILURE, SHOW_NOT_FOUND);
        }

    }

    private int priceCalculator(List<Long> showSeatIds, Long showId) {
        /*
        * 1.Get the show
        * 2.Get the Seats
        * 3.For seatIds we can find the seatType
        * 4.For the pair seatId and seatType->price
        * 5.sum all the prices
        * */
        return 1;
    }

    @Transactional(isolation = Isolation.SERIALIZABLE)
    public List<ShowSeat> reserveShowSeats(List<Long> showSeatIds) {

        //will implement the logic
        return null;
    }
}
