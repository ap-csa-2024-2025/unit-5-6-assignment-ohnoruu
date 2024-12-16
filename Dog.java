public class Dog
{
  private String breed;
  private double weight;
  private String name;
  private String color;

  //Constructors
  public Dog(){
    breed = "dawg";
    name = "zawg";
    color = "black";
    weight = 1;
  }
  public Dog(String iBreed, String iName, String iColor, double iWeight){
    breed = iBreed;
    name = iName;
    color = iColor;
    weight = iWeight;
  }
  public Dog(String iBreed, String iName){
    breed = iBreed;
    name = iName;
    color = "black";
    weight = 100;
  }

  // Make setters
  public void setBreed(String iBreed)
  {
    breed = iBreed;
  }
  public void setWeight(double iWeight){
    weight = iWeight;
  }
  public void setName(String iName){
    name = iName;
  }
  public void setColor(String iColor){
    color = iColor;
  }

  // Make getters
  public String getBreed()
  {
    return breed;
  }
  public double getWeight(){
    return weight;
  }
  public String getName(){
    return name;
  }
  public String getColor(){
    return color;
  }
}
