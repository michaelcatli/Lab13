import java.util.ArrayList;
public class FourHundredm<String> extends VernonTrack<String>
{
  public FourHundredm()
  {
    super();
    System.out.println("FourHundredm Constructor");
}
  public void workout() {System.out.println("Workout: Everybody complains");}
  public void shoes() {System.out.println("Shoes: solid plate or Bendy plate, a bit less spikes");}
  public void equipment() {System.out.println("Equipment: More track, blocks are optional but suggested, roller");}
  public void addStudent(String n) {roster.add(n);}

  public void removeStudent(String n){
    for (int x = 0; x<roster.size(); x++){
      if (roster.get(x) == n){
        roster.remove(x);
      }
    }
  }
  public void displayRoster(){
    for (int x = 0; x<roster.size(); x++){
      System.out.println("Four Hundred Meter:" + roster.get(x));
    }
  }
}
