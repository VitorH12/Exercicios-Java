import models.entities.Reservation;
import models.exceptions.DomainException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main(){
    Scanner sc = new Scanner(System.in);
    DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
     try {

         IO.println("Room number: ");
         int number = sc.nextInt();
         IO.println("Check-in date (dd/MM/yyyy)");
         LocalDate checkIn = LocalDate.parse(sc.next(), fmt1);
         IO.println("Check-out date (dd/MM/yyyy)");
         LocalDate checkOut = LocalDate.parse(sc.next(), fmt1);
         Reservation reservation = new Reservation(number, checkIn, checkOut);
         IO.println(reservation);

         IO.println();
         IO.println("Enter data to update the reservation:");
         IO.println("Check-in date (dd/MM/yyyy)");
         checkIn = LocalDate.parse(sc.next(), fmt1);
         IO.println("Check-out date (dd/MM/yyyy)");
         checkOut = LocalDate.parse(sc.next(), fmt1);

         reservation.updateDates(checkIn, checkOut);
     }
     catch (DateTimeException e){
         IO.println("Invalid date format");
     }
     catch (DomainException e){
         IO.println("Error in reservation: " + e.getMessage());
     }

}