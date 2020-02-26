import java.util.ArrayList;
public class Jumpers extends VernonTrack
{
  public Jumpers()
  {
    super();
    System.out.println("Jumpers Constructor");
}
  public void workout(){System.out.println("Workout: Basically jump twice and you're done");}
  public void shoes() {System.out.println("Shoes: Solid plate, more spikes");}
  public void equipment() {System.out.println("Equipment: Pit, Rake, Tape measure, roller, chalk");}
  public void addStudent(String n){roster.add(n);}
  public void removeStudent(String n){
    for (int x = 0; x<roster.size(); x++){
      if (roster.get(x) == n){
        roster.remove(x);
      }
    }
  }
  public void displayRoster(){
    for (int x = 0; x<roster.size(); x++){
      System.out.println("Jumper:" + roster.get(x));
    }
}
}
