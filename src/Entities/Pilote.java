package Entities;

public class Pilote {
    private int id;
    private String name;
    private int flightHours;
    
    public Pilote(int id, String name, int flightHours) {
        this.id = id;
        this.name = name;
        this.flightHours = flightHours;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getFlightHours() {
        return flightHours;
    }
    
    public void setFlightHours(int flightHours) {
        this.flightHours = flightHours;
    }
}