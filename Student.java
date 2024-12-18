public class Student
{
  private int ID;
  private int grade;
  private String name;

  // Constructors
  public Student(int input_id, int input_grade, String input_name)
  {
    setID(input_id);
    setGrade(input_grade);
    setName(input_name);
  }

  public void setID(int id){
    this.ID = id;
  }
  public void setGrade(int grade){
    this.grade = grade;
  }
  public void setName(String name){
    this.name = name;
  }
  public String toString()
  {
    return "ID: " + ID + "\nName: " + name + "\nGrade: " + grade;
  }
}
