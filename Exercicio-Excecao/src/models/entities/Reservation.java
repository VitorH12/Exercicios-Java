package models.entities;

import models.exceptions.DomainException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Reservation {

    private Integer roomNumber;
    private LocalDate checkin;
    private LocalDate checkout;

    private static DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkOut) throws DomainException{
        if (!checkOut.isAfter(checkIn)){
            throw new DomainException("Check-out dates must be after check-in date");
        }
        this.roomNumber = roomNumber;
        this.checkin = checkIn;
        this.checkout = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDate getCheckin() {
        return checkin;
    }


    public LocalDate getCheckout() {
        return checkout;
    }

    public long duration(){
        long period = 0;
        period = ChronoUnit.DAYS.between(checkin, checkout);

        return period;
    }

    public void updateDates(LocalDate checkIn, LocalDate checkOut) throws DomainException {

        LocalDate now = LocalDate.now();

        if (checkIn.isBefore(now) || checkOut.isBefore(now)){
            throw new DomainException("Reservations dates for update must be future dates");
        }
        if (!checkOut.isAfter(checkIn)){
            throw new DomainException("Check-out dates must be after check-in date");
        }
        this.checkin = checkIn;
        this.checkout = checkOut;
    }
    @Override
    public String toString(){
        return "Room "
                + roomNumber
                + ", check-in: "
                + fmt1.format(checkin)
                + ", check-out"
                + fmt1.format(checkout)
                + ", " + duration()
                + " nights";
    }

}
