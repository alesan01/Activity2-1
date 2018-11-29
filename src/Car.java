//Alejandro Sanchez Padron
//11/18/2018

/* Class Car extends Class Vehicle, which includes everything that class Vehicle has and
adds Features and carAxle
 */

import java.util.ArrayList;
import java.util.Date;

public class Car extends Vehicle {

  private Feature[] featureList;
  private int carAxle;

  //A public default constructor with no formal parameters and initialize
  // all instance variables with generic literal values by using the super() call.

  /**
   * A public default constructor with no formal parameters and initialize all instance variables
   * with generic literal values by using the super() call.
   */
  public Car() {
    // Initialize vehicle.
    super();

    //Sets Features and axles
    Feature[] f = {new InteriorFeature("No Interior Features"),
        new ExteriorFeature("No Exterior Features")};
    this.featureList = f;
    this.carAxle = 2;
  }


  /**
   * A public overloaded constructor with a super() method call and instantiation of values for all
   * of the variables defined above.
   *
   * @param vehicleManufacturedDate date
   * @param vehicleManufacturer name of manufacturer
   * @param vehicleMake make
   * @param vehicleModel model
   * @param vehicleFrame frame
   * @param vehicleType type fo vehicle
   * @param driveTrain drive train
   * @param vehicleEngine vehicle engine
   * @param feature features of vehicle
   * @param carAxle car axle
   */
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
    featureList = feature;
    this.carAxle = carAxle;
  }

  /**
   * function creates a list of just exterior features and then returns them.
   *
   * @return exterior Features
   */
  public String getExteriorFeatures() {
    String list = "";

    // Read the features into a comma separated list.
    for (int i = 0; i < this.featureList.length; i++) {

      if (this.featureList[i] instanceof ExteriorFeature) {
        if (list.length() == 0) {
          list += this.featureList[i];
        } else {
          list += "\n" + this.featureList[i];
        }
      }

    }
    return list;
  }

  /**
   * function creates a list of just interior features and then returns them.
   *
   * @return interior Features
   */
  public String getInteriorFeatures() {
    String list = "";

    // Read the features into a comma separated list.
    for (int i = 0; i < this.featureList.length; i++) {

      if (this.featureList[i] instanceof InteriorFeature) {
        if (list.length() == 0) {
          list += this.featureList[i];
        } else {
          list += "\n" + this.featureList[i];
        }
      }

    }
    return list;
  }

  /**
   * to string function that returns the information of car as a string.
   *
   * @return String
   */
  public String toString() {

    getInteriorFeatures();
    getExteriorFeatures();
    return
        super.toString()
            + "\nFeatures: \n"
            + getInteriorFeatures() + "\n"
            + getExteriorFeatures() + "\n"
            + "Car Axle            : " + carAxle + "\n";

  }

  /**
   * driver function that creates objects of type car to test that everything is correct.
   */
  public static void main(String[] args) {
    //Test default constructor
    Car one = new Car();
    System.out.println(one.toString());

    // Test overloaded constructor
    //Create the features
    Feature[] features = {new InteriorFeature("AM/FM Radio"),
        new ExteriorFeature("Wood Panels"),
        new InteriorFeature("Air Conditioning"),
        new ExteriorFeature("Moonroof")};

    Car two = new Car(new Date(), "Honda", "Honda", "Prelude",
        new VehicleFrame("Unibody"), "null", "2WD: Two-Wheel Drive",
        new ManufacturedEngine("Honda", new Date(), "H-Series",
            "H23A1", "88 AKI", 4, "2WD: Two-Wheel Drive"), features, 2);
    System.out.println(two.toString());
  }
}










