package coding.challenge.actor;

import coding.challenge.parking.ParkingLot;
import coding.challenge.parking.ParkingTicket;
import coding.challenge.vehicle.Vehicle;

public class ParkingSystem {

    private final String id;
    private final ParkingLot parkingLot;

    public ParkingSystem(String id, ParkingLot parkingLot) {
        this.id = id;
        this.parkingLot = parkingLot;
    }

    public ParkingTicket parkVehicle(Vehicle vehicle) {        
        return isFull() ? null : parkingLot.parkVehicle(vehicle);        
    }
    
    public void unparkVehicle(Vehicle vehicle) {}
    public void unparkVehicle(Vehicle vehicle, ParkingTicket parkingTicket) {}     

    public String getId() {
        return id;
    }        
    
    // if this flag is true then the parking system will 
    // show it by lighting a red bulb
    private boolean isFull() { return parkingLot.isFull(); }
}
