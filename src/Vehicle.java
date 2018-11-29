import java.util.Date;

public class Vehicle implements Engine, Chassis {

  Date vehicleManufacturedDate;
  String vehicleManufacturer;
  String vehicleMake;
  String vehicleModel;
  Chassis vehicleFrame;
  String vehicleType;
  String driveTrain;
  Engine vehicleEngine;

  /**
   * default constructor sets everything to generic.
   */
  public Vehicle() {
    vehicleManufacturedDate = new Date();
    vehicleManufacturer = "Generic";
    vehicleMake = "Generic";
    vehicleModel = "Generic";
    this.vehicleFrame = new VehicleFrame();
    vehicleType = "Generic";
    driveTrain = "Generic";
    vehicleEngine = new ManufacturedEngine();
    this.vehicleEngine.setEngineType("Generic");

  }

  //Overloaded constructor

  /**
   * Overloaded Vehicle constructor.
   */
  public Vehicle(Date vehicleManufacturedDate, String vehicleManufacturer, String vehicleMake,
      String vehicleModel,
      Chassis vehicleFrame, String vehicleType, String driveTrain, Engine vehicleEngine) {

    this.vehicleManufacturedDate = vehicleManufacturedDate;
    this.vehicleManufacturer = vehicleManufacturer;
    this.vehicleMake = vehicleMake;
    this.vehicleModel = vehicleModel;
    this.vehicleFrame = vehicleFrame;
    this.vehicleType = vehicleType;
    this.driveTrain = driveTrain;
    this.vehicleEngine = vehicleEngine;
  }

  @Override
  public Chassis getChassisType() {
    return vehicleFrame;
  }

  @Override
  public void setChassisType(String vehicleChassis) {
    this.vehicleFrame.setChassisType(vehicleChassis);
  }

  @Override
  public void setEngineCylinders(int engineCylinders) {
    vehicleEngine.setEngineCylinders(engineCylinders);
  }

  @Override
  public void setEngineManufacturedDate(Date date) {
    vehicleEngine.setEngineManufacturedDate(date);
  }

  @Override
  public void setEngineManufacturer(String manufacturer) {
    vehicleEngine.setEngineManufacturer(manufacturer);
  }

  @Override
  public void setEngineMake(String engineMake) {
    vehicleEngine.setEngineMake(engineMake);
  }

  @Override
  public void setEngineModel(String engineModel) {
    vehicleEngine.setEngineModel(engineModel);
  }

  @Override
  public void setDriveTrain(String driveTrain) {
    vehicleEngine.setDriveTrain(driveTrain);
  }

  @Override
  public void setEngineType(String fuel) {
    vehicleEngine.setEngineType(fuel);
  }

  /**
   * toString function returns  vehicle information as a string.
   */
  public String toString() {
    return "Manufacturer Name   : " + vehicleManufacturer
        + "\nManufacturer Date   : " + vehicleManufacturedDate
        + "\nVehicle Make        : " + vehicleMake
        + "\nVehicle Model       : " + vehicleModel
        + "\nVehicle Type        : " + vehicleType
        + "\n" + vehicleEngine.toString();
  }

  /**
   * main method tests two scenarios.
   */
  public static void main(String[] args) {

    // Test default constructor and print
    Vehicle one = new Vehicle();
    System.out.println(one.toString());

    //Test overloaded constructor and print
    Vehicle two = new Vehicle(new Date(), "Honda", "Honda", "Prelude",
        new VehicleFrame("Unibody"), "null", "2WD: Two-Wheel Drive",
        new ManufacturedEngine("Honda", new Date(), "H-Series",
            "H23A1", "88 AKi", 4, "2WD: Two-Wheel Drive"));
    System.out.println(two.toString());
  }
}
