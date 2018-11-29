public class ExteriorFeature implements Feature {

  String exteriorFeature;

  //A public default constructor without parameters that sets the exteriorFeature instance variable.
  public ExteriorFeature() {
    exteriorFeature = "Generic";
  }

  //An overloaded constructor with the following value: A String with a parameter value of
  // exteriorFeature
  public ExteriorFeature(String exteriorFeature) {
    this.exteriorFeature = exteriorFeature;
  }

  @Override
  public String getFeature() {
    return this.exteriorFeature;
  }

  @Override
  public void setFeature(String exteriorFeature) {
    this.exteriorFeature = exteriorFeature;
  }

  public String toString() {
    return "Exterior [" + exteriorFeature + "]";
  }

  /**
   * Main method used to test default and overloaded constructor.
   */
  public static void main(String[] args) {
    ExteriorFeature one = new ExteriorFeature();
    ExteriorFeature two = new ExteriorFeature("Fog Lamps");
    System.out.println(one.toString());
    System.out.println(two.toString());
  }
}
