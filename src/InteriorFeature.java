public class InteriorFeature implements Feature {

    String interiorFeature;

    //A public default constructor without parameters that sets the interiorFeature instance variable to “Generic”.
    public InteriorFeature() {
        interiorFeature = "Generic";
    }

    //An overloaded constructor : Set the interiorFeature instance variable to the parameter interiorFeature.
    public InteriorFeature(String interiorFeature) {
        this.interiorFeature = interiorFeature;
    }

    @Override
    public String getFeature() {
        return this.interiorFeature;
    }

    @Override
    public void setFeature(String interiorFeature) {
        this.interiorFeature = interiorFeature;
    }

    public String toString(){
        return "Interior ["+interiorFeature+"] \n";
    }

    //Main method used to test two scenarios
    public static void main(String[] args){
        InteriorFeature one = new InteriorFeature();
        InteriorFeature two = new InteriorFeature("Climate Control");
        System.out.println(one.toString());
        System.out.println(two.toString());
    }
}
