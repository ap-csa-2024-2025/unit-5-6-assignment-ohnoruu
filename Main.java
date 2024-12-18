import java.util.Scanner;

public class Main
{
  public static void initDog(Dog iDog, String breed, String name, String color, double weight){
    iDog.setBreed(breed);
    iDog.setName(name);
    iDog.setColor(color);
    iDog.setWeight(weight);
  }

  public static void main(String[] args)
  {
    Dog d = new Dog("big red dog", "clifford", "red", 150000);
    Student s = new Student(12345, 11, "Bob");
    System.out.println(s.toString());

    // Uncomment and complete the code below to test your Plane class
    Scanner sc = new Scanner(System.in);
    String input = "";
    Plane p = new Plane(1000);
    while (!input.equals("q"))
    {
      System.out.println(p);
      System.out.println("Type \"u\" to move upwards, \"d\" to move downwards, \"n\" for new Plane, \"q\" to quit.");
      // System.out.println(print the plane's location and uncomment);
      input = sc.nextLine();

      if (input.equals("u"))
      {
        p.upward();
        System.out.println(p.toString());
        System.out.println(p.getLocation());
      }
      else if (input.equals("d"))
      {
        p.downward();
        System.out.println(p.toString());
        System.out.println(p.getLocation());
      }
      else if (input.equals("n"))
      {
        System.out.println("Starting location for a new plane?");
        int location = sc.nextInt();
        sc.nextLine(); // consume the ENTER key left behind by nextInt()
        p = new Plane(location);
        System.out.println(p.toString());
        System.out.println(p.getLocation());
      }
      else if (input.equals("q"))
      {
        System.out.println("Thank you for using plane simulator");
      }
      else
      {
        System.out.println("Invalid input");
      }
    }
  }
}
