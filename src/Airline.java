import java.util.Scanner;

import Entities.Passenger;
import Entities.Pilote;
import Entities.Plane;
import Program.Booking;
import Program.Flight;

public class Airline {
	//Polymorphisme
	public static void information(Plane plane) {
		System.out.println(plane.getBrand()+" "+plane.getModel()+" "+plane.getYear()+" "+plane.getCapacity());	  
	}
	
	public static void information(Pilote pilote) {
		 System.out.println(pilote.getName()+" "+pilote.getId()+" "+ pilote.getFlightHours());	  
	}
	public static void information(Passenger passenger) {
		System.out.println(passenger.getName()+" "+passenger.getSurname()+" "+passenger.getPssportNb()+" "+passenger.getFlightId()+" "+passenger.getEmail()+" "+passenger.getPhone());
	}
	public static void information (Flight flight) {
		System.out.println(flight.getFlightId()+" in "+flight.getDate()+" frome "+flight.getArvCity()+" to "+flight.getDepCity());
	}
	
 

	public static void main(String[] args) {
		//Pilot
		   Scanner rdr=new Scanner(System.in);
		   System.out.println("Enter information(id,  name,  flightHours)  of the first Pilot");
		   System.out.print("Name :");String name=rdr.nextLine();
		   System.out.print("id:");  int id=rdr.nextInt();
		   System.out.print("flight Hours :"); int flightHours= rdr.nextInt();
		 
		   Pilote pilote=new Pilote(id,name,flightHours);
		   
		   System.out.println("Enter information(id,  name,  flightHours)  of the second Pilot");
		   System.out.print("Name : ");
		   String name2=rdr.nextLine();
		   rdr.nextLine();
		   System.out.print("id: "); int id2=rdr.nextInt();
		   System.out.print("flight Hours : ");int flightHours2= rdr.nextInt();
		 
		   Pilote pilote2=new Pilote(id2,name2,flightHours2);
		
//**************************************************************************************************
		   //Plane
		   System.out.println("Enter information(brand,  model, year  , capacity)  of the first Plant");
		   System.out.print("Brand : ");String brand=rdr.nextLine();rdr.nextLine();
		   System.out.print("Model : ");String model=rdr.nextLine();
		   System.out.print("Year : ");int year=rdr.nextInt();  
		   System.out.print("Capacity : ");int capacity=rdr.nextInt();
		   
		   Plane plane=new Plane(brand,model,year,capacity);
		  
		   System.out.println("Enter information(brand,  model, year  , capacity)  of the Second Plant");
		   System.out.print("Brand : ");String brand2=rdr.nextLine();rdr.nextLine();
		   System.out.print("Model : ");String model2=rdr.nextLine();
		   System.out.print("Year : ");int year2=rdr.nextInt();
		   System.out.print("Capacity : ");int capacity2=rdr.nextInt();
		   
		   Plane plane2=new Plane(brand2,model2,year2,capacity2);
//*******************************************************************************************************************
		   //Passenger
		  System.out.println("Enter information (flightId,passporeNb,name,surname,email,phone) of the first passenger");
		  System.out.print("Flight Id : ");String flightid=rdr.nextLine();rdr.nextLine();
		  System.out.print("name : ");String namep=rdr.nextLine();  
		  System.out.print("surname : ");String surname=rdr.nextLine(); 
		  System.out.print("Email : ");String email=rdr.nextLine();
		  System.out.print("Phone : ");String phone=rdr.nextLine();
		  System.out.print("Passpore Nuntmber: ");int passpornb=rdr.nextInt();
		  
		  Passenger passenger;
		  if (email.isEmpty() && phone.isEmpty()) {
		      passenger = new Passenger(flightid,passpornb, namep, surname);
		  } else {
		      passenger = new Passenger(flightid,passpornb,namep,surname, email, phone);
		  }

		  System.out.println("Enter information (flightId,passporeNb,name,surname,email,phone) of the Second passenger");
		  System.out.print("Flight Id : ");String flightid2=rdr.nextLine();rdr.nextLine();
		  System.out.print("name : ");String namep2=rdr.nextLine();  
		  System.out.print("surname : ");String surname2=rdr.nextLine(); 
		  System.out.print("Email : ");String email2=rdr.nextLine();
		  System.out.print("Phone : ");String phone2=rdr.nextLine();
		  System.out.print("Passpore Number: ");int passpornb2=rdr.nextInt();
		  
		  Passenger passenger2;
		  if (email2.isEmpty() && phone2.isEmpty()) {
		      passenger2 = new Passenger(flightid2,passpornb2, namep2, surname2);
		  } else {
		      passenger2 = new Passenger(flightid2,passpornb2,namep2,surname2, email2, phone2);
		  }
		  
		  System.out.println("Enter information (flightId,passporeNb,name,surname,email,phone) of the therd passenger");
		  System.out.print("Flight Id : ");String flightid3=rdr.nextLine();rdr.nextLine();
		  System.out.print("name : ");String namep3=rdr.nextLine();  
		  System.out.print("surname : ");String surname3=rdr.nextLine(); 
		  System.out.print("Email : ");String email3=rdr.nextLine();
		  System.out.print("Phone : ");String phone3=rdr.nextLine();
		  System.out.print("Passpore Number: ");int passpornb3=rdr.nextInt();
		  
		  Passenger passenger3;
		  if (email3.isEmpty() && phone3.isEmpty()) {
		      passenger3 = new Passenger(flightid3,passpornb3, namep3, surname3);
		  } else {
		      passenger3 = new Passenger(flightid3,passpornb3,namep3,surname3, email3, phone3);
		  }
		  
		  System.out.println("Enter information (flightId,passporeNb,name,surname,email,phone) of the fourth passenger");
		  System.out.print("Flight Id : ");String  flightid4=rdr.nextLine();rdr.nextLine();
		  System.out.print("name : ");String namep4=rdr.nextLine();  
		  System.out.print("surname : ");String surname4=rdr.nextLine(); 
		  System.out.print("Email : ");String email4=rdr.nextLine();
		  System.out.print("Phone : ");String phone4=rdr.nextLine();
		  System.out.print("Passpore Number: ");int passpornb4=rdr.nextInt();
		  
		  Passenger passenger4;
		  if (email4.isEmpty() && phone4.isEmpty()) {
		      passenger4 = new Passenger(flightid4,passpornb4, namep4, surname4);
		  } else {
		      passenger4 = new Passenger(flightid4,passpornb4,namep4,surname4, email4, phone4);
		  }
		  
/*****************************************************************************************************/
		  //Flight
		   System.out.println("Enter First Flight Information:");
	        System.out.print("Flight 1 ID : ");String flightId1 = rdr.nextLine();rdr.nextLine();
	        System.out.print("Departure City : ");String depCity1 = rdr.nextLine();
	        System.out.print("Arrival City : ");String arvCity1 = rdr.nextLine();
	        System.out.print("Flight Date (YYYY-MM-DD): ");String date1 = rdr.nextLine();
	        Flight flight1 = new Flight(pilote,plane,flightId1,depCity1, arvCity1,date1);
		  
	        System.out.println("Enter Seconde Flight Information:");
	        System.out.print("Flight 2 ID: ");String flightId2 = rdr.nextLine();
	        System.out.print("Departure City: ");String depCity2 = rdr.nextLine();
	        System.out.print("Arrival City: ");String arvCity2 = rdr.nextLine();
	        System.out.print("Flight Date (YYYY-MM-DD): ");String date2 = rdr.nextLine();
	        Flight flight2 = new Flight(pilote2,plane2,flightId2,depCity2, arvCity2,date2);
	        
	        System.out.println("Enter First Flight Information:");
	        System.out.print("Flight 3 ID: ");String flightId3 = rdr.nextLine();rdr.nextLine();
	        System.out.print("Departure City: ");String depCity3 = rdr.nextLine();
	        System.out.print("Arrival City: ");String arvCity3 = rdr.nextLine();
	        System.out.print("Flight Date (YYYY-MM-DD): ");String date3 = rdr.nextLine();
	        Flight flight3 = new Flight(pilote,plane,flightId3,depCity3, arvCity3,date3);
		  
/***************************************************************************************/		  
		  //Booking 
	           Booking booking1=new Booking(0, passenger,flight1,"confirmed");
	        System.out.println("\nDo you want to cancel the booking 1? (yes/no): ");
	        String cancel =rdr.nextLine();
	        if(cancel.equalsIgnoreCase("yes")) {
	        	booking1.setStatus("Cancelled");
	        	System.out.println("Booking number "+ booking1.getBookingNb() + " has benn cancelled.");
	        }else {
	        	System.out.println("Booking remains confirmed.");
	        System.out.println("\nBooking created successfully:");
	        System.out.println("Booking Number: " + booking1.getBookingNb());
	        System.out.println("Passenger: " + passenger.getName() + " " + passenger.getSurname());
	        System.out.println("Flight: " + flight1.getFlightId() + " from " + flight1.getDepCity() + " to " + flight1.getArvCity());
	        
	     }
	        
	        
	        Booking booking2=new Booking(0, passenger2,flight2,"confirmed");
	        System.out.println("\nDo you want to cancel the booking 2? (yes/no): ");
	        cancel =rdr.nextLine();
	        if(cancel.equalsIgnoreCase("yes")) {
	        	booking2.setStatus("Cancelled");
	        	System.out.println("Booking number "+ booking2.getBookingNb() + " has benn cancelled.");
	        }else {
	        	System.out.println("Booking remains confirmed.");
	        System.out.println("\nBooking created successfully:");
	        System.out.println("Booking Number: " + booking2.getBookingNb());
	        System.out.println("Passenger: " + passenger2.getName() + " " + passenger2.getSurname());
	        System.out.println("Flight: " + flight2.getFlightId() + " from " + flight2.getDepCity() + " to " + flight2.getArvCity());
	        
	       }
	        
	        
	        Booking booking3=new Booking(0, passenger3,flight3,"confirmed");
	        System.out.println("\nDo you want to cancel the booking 3? (yes/no): ");
	        cancel =rdr.nextLine();
	        if(cancel.equalsIgnoreCase("yes")) {
	        	booking3.setStatus("Cancelled");
	        	System.out.println("Booking number "+ booking3.getBookingNb() + " has benn cancelled.");
	        }else {
	        	System.out.println("Booking remains confirmed.");
	        System.out.println("\nBooking created successfully:");
	        System.out.println("Booking Number: " + booking3.getBookingNb());
	        System.out.println("Passenger: " + passenger3.getName() + " " + passenger3.getSurname());
	        System.out.println("Flight: " + flight3.getFlightId() + " from " + flight3.getDepCity() + " to " + flight3.getArvCity());
	           }
	   
	     // Display total passengers and flights
	        System.out.println("Total passengers: 4");
	        System.out.println("passenger1");
	        Airline.information(passenger);
	        System.out.println("passenger2");
	        Airline.information(passenger2);
	        System.out.println("passenger3");
	        Airline.information(passenger3);
	        System.out.println("passenger4");
	        Airline.information(passenger4);
	        
	        System.out.println("Total flights: 3");
	        Airline.information(flight1);
	        Airline.information(flight2);
	        Airline.information(flight3);
	     /*-----------------------------------------------------*/
		   rdr.close();

	}

}