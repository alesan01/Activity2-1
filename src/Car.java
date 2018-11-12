import java.util.Date;

public class Car extends Vehicle {

    private Feature[] feature = new Feature[10];
    private int carAxle;

    //A public default constructor with no formal parameters and initialize
// all instance variables with generic literal values by using the super() call.

    public Car() {
        // Initialize vehicle.
        super();

        //Sets Features and axles
        Feature[] f = {new InteriorFeature("No Interior Features")
                , new ExteriorFeature("No Exterior Features")};
        this.feature = f;
        this.carAxle = 2;
    }

    //A public overloaded constructor with a super() method call and instantiation of
// values for all of the variables defined above
    public Car(Date vehicleManufacturedDate,
               String vehicleManufacturer,
               String vehicleMake,
               String vehicleModel,
               Chassis vehicleFrame,
               String vehicleType,
               String driveTrain,
               Engine vehicleEngine,
               Feature[] feature,
               int carAxle) {

        // Initialize vehicle.
        super(vehicleManufacturedDate, vehicleManufacturer, vehicleMake, vehicleModel,
                vehicleFrame, vehicleType, driveTrain, vehicleEngine);

        this.feature = feature;
        this.carAxle = carAxle;
    }

    public String getExteriorFeatures() {
        String list = "";

// Read the features into a comma separated list.

        for (int i = 0; i < this.feature.length; i++) {

            if (this.feature[i] instanceof ExteriorFeature) {
                if (list.length() == 0) {
                    list += this.feature[i];
                } else {
                    list += "\n              : " + this.feature[i];
                }
            }

        }
        return list;
    }


    String getInteriorFeatures() {
        String list = "";

// Read the features into a comma separated list.

        for (int i = 0; i < this.feature.length; i++) {

            if (this.feature[i] instanceof InteriorFeature) {
                if (list.length() == 0) {
                    list += this.feature[i];
                } else {
                    list += "\n             : " + this.feature[i];
                }
            }

        }
        return list;
    }

    public String toString() {

        String list = "";
        // Read the features into a list.
        for (int i = 0; i < this.feature.length; i++) {
            if (list.length() == 0) {
                list += this.feature[i];
            } else {
                list += "                    : " + this.feature[i];
            }
        }
        return "Manufacturer Name   : " + vehicleManufacturer +
                "\nManufacturer Date   : " + vehicleManufacturedDate +
                "\nVehicle Make        : " + vehicleMake +
                "\nVehicle Model       : " + vehicleModel +
                "\nVehicle Type        : " + vehicleType +
                "\n" + vehicleEngine.toString() +
                "\nFeatures            : " + list +
                "Car Axle            : " + carAxle + "\n";

    }


    public static void main(String[] args) {
        //Test default constructor
        Car one = new Car();
        System.out.println(one.toString());

        // Test overloaded constructor
        //Create the features
        Feature[] features = {new InteriorFeature("AM/FM Radio")
                , new InteriorFeature("Air Conditioning")
                , new ExteriorFeature("Wood Panels")
                , new ExteriorFeature("Moonroof")};

        Car two = new Car(new Date(), "Honda", "Honda", "Prelude",
                new VehicleFrame("Unibody"), "null", "2WD: Two-Wheel Drive",
                new ManufacturedEngine("Honda", new Date(), "H-Series",
                        "H23A1", "88 AKI", 4, "2WD: Two-Wheel Drive"), features, 2);
        System.out.println(two.toString());
    }
}










