public class ParkingSpot {
   private int id;
   private VehicleType type;
   private boolean empty;
    public ParkingSpot(int id,VehicleType type){
        this.id=id;
        this.type=type;
        this.empty=true;
    }

    public int getId() {
        return id;
    }

    public VehicleType getType() {
        return type;
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }
}
