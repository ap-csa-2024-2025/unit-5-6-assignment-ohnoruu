public class Plane
{
  // implement the Plane class here
  private int location;

  //Constructors
  public Plane(){
    this(0);
  }
  public Plane(int loc){
    if ((loc >= -2000) && (loc <= 2000)){
      location = loc;
    } else {
      location = 0;
    }
  }

  //movement
  public void upward(){
    if ((location+100) < 2000){
      location+=100;
    } else {
      System.out.println("Cannot move past 2000 feet");
    }
  }
  public void downward(){
    if ((location-100) > -2000){
      location-=100;
    } else {
      System.out.println("Cannot move past -2000 feet");
    }
  }
  
  //Get info
  public int getLocation(){
    return location;
  }
  public String toString(){
    String output = "";
    int numSpaces = Math.abs(-2000-location)/100;
    for (int i = 0; i<numSpaces; i++){
      output+=" ";
    }
    output+="@";
    return output;
  }

}
