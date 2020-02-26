import java.util.ArrayList;
public class Throwers extends VernonTrack
{
  public Throwers()
  {
    super();
    System.out.println("Throwers Constructor");
}
  public void workout() {System.out.println("Workout: Throw twice and leave");}
  public void shoes() {System.out.println("Shoes: Super huge spikes");}
  public void equipment() {System.out.println("Equipment: shot/javelin/discus");}
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
      System.out.println("Thrower:" + roster.get(x));
    }
}
}
