package Program;

import Entities.Passenger;

public class Booking {
	private static int counter = 0;
	private final int bookingNb;
	private final Passenger passenger;
	private final Flight flight;
	private String status;

	public Booking(int bookingNb, Passenger passenger, Flight flight, String status) {
		super();
		this.bookingNb = counter++;
		this.passenger = passenger;
		this.flight = flight;
		this.status = status;
	}

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		Booking.counter = counter;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getBookingNb() {
		return bookingNb;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public Flight getFlight() {
		return flight;
	}

}