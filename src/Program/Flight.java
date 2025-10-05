package Program;

import Entities.Pilote;
import Entities.Plane;

public class Flight {
	private Pilote pilote;
	private Plane plane;
	private final String flightId;
	private String depCity;
	private String arvCity;
	private String date;

	public Flight(Pilote pilote, Plane plane, String flightId, String depCity, String arvCity, String date) {
		super();
		this.pilote = pilote;
		this.plane = plane;
		this.flightId = flightId;
		this.depCity = depCity;
		this.arvCity = arvCity;
		this.date = date;
	}

	public Pilote getPilote() {
		return pilote;
	}

	public void setPilote(Pilote pilote) {
		this.pilote = pilote;
	}

	public Plane getPlane() {
		return plane;
	}

	public void setPlane(Plane plane) {
		this.plane = plane;
	}

	public String getDepCity() {
		return depCity;
	}

	public void setDepCity(String depCity) {
		this.depCity = depCity;
	}

	public String getArvCity() {
		return arvCity;
	}

	public void setArvCity(String arvCity) {
		this.arvCity = arvCity;
	}

	public String getFlightId() {
		return flightId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}