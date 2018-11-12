public class VehicleFrame implements Chassis {
    // Create a String named vehicleFrameType instance variable.
    public String vehicleFrameType;

    // A public default constructor

    public VehicleFrame() {
        this.vehicleFrameType = "Unibody";
    }

    // Overloaded constructor with the following value: A String with a parameter value of vehicleFrameType

    public VehicleFrame(String vehicleFrameType) {
        this.vehicleFrameType = vehicleFrameType;
    }

    //A public method named getChassisType that didn't have a formal parameter and that returns
// an instance of the interface Chassis
    @Override
    public Chassis getChassisType() {
        return this;
    }

    //A public method setChassisType that takes a String parameter vehicleFrameType and that returns a void.
// It should set the instance variable vehicleFrameType.
    @Override
    public void setChassisType(String vehicleFrameType) {
        this.vehicleFrameType = vehicleFrameType;
    }

    @Override
    public String toString() {
        return "Chassis : " + Chassis.chassis + "\n" +
                "Vehicle Frame : " + vehicleFrameType + "\n";
    }

    // Tests two scenarios
    public static void main(String[] args) {
        VehicleFrame one = new VehicleFrame();
        System.out.println(one.toString());
        VehicleFrame two = new VehicleFrame("Ladder Frame");
        System.out.println(two.toString());
    }
}

