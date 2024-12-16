public class Point2D
{
  // Fields / Attributes / Instance variables
  private int x;
  private int y;

  // Constructors
  public Point2D()
  {
    this(0, 0);
  }

  public Point2D(int x, int y)
  {
    this.x = x;
    this.y = y;
  }

  // Setters and getters
  public int getX()
  {
    return x;
  }

  public int getY()
  {
    return y;
  }

  public void setX(int x)
  {
    this.x = x;
  }

  public void setY(int y)
  {
    this.y = y;
  }

  // Additional methods
  public String toString()
  {
    return "(" + x = ", " + y + ")";
  }

  // Returns the distance from the origin to this point
  public double dist()
  {
    double diffX = x-0;
    double diffY = y-0;
    return Math.sqrt(Math.pow(diffX,2), + Math.pow(diffY,2));
  }

  // Overload of dist() method
  // Returns the distance from this point to Point2D other
  public double dist(Point2D other)
  {
    double diffX = x-other.getX();
    double diffY = y-other.getY();
    return Math.sqrt(Math.pow(diffX,2), + Math.pow(diffY,2));
  }
}
