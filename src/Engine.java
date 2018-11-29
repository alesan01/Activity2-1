import java.util.Date;

public interface Engine {

  //Create an interface Engine with the following list of public method definitions that return a
  // void:
  public void setEngineCylinders(int engineCylinders);

  public void setEngineManufacturedDate(Date date);

  public void setEngineManufacturer(String manufacturer);

  public void setEngineMake(String engineMake);

  public void setEngineModel(String engineModel);

  public void setDriveTrain(String driveTrain);

  public void setEngineType(String fuel);
}
