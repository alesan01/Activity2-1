import java.util.Date;


public class ManufacturedEngine implements Engine {

    private String engineManufacturer;
    private Date engineManufacturedDate;
    private String engineMake;
    private String engineModel;
    private int engineCylinders;
    private String engineType;
    private String driveTrain;

    //  A public default constructor with no formal parameters and initialize all instance variables
// with generic literal values.

    public ManufacturedEngine() {
        engineManufacturer = "Generic";
        engineManufacturedDate = new Date();
        engineMake = "Generic";
        engineModel = "Generic";
        engineCylinders = 0;
        engineType = "85 AKI";
        driveTrain = "2WD: Two-Wheel Drive";
    }
    // A public overloaded constructor with values for all of the variables defined above

    public ManufacturedEngine(String engineManufacturer, Date engineManufacturedDate, String engineMake,
                              String engineModel, String engineType, int engineCylinders, String driveTrain) {
        this.engineManufacturer = engineManufacturer;
        this.engineManufacturedDate = new Date();
        this.engineMake = engineMake;
        this.engineModel = engineModel;
        this.engineCylinders = engineCylinders;
        this.engineType = engineType;
        this.driveTrain = driveTrain;
    }

    @Override
    public void setEngineCylinders(int engineCylinders) {
        this.engineCylinders = engineCylinders;
    }

    @Override
    public void setEngineManufacturedDate(Date date) {
        engineManufacturedDate = date;
    }

    @Override
    public void setEngineManufacturer(String manufacturer) {
        engineManufacturer = manufacturer;
    }

    @Override
    public void setEngineMake(String engineMake) {
        this.engineMake = engineMake;
    }

    @Override
    public void setEngineModel(String engineModel) {
        this.engineModel = engineModel;
    }

    @Override
    public void setDriveTrain(String driveTrain) {
        this.driveTrain = driveTrain;
    }

    @Override
    public void setEngineType(String fuel) {
        this.engineType = fuel;
    }


    public String toString() {
        return "Engine Manufacturer : " + engineManufacturer + "\n" +
                "Engine Manufactured : " + engineManufacturedDate + "\n" +
                "Engine Make         : " + engineMake + "\n" +
                "Engine Model        : " + engineModel + "\n" +
                "Engine Type         : " + engineType + "\n" +
                "Engine Cylinders    : " + engineCylinders + "\n" +
                "Drive Train         : " + driveTrain ;
    }

    //Write a static main method that tests two scenarios
    public static void main(String[] args) {
        //Tests default constructor and prints
        ManufacturedEngine engineOne = new ManufacturedEngine();
        System.out.println(engineOne.toString());

        //Tests overloaded constructor and prints
        ManufacturedEngine engineTwo = new ManufacturedEngine("Honda", new Date(), "H-series", "H23A1",
                 "88 AKI", 4,"2WD: Two-Wheel Drive");
        System.out.println(engineTwo.toString());
    }
}
