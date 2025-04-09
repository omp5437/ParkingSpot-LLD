import java.util.ArrayList;
import java.util.List;

public class ParkingSpotManager {
    List<ParkingSpot> parkingSpots;
    public ParkingSpotManager(List<ParkingSpot> parkingSpots){
        this.parkingSpots=parkingSpots;
    }

    void parkVehicle(VehicleType type) {
        boolean flag=false;
        for(ParkingSpot spots:parkingSpots){
            synchronized (ParkingSpotManager.class) {
                if (spots.getType() == type && spots.isEmpty()) {
                    spots.setEmpty(false);
                    System.out.println("Your vehicle is parking Spot id is: " + spots.getId());
                    flag = true;
                    break;
                }
            }
        }
        if(!flag)
            System.out.println("No spots available for type: "+type);
    }

    void removeVehicle(int id){
        for(ParkingSpot spots:parkingSpots){
             if(spots.getId()==id) {
                 if (spots.isEmpty()) {
                     System.out.println("Wrong Input spot already empty");
                 } else {
                     spots.setEmpty(true);
                     System.out.println("Parking spot is set free");
                 }
                 break;
             }
        }


    }

    void AddSpots(int id,VehicleType type){

    }


}
