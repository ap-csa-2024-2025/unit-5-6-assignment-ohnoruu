public class Dog
{
  private String breed;
  private double weight;
  private String name;
  private String color;

  //Constructors
  public Dog(){
    this("dawg", "zawg", "black", 1);
  }
  
  public Dog(String iBreed, String iName, String iColor, double iWeight){
    breed = iBreed;
    name = iName;
    color = iColor;
    setWeight(iWeight);
  }
  public Dog(String iBreed, String iName){
    breed = iBreed;
    name = iName;
    color = "black";
    weight = 100;
  }

  // Make setters
  public void setBreed(String breed)
  {
    this.breed = breed;
  }
  public void setWeight(double iWeight){
    if (iWeight < 0){
      weight = 0;
    } else {
      weight = iWeight;
    }
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
