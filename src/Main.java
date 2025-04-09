import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      List<ParkingSpot> parkingSpotList=new ArrayList<>();

      for(int i=0;i<5;++i){
          parkingSpotList.add(new ParkingSpot(i+1,VehicleType.TWOWHEELER));
      }
      for(int i=5;i<10;++i){
            parkingSpotList.add(new ParkingSpot(i+1,VehicleType.FOURWHEELER));
        }
      for(int i=10;i<15;++i){
            parkingSpotList.add(new ParkingSpot(i+1,VehicleType.TRUCK));
        }
      ParkingSpotManager parkingSpotManager=new ParkingSpotManager(parkingSpotList);
        while(true){
            Scanner sc=new Scanner(System.in);

            VehicleType vehicleType=null;
            System.out.println("Choose the option number:" +
                    "1. Park Vehicle "+" 2. Remove Vehicle");
            String option=sc.next();
            if(option.equals("1")){
            System.out.println("Please enter the vehicle type: ");
            String type=sc.next();
            boolean flag=false;
            if(type.equals("TWOWHEELER")){
                vehicleType=VehicleType.TWOWHEELER;
                flag=true;
            }
            else if(type.equals("FOURWHEELER")){
                vehicleType=VehicleType.TWOWHEELER;
                flag=true;
            }else if(type.equals("TRUCK")){
                vehicleType=VehicleType.TRUCK;
                flag=true;
            }else{
                System.out.println("Wrong Input");
            }
            if(flag)
            parkingSpotManager.parkVehicle(vehicleType);
            }else if(option.equals("2")){
                System.out.println("Please enter the spot id: ");
                int spotId= sc.nextInt();
                parkingSpotManager.removeVehicle(spotId);
            }else{
                System.out.println("Invalid input");
            }
        }

    }
}